public class Jp{

	public static void main(String[] args){

		try{
			throw new UserException();
		}catch(Exception e){
			System.out.println(e);
		}

	}

}

class UserException extends Exception{

	UserException(){
		super("User Exception Occurred");
	}

	UserException(String str){
		super(str);
	}

//	public String toString(){
//		return "UserException: " + "Exception Description";
//	}

}

















