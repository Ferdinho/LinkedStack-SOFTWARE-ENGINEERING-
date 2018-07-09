
import static org.junit.jupiter.api.Assertions.*;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;

class LinkedStacktest {


	Object test = new Object();


	@Test
	void IsEmptyTest() {
		LinkedStack list = new LinkedStack();
		assertEquals(0, list.size());
		assertTrue(list.isEmpty());
		list.push(test);
		assertFalse(list.isEmpty());

	}


	@Test
	void sizeTest() {
		LinkedStack list = new LinkedStack();
		assertEquals(0, list.size());
		for(int i = 0; i<3;i++) {
			list.push(test);
		}
		assertEquals(3, list.size());
		assertTrue(!list.isEmpty());


	}

	@Test
	void pushTest() {
		LinkedStack list = new LinkedStack();
		assertEquals(0, list.size());
		list.push(test);
		list.push(test);
		list.push(test);
		assertTrue(!list.isEmpty());
		assertEquals(3,list.size());
	}

	@Test
	void PopTest() {
		LinkedStack list = new LinkedStack();
		assertEquals(0, list.size());
		list.push(test);
		list.push(test);
		list.pop();
		assertEquals(1, list.size());
	}

	@Test
	void peek() {
		
		LinkedStack list = new LinkedStack();
		list.push(5);
		list.push(1);
		list.push(2);
		list.peek();
		assertEquals(2, list.peek());
	}


	@Test
	void PeekException() {
		LinkedStack list = new LinkedStack();
		assertThrows(NoSuchElementException.class, () -> list.peek());    
	}

	@Test
	void PopException() {
		LinkedStack list = new LinkedStack();
		assertThrows(NoSuchElementException.class, () -> list.pop());    
	}	


	@Test
	void PushingObjectsTest() {
		LinkedStack list = new LinkedStack();
		long totalTime;
		long startTime = System.currentTimeMillis();		
		for (int i = 0; i < 10000; i++) {
			list.push(test);
		}
		long endTime = System.currentTimeMillis();
		totalTime = endTime - startTime;
		assertTrue(totalTime <= 5);
	}
}
