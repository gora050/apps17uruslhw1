package json;

/**
 * Created by Andrii_Rodionov on 1/4/2017.
 * Modified by Vladyslav Ursul on 17/12/2017.
 */

public class JsonNull extends Json {

    @Override
    public String toJson() {
        return "null";
    }
}
