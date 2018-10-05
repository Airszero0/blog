package com.blog;

public interface IBaseService<T extends BaseModel,K extends String> {
    T get(K guid);
}
