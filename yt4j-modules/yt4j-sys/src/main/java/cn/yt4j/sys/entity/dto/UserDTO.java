package cn.yt4j.sys.entity.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author gyv12345@163.com
 */
@Data
public class UserDTO implements Serializable {

	private static final long serialVersionUID = 7380450222422017042L;

	@NotNull
	private String username;

	@NotNull
	private String password;

}
