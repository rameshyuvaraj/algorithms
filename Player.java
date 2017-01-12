package Sorts;

import java.util.Comparator;
import java.util.function.Function;

/**
 * Created by Admin on 05-01-2017.
 */
enum Position{
    OPENER (1),
    ALL_ROUNDER (2),
    WICKET_KEEPER (3),
    BOWLER (4);

    int order;

    Position(int i) {
        this.order = i;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }


    @Override
    public String toString() {
        return super.toString();
    }

}

public class Player implements Comparator<Player>,Comparable<Player>{

    String name;
    String team;
    Integer rank;
    Position position;
    Double salary;

    public Player() {
    }

    public Player(String name, String team, Integer rank, Position position, Double salary) {
        this.name = name;
        this.team = team;
        this.rank = rank;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", rank=" + rank +
                ", position=" + position +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compare(Player o1, Player o2) {
        if(o1.name.compareTo(o2.name) == 0){
            if(o1.rank.equals(o2.rank)){
                if(o1.salary.equals(o2.salary)){
                    if(o1.position.equals(o2.position)){
                        return o1.team.compareTo(o2.team);
                    }else{
                        return o1.position.compareTo(o2.position);
                    }
                }else{
                    return o1.salary.compareTo(o2.salary);
                }
            }else{
                return o2.rank-o1.rank;
            }
        }else{
            return o1.name.compareTo(o2.name);
        }
    }

    @Override
    public int compareTo(Player o) {
        return this.compare(this,o);
    }

}


