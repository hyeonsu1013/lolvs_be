package com.housney.lolvs.request.aroot.controller;

import com.housney.lolvs.common.utils.ModelUtils;
import com.housney.lolvs.common.vo.BaseVO;
import com.housney.lolvs.request.aroot.model.CodeSrchModel;
import com.housney.lolvs.request.entity.CodeEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/${project.name}/api/root")
@RestController
@RequiredArgsConstructor
@Api(value = "Aroot Controller - Swagger", description = "Root Controller 입니다.")
public class ArootRestContoller {

    private final ModelUtils modelUtils;

    @ApiOperation(value = "Entity 생성", notes = "")
    @RequestMapping(value = "/ins/entt", method = RequestMethod.POST)
    public void insEntt(@RequestBody BaseVO vo) throws Exception {
        modelUtils.createEntity();
    }

    @ApiOperation(value = "공통코드 조회", notes = "")
    @RequestMapping(value = "/sel/code", method = RequestMethod.POST)
    public List<CodeEntity> selCode(@RequestBody CodeSrchModel srchModel) throws Exception {
        return null;
    }
}
