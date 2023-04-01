public class Personne{
	private Long id;
	private String name;
	private String lastName;
	private String arabFullName;

	public Personne(Long id){
		this.id=id;
		
		
	}
	public Long getId(){
		return this.id;
	}
	public void setId(Long id){
		this.id=id;
	}
         
	   public String getName(){
                return this.name;
        }
        public void setName(String name){
                this.name=name;
        }

	      public String getlastName(){
                return this.lastName;
        }
        public void setlastName(String lastName){
                this.lastName=lastName;
        }


