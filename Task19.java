package by.ld.unit02.main;

public class Task19 {

	public static void main(String[] args) {
		int i = 0;
		char j = (char) i;
			
		for (i = 32; i < 127; i++) 
		{
			j = (char) i;
			System.out.print(" |числовое значение>| " + i);
			System.out.print(" |ASCII>| " + j);
			System.out.println();
		}
	}
}
// очень даже неплохо, только следи за форматированием и отступами, код иногда плавает
