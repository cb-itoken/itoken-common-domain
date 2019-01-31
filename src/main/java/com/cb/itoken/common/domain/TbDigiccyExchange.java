package com.cb.itoken.common.domain;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "tb_digiccy_exchange")
public class TbDigiccyExchange extends BaseDomain implements Serializable {
    private static final long serialVersionUID = -6442875862196020462L;
    /**
     * 交易所编码
     */
    @Id
    @Column(name = "exch_guid")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private String exchGuid;

    /**
     * 交易所名称
     */
    @Column(name = "exch_name")
    private String exchName;

    /**
     * 交易所代号
     */
    @Column(name = "exch_code")
    private String exchCode;

    /**
     * 交易所网址
     */
    @Column(name = "exch_url")
    private String exchUrl;

    /**
     * 获取交易所编码
     *
     * @return exch_guid - 交易所编码
     */
    public String getExchGuid() {
        return exchGuid;
    }

    /**
     * 设置交易所编码
     *
     * @param exchGuid 交易所编码
     */
    public void setExchGuid(String exchGuid) {
        this.exchGuid = exchGuid;
    }

    /**
     * 获取交易所名称
     *
     * @return exch_name - 交易所名称
     */
    public String getExchName() {
        return exchName;
    }

    /**
     * 设置交易所名称
     *
     * @param exchName 交易所名称
     */
    public void setExchName(String exchName) {
        this.exchName = exchName;
    }

    /**
     * 获取交易所代号
     *
     * @return exch_code - 交易所代号
     */
    public String getExchCode() {
        return exchCode;
    }

    /**
     * 设置交易所代号
     *
     * @param exchCode 交易所代号
     */
    public void setExchCode(String exchCode) {
        this.exchCode = exchCode;
    }

    /**
     * 获取交易所网址
     *
     * @return exch_url - 交易所网址
     */
    public String getExchUrl() {
        return exchUrl;
    }

    /**
     * 设置交易所网址
     *
     * @param exchUrl 交易所网址
     */
    public void setExchUrl(String exchUrl) {
        this.exchUrl = exchUrl;
    }

}