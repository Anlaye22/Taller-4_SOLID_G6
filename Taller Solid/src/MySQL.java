public class MySQL implements ISQL{
	private final IInsert inserter;
	private final IDelete deleter;
	private final IUpdate updater;
	private final ISelect selecter;
	
	public MySQL(){
        this.inserter = new MySQLInsert();
        this.selecter = new MySQLSelect();
        this.deleter = new MySQLDelete();
        this.updater = new MySQLUpdate();
		
	}
	
	@Override
	public void insert(String statement) {
		inserter.insert(statement);
		
	}

	@Override
	public void delete(String statement) {
		deleter.delete(statement);
		
	}

	@Override
	public void update(String statement) {
		updater.update(statement);
		
	}

	@Override
	public void select(String statement) {
		selecter.select(statement);
		
	}

}

