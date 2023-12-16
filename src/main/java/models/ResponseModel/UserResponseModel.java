package models.ResponseModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseModel {
        private String name;
        private String job;
        private int id;
        private String createdAt;

}
