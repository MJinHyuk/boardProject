package SpringBoot_BoardProject.controllers.members;

import SpringBoot_BoardProject.commons.Utils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final Utils utils;

    public String join() {
        return utils.tpl("member/join");

    }
}
