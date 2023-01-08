package designpattern.lab13.decorator.excercise3;

public  class DataSourceDecorator implements DataSource{
    protected DataSource wrappee;

    public DataSourceDecorator(DataSource s) {
        this.wrappee = s;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
