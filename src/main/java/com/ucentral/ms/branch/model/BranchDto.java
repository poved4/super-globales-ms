package com.ucentral.ms.branch.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record BranchDto(

  @NotNull
  @NotBlank
  String name,
  
  @NotNull
  @NotBlank
  String address

) {}