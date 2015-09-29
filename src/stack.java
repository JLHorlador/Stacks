public class stack {
	private Integer index = 0;
	private Integer[] myStack = new Integer[2];
	
	public void push(int variable)
	{
		if (index + 1 > myStack.length)
			resize("UP");
		myStack[index] = variable;
		//System.out.println("Pushed: " + variable + " in index: " + index);
		if (index != myStack.length)
			index++;
	}
	
	public int pop()
	{
		//System.out.println("Popped: " + valueTaken + " from index: " + (index - 1));
		if (index + 1 <= (myStack.length / 4) * 3)
			resize("DOWN");
		index--;
		return index+1;
	}
	
	public int peek()
	{
		//int value = myStack[index - 1];
		//System.out.println(value + " is on top of the stack at index: " + (index - 1));
		//for(int i = 0; i < myStack.length; i++)
			//System.out.println("myStack[" + i + "] = " + myStack[i]);
		return myStack[index - 1];
	}
	
	public boolean empty()
	{
		if (index == 0)
		{
			if (index < 0)
				index = 0;
			return true;
		}
		else
			return false;
			
	}
	
	private void resize(String stringValue)
	{
		if (stringValue.equals("UP"))
		{
			Integer[] newArray = new Integer[myStack.length * 2];
		
			for (int i = 0; i < myStack.length; i++)
			{
				newArray[i] = myStack[i];
				if (i > myStack.length)
					newArray[i] = null;
			}
		
			myStack = new Integer[newArray.length];
		
			for (int i = 0; i < newArray.length; i++)
			{
				myStack[i] = newArray[i];
			}
		}
		else if (stringValue.equals("DOWN"))
		{
			Integer[] newArray = new Integer[myStack.length / 2];
			
			for (int i = 0; i < newArray.length; i++)
			{
				newArray[i] = myStack[i];
				//System.out.println("newArray[" + i + "] = " + newArray[i]);
			}
			
			myStack = new Integer[newArray.length];
			
			for (int i = 0; i < newArray.length; i++)
				myStack[i] = newArray[i];
			
			index = myStack.length;
		}
	}
}
