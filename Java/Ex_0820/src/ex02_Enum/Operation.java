package ex02_Enum;

public enum Operation {
	
	PLUS("+"){
		@Override
		public double apply(double x, double y) {
			
			return x + y;
		}
	},	
	MINUS("-"){
		@Override
		public double apply(double x, double y) {
			
			return x - y;
		}
	},	
	MULTI("*"){
		@Override
		public double apply(double x, double y) {
			
			return x * y;
		}
	},	
	DIVIDE("/"){
		@Override
		public double apply(double x, double y) {
			
			return x / y;
		}
	};	
	
	private String operator;
	
	Operation(String operator){
		this.operator = operator;
	}
	public String getOperator() {
		return operator;
	}
	
	public abstract double apply(double x, double y);

}

