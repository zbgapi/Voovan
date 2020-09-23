package org.voovan.http.server.module.annontationRouter.swagger.entity;

import org.voovan.tools.reflect.annotation.Serialization;

/**
 * Class name
 *
 * @author: helyho
 * Voovan Framework.
 * WebSite: https://github.com/helyho/Voovan
 * Licence: Apache v2 License
 */
public class SchemaItem {
    /**
     * 必填。参数类型。”string”, “number”, “integer”, “boolean”, “array” or “file”.
     * 由于参数不在请求体，所以都是简单类型。consumes必须为multipart/form-data或者application/x-www-form-urlencoded或者两者皆有。
     * 参数的in值必须为formData。
     */
    private String type;

    /**
     * 前面提到的type的扩展格式。详情参照Data Type Formats。
     */
    private String format;


    private Boolean required;

    @Serialization("default")
    private String defaultVal;

    private String description;

    public SchemaItem(String type, String format, String description) {
        this.type = type;
        this.format = format;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public String getDefaultVal() {
        return defaultVal;
    }

    public void setDefaultVal(String defaultVal) {
        this.defaultVal = defaultVal;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
