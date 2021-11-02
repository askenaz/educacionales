package com.nur.educacionales.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(catalog = "public", name = "establecimientoseducacionalesconsolidado")
public class EstablecimientosEducacionalesConsolidado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "agno")
    private String agno;

    @Column(name = "rbd")
    private String rbd;

    @Column(name = "dgv_rbd")
    private String dgv_rbd;

    @Column(name = "nom_rbd")
    private String nom_rbd;

    @Column(name = "mrun")
    private String mrun;

    @Column(name = "rut_sostenedor")
    private String rut_sostenedor;

    @Column(name = "p_juridica")
    private String p_juridica;

    @Column(name = "cod_reg_rbd")
    private String cod_reg_rbd;

    @Column(name = "cod_pro_rbd")
    private String cod_pro_rbd;

    @Column(name = "cod_com_rbd")
    private String cod_com_rbd;

    @Column(name = "nom_com_rbd")
    private String nom_com_rbd;

    @Column(name = "cod_deprov_rbd")
    private String cod_deprov_rbd;

    @Column(name = "nom_deprov_rbd")
    private String nom_deprov_rbd;

    @Column(name = "cod_depe")
    private String cod_depe;

    @Column(name = "cod_depe2")
    private String cod_depe2;

    @Column(name = "rural_rbd")
    private String rural_rbd;

    @Column(name = "latitud")
    private String latitud;

    @Column(name = "longitud")
    private String longitud;

    @Column(name = "convenio_pie")
    private String convenio_pie;

    @Column(name = "ens_01")
    private String ens_01;

    @Column(name = "ens_02")
    private String ens_02;

    @Column(name = "ens_03")
    private String ens_03;

    @Column(name = "ens_04")
    private String ens_04;

    @Column(name = "ens_05")
    private String ens_05;

    @Column(name = "ens_06")
    private String ens_06;

    @Column(name = "ens_07")
    private String ens_07;

    @Column(name = "ens_08")
    private String ens_08;

    @Column(name = "ens_09")
    private String ens_09;

    @Column(name = "matricula")
    private String matricula;

    @Column(name = "estado_estab")
    private String estado_estab;

    @Column(name = "ori_religiosa")
    private String ori_religiosa;

    @Column(name = "ori_otro_glosa")
    private String ori_otro_glosa;

    @Column(name = "pago_matricula")
    private String pago_matricula;

    @Column(name = "pago_mensual")
    private String pago_mensual;

    @Column(name = "_col8081")
    private String _col8081;

    @Column(name = "_col7887")
    private String _col7887;

    @Column(name = "_col1847")
    private String _col1847;

}
