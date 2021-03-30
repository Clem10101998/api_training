package fr.esiea.ex4A;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserInfo {

    public final String userCountry;
    //public final String userEmail;
    public final String userName;
    public final String userSex;
    //public final String userSexPref;
    public final String userTweeter;


    public UserInfo(@JsonProperty("userCountry") String userCountry,
                    @JsonProperty("userName") String userName,
                    @JsonProperty("userSex") String userSex,
                    @JsonProperty("userTweeter") String userTweeter) {
        this.userCountry = userCountry;
        this.userName = userName;
        this.userSex = userSex;
        this.userTweeter = userTweeter;
    }


    @Override
    public String toString() {
        return "UserInfo{" +
            "userCountry='" + userCountry + '\'' +
            ", userName='" + userName + '\'' +
            ", userSex='" + userSex + '\'' +
            ", userTweeter='" + userTweeter + '\'' +
            '}';
    }
}
