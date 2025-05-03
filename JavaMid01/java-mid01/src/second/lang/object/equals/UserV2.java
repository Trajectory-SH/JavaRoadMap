package second.lang.object.equals;

public class UserV2 {
    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof UserV2 user){
            return id.equals(user.id);
        }
        return false;
    }
}
