package example;

public class CheckBalanceBrackets {

	public static void main(String[] args) {
		String test = "AAA((AAA)){[]}(oxxoo)()";
		System.out.println(checkBalance(test));
	}

	static boolean checkBalance(String inputString){

		boolean result = false;
		char[] inputCharArray = inputString.toCharArray();
		int index = 0;
		for (char tmp : inputCharArray) {
			if (tmp == '(')
			{
				result = findClosingBracket(inputCharArray, index, ')');
			}
			else if(tmp == '[')
			{
				result = findClosingBracket(inputCharArray, index, ']');

			}
			else if (tmp == '{')
			{
				result = findClosingBracket(inputCharArray, index, '}');

			}
			index++;
		}

		return result;

	}

	private static boolean findClosingBracket(char[] a, int i, char bracket) {
		boolean foundClosing = false;
		for (int j = i + 1 ; j < a.length ; j++)
		{
			if (a[j] == bracket) 
			{
				foundClosing = true;
				break;
			}
			else
			{
				foundClosing = false;
			} 

		}

		return foundClosing;
	}

}
