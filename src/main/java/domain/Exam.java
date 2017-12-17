package domain;

import json.JsonNumber;
import json.JsonObject;
import json.JsonPair;
import json.JsonString;
import json.JsonBoolean;

public class Exam {

    public static JsonObject info(JsonString course, JsonNumber mark, JsonBoolean passed) {
        return new JsonObject(
                new JsonPair("course", course),
                new JsonPair("mark", mark),
                new JsonPair("passed", passed)
        );
    }

    public static JsonObject info(String course, int mark, boolean passed) {
        return info(new JsonString(course), new JsonNumber(mark), new JsonBoolean(passed));
    }
}
