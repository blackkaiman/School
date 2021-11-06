public interface Repository<T> {
    public void addObject(T obj);
    public void deleteObject(T obj);
    public void sortObject();
}
