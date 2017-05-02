package prob5;

public class MyStack {

	int top;
	String[] buffer;
	String[] buf;

	public MyStack(int i) {
		
	}

	public void push(String string) {
		
		++top;
		this.buf = new String[top];
		
		if(top!=1){
			for (int i = 0; i < buffer.length; i++) {
				buf[i] = buffer[i];
			}
		}
		
		this.buffer = new String[top];
		this.buffer = this.buf;
		this.buffer[top-1] = string;
		this.buf = null;
		
	}

	public boolean isEmpty() {
		if (top < 1) {
			return true;
		} else {
			return false;
		}
	}

	public String pop() throws MyStackException {
		
		if(isEmpty()){
			throw new MyStackException("stack is empty");
		}
		--top;
		String Data = this.buffer[this.top];
		this.buffer[this.top] = null;
		return Data;
	}

}
