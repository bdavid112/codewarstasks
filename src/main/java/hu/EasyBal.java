package hu;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class EasyBal {
  private static final DecimalFormat df = new DecimalFormat("0.00");

  public static String balance(String book) {
    double actualBalance = 0;
    String result = "";
    book = book.replaceAll("\\p{Punct}", "");
    String[] lines = book.split("\n");
    List<Double> expenses = new ArrayList<>();
    for (String line : lines) {
      if (!line.contains(" ")) {
        result += "Original Balance: " + formatExpense(line) + "\n";
        actualBalance = Double.parseDouble(formatExpense(line));
      } else {
        String expenseString = line.substring(line.lastIndexOf(" "));
        expenses.add(Double.parseDouble(formatExpense(expenseString)));
        actualBalance -= Double.parseDouble(formatExpense(expenseString));
        result += line.substring(0, line.lastIndexOf(" ")) + formatExpense(expenseString) +
            " Balance " + df.format(actualBalance) + "\n";
      }
    }
    double totalExpense = expenses.stream()
        .mapToDouble(Double::doubleValue)
        .sum();
    OptionalDouble averageExpense = expenses.stream()
        .mapToDouble(Double::doubleValue)
        .average();
    double averageExpenseDouble = averageExpense.isPresent() ? averageExpense.getAsDouble() : 0;
    result += "Total expense  " + df.format(totalExpense) + "\n" + "Average expense  " + df.format(averageExpenseDouble);
    return result.replaceAll(",", ".");
  }

  private static String formatExpense(String expenseString) {
    String whole = expenseString.substring(0, expenseString.length() - 2);
    String fraction = expenseString.substring(expenseString.length() - 2);
    return whole + "." + fraction;
  }
}
