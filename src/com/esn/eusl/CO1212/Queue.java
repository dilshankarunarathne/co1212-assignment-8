public class Queue
{
	int size = 5;
	int myQueue[] = new int[size];
	int front, rear;

	Queue()
	{
		front = rear = -1;
	}

	boolean isFull()
	{
		if (front == 0 && rear == size - 1)
		{
			return true;
		}
		return false;
	}

	boolean isEmpty()
	{
		if (front == -1)
			return true;
		else
			return false;
	}

	void enQueue(int element)
	{
		if (isFull())
		{
			System.out.println("Queue is full");
		}
		else
		{
			if (front == -1)
			{
				front = 0;
			}
			rear++;
			myQueue[rear] = element;
			System.out.println("Insert " + element);
		}
	}

	int deQueue()
	{
		int element;
		if (isEmpty())
		{
			System.out.println("Queue is empty");
			return (-1);
		}
		else
		{
			element = myQueue[front];
			if (front >= rear)
				front = rear = -1;
			else
				front++;
			System.out.println( element + " is deleted");
			return (element);
		}
	}

	void display()
	{
		if (isEmpty())
		{
			System.out.println("Empty Queue");
		}
		else
		{
			for (int i = front; i <= rear; i++)
				System.out.print(myQueue[i] + "  ");
		}
		System.out.println();
	}
}