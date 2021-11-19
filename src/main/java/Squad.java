public class Squad {
    String squadName;
    String homeTown;
    Integer formed;
    String secretBase;
    Boolean active;

    Member[] members;

    public String getSquadName() {
        return squadName;
    }

    public void setSquadName(String squadName) {
        this.squadName = squadName;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public Integer getFormed() {
        return formed;
    }

    public void setFormed(Integer formed) {
        this.formed = formed;
    }

    public String getSecretBase() {
        return secretBase;
    }

    public void setSecretBase(String secretBase) {
        this.secretBase = secretBase;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Member[] getMembers() {
        return members;
    }

    public void setMembers(Member[] members) {
        this.members = members;
    }
}

class Member {
    String name;
    Integer age;
    String secretIdentity;
    String[] powers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSecretIdentity() {
        return secretIdentity;
    }

    public void setSecretIdentity(String secretIdentity) {
        this.secretIdentity = secretIdentity;
    }

    public String[] getPowers() {
        return powers;
    }

    public void setPowers(String[] powers) {
        this.powers = powers;
    }
}