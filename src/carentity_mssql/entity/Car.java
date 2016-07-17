/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carentity_mssql.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Blue
 */
@Entity
@Table(name = "CarTbl")
public class Car {
//    Make (String)
//Model (String)
//Year (int)
//Miles (int)
//Color (enum)
//Table associated with Car object is (CarTbl)
//The Year field is stored in the database as (ManufacturingYear)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Make;
    private String Model;
    @Column(name ="ManufacturingYear")
    private int Year;
    private int Miles;
    @Enumerated(EnumType.STRING)
    private Colors Color;

    public Car() {
    }

    public Car(String make, String model, int year) {
        this.Make = make;
        this.Model = model;
        this.Year = year;
    }

    public Car(String Make, String Model, int Year, int Miles, Colors Color) {
        this.Make = Make;
        this.Model = Model;
        this.Year = Year;
        this.Miles = Miles;
        this.Color = Color;
    }
    
    
    public enum Colors{
    BLUE,BLACK;
    };

    public Colors getColor() {
        return Color;
    }

    public void setColor(Colors Color) {
        this.Color = Color;
    }



    public String getMake() {
        return Make;
    }

    public void setMake(String Make) {
        this.Make = Make;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public int getMiles() {
        return Miles;
    }

    public void setMiles(int Miles) {
        this.Miles = Miles;
    }
}
