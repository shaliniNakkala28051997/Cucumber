package skelton;

public class person {
	int distance;
	String message;
	

	public void setDistance(Integer int1) {
		// TODO Auto-generated method stub
		this.distance=int1;
		
	}

	public void setmessage(String string) {
		// TODO Auto-generated method stub
		if(distance>0&&distance<20)
			this.message=string;
		else
			this.message="cannot hear";
	}

	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

}
