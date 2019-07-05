package domain.model.entities;

/**
 *
 * @author Luis Vergara
 * @param <T>
 */
public abstract class DefaultEntity<T> {

    
    String name;

    
    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

}
