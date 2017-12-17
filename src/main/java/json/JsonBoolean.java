package json;

/**
 * Created by Andrii_Rodionov on 1/4/2017.
 * Modified by Vladyslav Ursul on 17/12/2017.
 */
public class JsonBoolean extends Json {
    private boolean value;

    public JsonBoolean(Boolean bool) {
        this.value = bool;
    }

    @Override
    public String toJson() {
        return Boolean.toString(this.value);
    }
}
