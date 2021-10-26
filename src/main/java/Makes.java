import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Makes {


    private String name;

    public Makes(String name) {
        this.name = name;
    }
        @Override
    public String toString() {
        return name;
    }
}




