import java.io.Serializable;


class DataPackage implements Serializable{
    int secretVar;
	public DataPackage() {secretVar=0;}

	public void setVar(int x){
    	secretVar=x;
	} 

	public int getVar(){
		return secretVar;
	}
}