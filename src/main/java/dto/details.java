package dto;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class details 
{
@GeneratedValue(strategy = GenerationType.AUTO)
@Id
int id;
String Name;
String Emailid;
long mobile;
}
