package prob3;

public class Duck extends Bird {
	
	private String name;
	
	public String getName() {
		return name;
	}

	@Override
	public void setName(String string) {
		// TODO Auto-generated method stub
		this.name = string;
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("오리("+this.getName()+")는 날지 않습니다.");
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("오리("+this.getName()+")가 소리내어 웁니다.");
	}

	@Override
	public String toString() {
		return "오리의 이름은 "+this.getName()+ " 입니다." ;
	}

}
