package com.jmax4you.learn.jpa.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.annotations.ColumnTransformer;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author max.zheng
 * @date 2020-04-17 15:41
 */
@Data
@Entity
@Table(name="JMAX_USER")
@Accessors(chain = true)
public class JmaxUser implements Serializable {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid.hex")
    @Column(name = "ID", length = 50, nullable = false)
    private String id;
    @Column(name = "NAME",length = 100)
    private String name;
    @Column(name = "BIRTHDAY")
    private Date birthday;

    @Column(name="ID_CARD",length = 150)
    @ColumnTransformer()
    private String idCard;
}
