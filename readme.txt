java -jar swagger-codegen-cli-3.0.8.jar generate \
  -i swagger.yaml \
  --api-package com.example.employer.api \
  --model-package com.example.employer.model \
  --group-id com.example \
  --artifact-id spring-swagger-codegen-employer \
  --artifact-version 1.0.0-SNAPSHOT \
  -l spring \
  -o spring-swagger-codegen-employer
