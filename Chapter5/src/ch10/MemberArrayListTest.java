package ch10;

public class MemberArrayListTest {

    public static void main(String[] args) {

        MemberArrayList memberArrayList = new MemberArrayList();
        Member memLee = new Member(1001,"이순신");
        Member memKim = new Member(1002,"김유신");
        Member memKang = new Member(1003,"강감찬");
        Member memHong = new Member(1004,"홍길동");

        memberArrayList.addMember(memLee);
        memberArrayList.addMember(memKim);
        memberArrayList.addMember(memKang);
        memberArrayList.addMember(memHong);

        memberArrayList.showAllMember();
        memberArrayList.removeMember(memKim.getMemberId());
        memberArrayList.showAllMember();

    }
}
