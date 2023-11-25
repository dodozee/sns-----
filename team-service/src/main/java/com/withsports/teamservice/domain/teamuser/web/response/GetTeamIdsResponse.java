package com.withsports.teamservice.domain.teamuser.web.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetTeamIdsResponse {
    private List<Long> teamIds;
}