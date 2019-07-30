(ns com.amazonaws.services.iot.AbstractAWSIotAsync
  "Abstract implementation of AWSIotAsync. Convenient method forms pass through to the corresponding overload
  that takes a request object and an AsyncHandler, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.iot AbstractAWSIotAsync]))

(defn add-thing-to-thing-group-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.AddThingToThingGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddThingToThingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.AddThingToThingGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.AddThingToThingGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addThingToThingGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.AddThingToThingGroupRequest request]
    (-> this (.addThingToThingGroupAsync request))))

(defn untag-resource-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn update-dynamic-thing-group-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.UpdateDynamicThingGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDynamicThingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.UpdateDynamicThingGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.UpdateDynamicThingGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDynamicThingGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.UpdateDynamicThingGroupRequest request]
    (-> this (.updateDynamicThingGroupAsync request))))

(defn describe-audit-task-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.DescribeAuditTaskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAuditTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeAuditTaskResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeAuditTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAuditTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeAuditTaskRequest request]
    (-> this (.describeAuditTaskAsync request))))

(defn describe-endpoint-async
  "Description copied from interface: AWSIotAsync

  request - The input for the DescribeEndpoint operation. - `com.amazonaws.services.iot.model.DescribeEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeEndpointResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeEndpointRequest request]
    (-> this (.describeEndpointAsync request))))

(defn list-thing-registration-tasks-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.ListThingRegistrationTasksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListThingRegistrationTasks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListThingRegistrationTasksResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListThingRegistrationTasksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listThingRegistrationTasksAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListThingRegistrationTasksRequest request]
    (-> this (.listThingRegistrationTasksAsync request))))

(defn update-role-alias-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.UpdateRoleAliasRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRoleAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.UpdateRoleAliasResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.UpdateRoleAliasRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRoleAliasAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.UpdateRoleAliasRequest request]
    (-> this (.updateRoleAliasAsync request))))

(defn detach-principal-policy-async
  "Deprecated.

  request - The input for the DetachPrincipalPolicy operation. - `com.amazonaws.services.iot.model.DetachPrincipalPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachPrincipalPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DetachPrincipalPolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DetachPrincipalPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachPrincipalPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DetachPrincipalPolicyRequest request]
    (-> this (.detachPrincipalPolicyAsync request))))

(defn delete-job-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.DeleteJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeleteJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeleteJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeleteJobRequest request]
    (-> this (.deleteJobAsync request))))

(defn describe-security-profile-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.DescribeSecurityProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSecurityProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeSecurityProfileResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeSecurityProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSecurityProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeSecurityProfileRequest request]
    (-> this (.describeSecurityProfileAsync request))))

(defn delete-policy-async
  "Description copied from interface: AWSIotAsync

  request - The input for the DeletePolicy operation. - `com.amazonaws.services.iot.model.DeletePolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeletePolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeletePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeletePolicyRequest request]
    (-> this (.deletePolicyAsync request))))

(defn cancel-job-execution-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.CancelJobExecutionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelJobExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CancelJobExecutionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CancelJobExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelJobExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CancelJobExecutionRequest request]
    (-> this (.cancelJobExecutionAsync request))))

(defn delete-registration-code-async
  "Description copied from interface: AWSIotAsync

  request - The input for the DeleteRegistrationCode operation. - `com.amazonaws.services.iot.model.DeleteRegistrationCodeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRegistrationCode operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeleteRegistrationCodeResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeleteRegistrationCodeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRegistrationCodeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeleteRegistrationCodeRequest request]
    (-> this (.deleteRegistrationCodeAsync request))))

(defn delete-thing-async
  "Description copied from interface: AWSIotAsync

  request - The input for the DeleteThing operation. - `com.amazonaws.services.iot.model.DeleteThingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteThing operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeleteThingResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeleteThingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteThingAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeleteThingRequest request]
    (-> this (.deleteThingAsync request))))

(defn create-keys-and-certificate-async
  "Description copied from interface: AWSIotAsync

  request - The input for the CreateKeysAndCertificate operation. - `com.amazonaws.services.iot.model.CreateKeysAndCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateKeysAndCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CreateKeysAndCertificateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CreateKeysAndCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createKeysAndCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CreateKeysAndCertificateRequest request]
    (-> this (.createKeysAndCertificateAsync request))))

(defn describe-job-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.DescribeJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeJobRequest request]
    (-> this (.describeJobAsync request))))

(defn create-authorizer-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.CreateAuthorizerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAuthorizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CreateAuthorizerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CreateAuthorizerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAuthorizerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CreateAuthorizerRequest request]
    (-> this (.createAuthorizerAsync request))))

(defn deprecate-thing-type-async
  "Description copied from interface: AWSIotAsync

  request - The input for the DeprecateThingType operation. - `com.amazonaws.services.iot.model.DeprecateThingTypeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeprecateThingType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeprecateThingTypeResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeprecateThingTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deprecateThingTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeprecateThingTypeRequest request]
    (-> this (.deprecateThingTypeAsync request))))

(defn set-logging-options-async
  "Description copied from interface: AWSIotAsync

  request - The input for the SetLoggingOptions operation. - `com.amazonaws.services.iot.model.SetLoggingOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetLoggingOptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.SetLoggingOptionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.SetLoggingOptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setLoggingOptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.SetLoggingOptionsRequest request]
    (-> this (.setLoggingOptionsAsync request))))

(defn describe-thing-type-async
  "Description copied from interface: AWSIotAsync

  request - The input for the DescribeThingType operation. - `com.amazonaws.services.iot.model.DescribeThingTypeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeThingType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeThingTypeResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeThingTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeThingTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeThingTypeRequest request]
    (-> this (.describeThingTypeAsync request))))

(defn delete-topic-rule-async
  "Description copied from interface: AWSIotAsync

  request - The input for the DeleteTopicRule operation. - `com.amazonaws.services.iot.model.DeleteTopicRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTopicRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeleteTopicRuleResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeleteTopicRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTopicRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeleteTopicRuleRequest request]
    (-> this (.deleteTopicRuleAsync request))))

(defn delete-job-execution-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.DeleteJobExecutionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteJobExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeleteJobExecutionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeleteJobExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteJobExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeleteJobExecutionRequest request]
    (-> this (.deleteJobExecutionAsync request))))

(defn delete-security-profile-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.DeleteSecurityProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSecurityProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeleteSecurityProfileResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeleteSecurityProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSecurityProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeleteSecurityProfileRequest request]
    (-> this (.deleteSecurityProfileAsync request))))

(defn delete-dynamic-thing-group-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.DeleteDynamicThingGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDynamicThingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeleteDynamicThingGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeleteDynamicThingGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDynamicThingGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeleteDynamicThingGroupRequest request]
    (-> this (.deleteDynamicThingGroupAsync request))))

(defn list-jobs-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.ListJobsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListJobsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListJobsRequest request]
    (-> this (.listJobsAsync request))))

(defn validate-security-profile-behaviors-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.ValidateSecurityProfileBehaviorsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ValidateSecurityProfileBehaviors operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ValidateSecurityProfileBehaviorsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ValidateSecurityProfileBehaviorsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.validateSecurityProfileBehaviorsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ValidateSecurityProfileBehaviorsRequest request]
    (-> this (.validateSecurityProfileBehaviorsAsync request))))

(defn associate-targets-with-job-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.AssociateTargetsWithJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateTargetsWithJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.AssociateTargetsWithJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.AssociateTargetsWithJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateTargetsWithJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.AssociateTargetsWithJobRequest request]
    (-> this (.associateTargetsWithJobAsync request))))

(defn attach-thing-principal-async
  "Description copied from interface: AWSIotAsync

  request - The input for the AttachThingPrincipal operation. - `com.amazonaws.services.iot.model.AttachThingPrincipalRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachThingPrincipal operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.AttachThingPrincipalResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.AttachThingPrincipalRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachThingPrincipalAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.AttachThingPrincipalRequest request]
    (-> this (.attachThingPrincipalAsync request))))

(defn create-billing-group-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.CreateBillingGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateBillingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CreateBillingGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CreateBillingGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createBillingGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CreateBillingGroupRequest request]
    (-> this (.createBillingGroupAsync request))))

(defn create-thing-async
  "Description copied from interface: AWSIotAsync

  request - The input for the CreateThing operation. - `com.amazonaws.services.iot.model.CreateThingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateThing operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CreateThingResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CreateThingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createThingAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CreateThingRequest request]
    (-> this (.createThingAsync request))))

(defn update-security-profile-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.UpdateSecurityProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSecurityProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.UpdateSecurityProfileResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.UpdateSecurityProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSecurityProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.UpdateSecurityProfileRequest request]
    (-> this (.updateSecurityProfileAsync request))))

(defn attach-policy-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.AttachPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.AttachPolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.AttachPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.AttachPolicyRequest request]
    (-> this (.attachPolicyAsync request))))

(defn create-policy-async
  "Description copied from interface: AWSIotAsync

  request - The input for the CreatePolicy operation. - `com.amazonaws.services.iot.model.CreatePolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CreatePolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CreatePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CreatePolicyRequest request]
    (-> this (.createPolicyAsync request))))

(defn create-stream-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.CreateStreamRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CreateStreamResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CreateStreamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createStreamAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CreateStreamRequest request]
    (-> this (.createStreamAsync request))))

(defn cancel-certificate-transfer-async
  "Description copied from interface: AWSIotAsync

  request - The input for the CancelCertificateTransfer operation. - `com.amazonaws.services.iot.model.CancelCertificateTransferRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelCertificateTransfer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CancelCertificateTransferResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CancelCertificateTransferRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelCertificateTransferAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CancelCertificateTransferRequest request]
    (-> this (.cancelCertificateTransferAsync request))))

(defn list-audit-findings-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.ListAuditFindingsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAuditFindings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListAuditFindingsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListAuditFindingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAuditFindingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListAuditFindingsRequest request]
    (-> this (.listAuditFindingsAsync request))))

(defn delete-thing-type-async
  "Description copied from interface: AWSIotAsync

  request - The input for the DeleteThingType operation. - `com.amazonaws.services.iot.model.DeleteThingTypeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteThingType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeleteThingTypeResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeleteThingTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteThingTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeleteThingTypeRequest request]
    (-> this (.deleteThingTypeAsync request))))

(defn list-thing-types-async
  "Description copied from interface: AWSIotAsync

  request - The input for the ListThingTypes operation. - `com.amazonaws.services.iot.model.ListThingTypesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListThingTypes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListThingTypesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListThingTypesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listThingTypesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListThingTypesRequest request]
    (-> this (.listThingTypesAsync request))))

(defn transfer-certificate-async
  "Description copied from interface: AWSIotAsync

  request - The input for the TransferCertificate operation. - `com.amazonaws.services.iot.model.TransferCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TransferCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.TransferCertificateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.TransferCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.transferCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.TransferCertificateRequest request]
    (-> this (.transferCertificateAsync request))))

(defn list-violation-events-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.ListViolationEventsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListViolationEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListViolationEventsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListViolationEventsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listViolationEventsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListViolationEventsRequest request]
    (-> this (.listViolationEventsAsync request))))

(defn test-authorization-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.TestAuthorizationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TestAuthorization operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.TestAuthorizationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.TestAuthorizationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.testAuthorizationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.TestAuthorizationRequest request]
    (-> this (.testAuthorizationAsync request))))

(defn list-job-executions-for-job-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.ListJobExecutionsForJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListJobExecutionsForJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListJobExecutionsForJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListJobExecutionsForJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listJobExecutionsForJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListJobExecutionsForJobRequest request]
    (-> this (.listJobExecutionsForJobAsync request))))

(defn delete-ota-update-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.DeleteOTAUpdateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteOTAUpdate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeleteOTAUpdateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeleteOTAUpdateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteOTAUpdateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeleteOTAUpdateRequest request]
    (-> this (.deleteOTAUpdateAsync request))))

(defn describe-billing-group-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.DescribeBillingGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBillingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeBillingGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeBillingGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBillingGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeBillingGroupRequest request]
    (-> this (.describeBillingGroupAsync request))))

(defn get-statistics-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.GetStatisticsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetStatistics operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.GetStatisticsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.GetStatisticsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getStatisticsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.GetStatisticsRequest request]
    (-> this (.getStatisticsAsync request))))

(defn describe-default-authorizer-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.DescribeDefaultAuthorizerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDefaultAuthorizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeDefaultAuthorizerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeDefaultAuthorizerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDefaultAuthorizerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeDefaultAuthorizerRequest request]
    (-> this (.describeDefaultAuthorizerAsync request))))

(defn delete-authorizer-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.DeleteAuthorizerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAuthorizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeleteAuthorizerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeleteAuthorizerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAuthorizerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeleteAuthorizerRequest request]
    (-> this (.deleteAuthorizerAsync request))))

(defn test-invoke-authorizer-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.TestInvokeAuthorizerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TestInvokeAuthorizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.TestInvokeAuthorizerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.TestInvokeAuthorizerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.testInvokeAuthorizerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.TestInvokeAuthorizerRequest request]
    (-> this (.testInvokeAuthorizerAsync request))))

(defn update-stream-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.UpdateStreamRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.UpdateStreamResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.UpdateStreamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateStreamAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.UpdateStreamRequest request]
    (-> this (.updateStreamAsync request))))

(defn delete-ca-certificate-async
  "Description copied from interface: AWSIotAsync

  request - Input for the DeleteCACertificate operation. - `com.amazonaws.services.iot.model.DeleteCACertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCACertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeleteCACertificateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeleteCACertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCACertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeleteCACertificateRequest request]
    (-> this (.deleteCACertificateAsync request))))

(defn register-certificate-async
  "Description copied from interface: AWSIotAsync

  request - The input to the RegisterCertificate operation. - `com.amazonaws.services.iot.model.RegisterCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.RegisterCertificateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.RegisterCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.RegisterCertificateRequest request]
    (-> this (.registerCertificateAsync request))))

(defn remove-thing-from-billing-group-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.RemoveThingFromBillingGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveThingFromBillingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.RemoveThingFromBillingGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.RemoveThingFromBillingGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeThingFromBillingGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.RemoveThingFromBillingGroupRequest request]
    (-> this (.removeThingFromBillingGroupAsync request))))

(defn get-ota-update-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.GetOTAUpdateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetOTAUpdate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.GetOTAUpdateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.GetOTAUpdateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getOTAUpdateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.GetOTAUpdateRequest request]
    (-> this (.getOTAUpdateAsync request))))

(defn list-things-in-billing-group-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.ListThingsInBillingGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListThingsInBillingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListThingsInBillingGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListThingsInBillingGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listThingsInBillingGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListThingsInBillingGroupRequest request]
    (-> this (.listThingsInBillingGroupAsync request))))

(defn remove-thing-from-thing-group-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.RemoveThingFromThingGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveThingFromThingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.RemoveThingFromThingGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.RemoveThingFromThingGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeThingFromThingGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.RemoveThingFromThingGroupRequest request]
    (-> this (.removeThingFromThingGroupAsync request))))

(defn register-ca-certificate-async
  "Description copied from interface: AWSIotAsync

  request - The input to the RegisterCACertificate operation. - `com.amazonaws.services.iot.model.RegisterCACertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterCACertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.RegisterCACertificateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.RegisterCACertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerCACertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.RegisterCACertificateRequest request]
    (-> this (.registerCACertificateAsync request))))

(defn set-default-authorizer-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.SetDefaultAuthorizerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetDefaultAuthorizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.SetDefaultAuthorizerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.SetDefaultAuthorizerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setDefaultAuthorizerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.SetDefaultAuthorizerRequest request]
    (-> this (.setDefaultAuthorizerAsync request))))

(defn delete-policy-version-async
  "Description copied from interface: AWSIotAsync

  request - The input for the DeletePolicyVersion operation. - `com.amazonaws.services.iot.model.DeletePolicyVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePolicyVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeletePolicyVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeletePolicyVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePolicyVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeletePolicyVersionRequest request]
    (-> this (.deletePolicyVersionAsync request))))

(defn update-thing-group-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.UpdateThingGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateThingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.UpdateThingGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.UpdateThingGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateThingGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.UpdateThingGroupRequest request]
    (-> this (.updateThingGroupAsync request))))

(defn list-streams-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.ListStreamsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListStreams operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListStreamsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListStreamsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listStreamsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListStreamsRequest request]
    (-> this (.listStreamsAsync request))))

(defn update-ca-certificate-async
  "Description copied from interface: AWSIotAsync

  request - The input to the UpdateCACertificate operation. - `com.amazonaws.services.iot.model.UpdateCACertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateCACertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.UpdateCACertificateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.UpdateCACertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateCACertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.UpdateCACertificateRequest request]
    (-> this (.updateCACertificateAsync request))))

(defn get-effective-policies-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.GetEffectivePoliciesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetEffectivePolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.GetEffectivePoliciesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.GetEffectivePoliciesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getEffectivePoliciesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.GetEffectivePoliciesRequest request]
    (-> this (.getEffectivePoliciesAsync request))))

(defn list-things-async
  "Description copied from interface: AWSIotAsync

  request - The input for the ListThings operation. - `com.amazonaws.services.iot.model.ListThingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListThings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListThingsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListThingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listThingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListThingsRequest request]
    (-> this (.listThingsAsync request))))

(defn list-scheduled-audits-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.ListScheduledAuditsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListScheduledAudits operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListScheduledAuditsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListScheduledAuditsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listScheduledAuditsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListScheduledAuditsRequest request]
    (-> this (.listScheduledAuditsAsync request))))

(defn detach-policy-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.DetachPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DetachPolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DetachPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DetachPolicyRequest request]
    (-> this (.detachPolicyAsync request))))

(defn update-scheduled-audit-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.UpdateScheduledAuditRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateScheduledAudit operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.UpdateScheduledAuditResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.UpdateScheduledAuditRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateScheduledAuditAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.UpdateScheduledAuditRequest request]
    (-> this (.updateScheduledAuditAsync request))))

(defn create-certificate-from-csr-async
  "Description copied from interface: AWSIotAsync

  request - The input for the CreateCertificateFromCsr operation. - `com.amazonaws.services.iot.model.CreateCertificateFromCsrRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCertificateFromCsr operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CreateCertificateFromCsrResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CreateCertificateFromCsrRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCertificateFromCsrAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CreateCertificateFromCsrRequest request]
    (-> this (.createCertificateFromCsrAsync request))))

(defn list-job-executions-for-thing-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.ListJobExecutionsForThingRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListJobExecutionsForThing operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListJobExecutionsForThingResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListJobExecutionsForThingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listJobExecutionsForThingAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListJobExecutionsForThingRequest request]
    (-> this (.listJobExecutionsForThingAsync request))))

(defn attach-security-profile-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.AttachSecurityProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachSecurityProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.AttachSecurityProfileResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.AttachSecurityProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachSecurityProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.AttachSecurityProfileRequest request]
    (-> this (.attachSecurityProfileAsync request))))

(defn describe-certificate-async
  "Description copied from interface: AWSIotAsync

  request - The input for the DescribeCertificate operation. - `com.amazonaws.services.iot.model.DescribeCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeCertificateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeCertificateRequest request]
    (-> this (.describeCertificateAsync request))))

(defn describe-index-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.DescribeIndexRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeIndex operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeIndexResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeIndexRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeIndexAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeIndexRequest request]
    (-> this (.describeIndexAsync request))))

(defn reject-certificate-transfer-async
  "Description copied from interface: AWSIotAsync

  request - The input for the RejectCertificateTransfer operation. - `com.amazonaws.services.iot.model.RejectCertificateTransferRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RejectCertificateTransfer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.RejectCertificateTransferResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.RejectCertificateTransferRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rejectCertificateTransferAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.RejectCertificateTransferRequest request]
    (-> this (.rejectCertificateTransferAsync request))))

(defn create-thing-type-async
  "Description copied from interface: AWSIotAsync

  request - The input for the CreateThingType operation. - `com.amazonaws.services.iot.model.CreateThingTypeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateThingType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CreateThingTypeResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CreateThingTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createThingTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CreateThingTypeRequest request]
    (-> this (.createThingTypeAsync request))))

(defn create-role-alias-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.CreateRoleAliasRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRoleAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CreateRoleAliasResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CreateRoleAliasRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRoleAliasAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CreateRoleAliasRequest request]
    (-> this (.createRoleAliasAsync request))))

(defn update-certificate-async
  "Description copied from interface: AWSIotAsync

  request - The input for the UpdateCertificate operation. - `com.amazonaws.services.iot.model.UpdateCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.UpdateCertificateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.UpdateCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.UpdateCertificateRequest request]
    (-> this (.updateCertificateAsync request))))

(defn delete-v-2-logging-level-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.DeleteV2LoggingLevelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteV2LoggingLevel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeleteV2LoggingLevelResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeleteV2LoggingLevelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteV2LoggingLevelAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeleteV2LoggingLevelRequest request]
    (-> this (.deleteV2LoggingLevelAsync request))))

(defn update-thing-groups-for-thing-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.UpdateThingGroupsForThingRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateThingGroupsForThing operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.UpdateThingGroupsForThingResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.UpdateThingGroupsForThingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateThingGroupsForThingAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.UpdateThingGroupsForThingRequest request]
    (-> this (.updateThingGroupsForThingAsync request))))

(defn describe-thing-group-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.DescribeThingGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeThingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeThingGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeThingGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeThingGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeThingGroupRequest request]
    (-> this (.describeThingGroupAsync request))))

(defn describe-account-audit-configuration-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.DescribeAccountAuditConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAccountAuditConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeAccountAuditConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeAccountAuditConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAccountAuditConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeAccountAuditConfigurationRequest request]
    (-> this (.describeAccountAuditConfigurationAsync request))))

(defn describe-stream-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.DescribeStreamRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeStreamResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeStreamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStreamAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeStreamRequest request]
    (-> this (.describeStreamAsync request))))

(defn list-billing-groups-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.ListBillingGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBillingGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListBillingGroupsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListBillingGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBillingGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListBillingGroupsRequest request]
    (-> this (.listBillingGroupsAsync request))))

(defn describe-role-alias-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.DescribeRoleAliasRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRoleAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeRoleAliasResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeRoleAliasRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRoleAliasAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeRoleAliasRequest request]
    (-> this (.describeRoleAliasAsync request))))

(defn list-role-aliases-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.ListRoleAliasesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRoleAliases operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListRoleAliasesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListRoleAliasesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRoleAliasesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListRoleAliasesRequest request]
    (-> this (.listRoleAliasesAsync request))))

(defn list-ca-certificates-async
  "Description copied from interface: AWSIotAsync

  request - Input for the ListCACertificates operation. - `com.amazonaws.services.iot.model.ListCACertificatesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCACertificates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListCACertificatesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListCACertificatesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCACertificatesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListCACertificatesRequest request]
    (-> this (.listCACertificatesAsync request))))

(defn list-indices-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.ListIndicesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListIndices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListIndicesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListIndicesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listIndicesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListIndicesRequest request]
    (-> this (.listIndicesAsync request))))

(defn delete-scheduled-audit-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.DeleteScheduledAuditRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteScheduledAudit operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeleteScheduledAuditResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeleteScheduledAuditRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteScheduledAuditAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeleteScheduledAuditRequest request]
    (-> this (.deleteScheduledAuditAsync request))))

(defn list-ota-updates-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.ListOTAUpdatesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListOTAUpdates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListOTAUpdatesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListOTAUpdatesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listOTAUpdatesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListOTAUpdatesRequest request]
    (-> this (.listOTAUpdatesAsync request))))

(defn describe-event-configurations-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.DescribeEventConfigurationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventConfigurations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeEventConfigurationsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeEventConfigurationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventConfigurationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeEventConfigurationsRequest request]
    (-> this (.describeEventConfigurationsAsync request))))

(defn get-logging-options-async
  "Description copied from interface: AWSIotAsync

  request - The input for the GetLoggingOptions operation. - `com.amazonaws.services.iot.model.GetLoggingOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLoggingOptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.GetLoggingOptionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.GetLoggingOptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLoggingOptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.GetLoggingOptionsRequest request]
    (-> this (.getLoggingOptionsAsync request))))

(defn update-account-audit-configuration-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.UpdateAccountAuditConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAccountAuditConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.UpdateAccountAuditConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.UpdateAccountAuditConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAccountAuditConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.UpdateAccountAuditConfigurationRequest request]
    (-> this (.updateAccountAuditConfigurationAsync request))))

(defn cancel-job-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.CancelJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CancelJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CancelJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CancelJobRequest request]
    (-> this (.cancelJobAsync request))))

(defn list-thing-registration-task-reports-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.ListThingRegistrationTaskReportsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListThingRegistrationTaskReports operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListThingRegistrationTaskReportsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListThingRegistrationTaskReportsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listThingRegistrationTaskReportsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListThingRegistrationTaskReportsRequest request]
    (-> this (.listThingRegistrationTaskReportsAsync request))))

(defn list-attached-policies-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.ListAttachedPoliciesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAttachedPolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListAttachedPoliciesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListAttachedPoliciesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAttachedPoliciesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListAttachedPoliciesRequest request]
    (-> this (.listAttachedPoliciesAsync request))))

(defn disable-topic-rule-async
  "Description copied from interface: AWSIotAsync

  request - The input for the DisableTopicRuleRequest operation. - `com.amazonaws.services.iot.model.DisableTopicRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableTopicRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DisableTopicRuleResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DisableTopicRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableTopicRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DisableTopicRuleRequest request]
    (-> this (.disableTopicRuleAsync request))))

(defn get-job-document-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.GetJobDocumentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetJobDocument operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.GetJobDocumentResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.GetJobDocumentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getJobDocumentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.GetJobDocumentRequest request]
    (-> this (.getJobDocumentAsync request))))

(defn set-default-policy-version-async
  "Description copied from interface: AWSIotAsync

  request - The input for the SetDefaultPolicyVersion operation. - `com.amazonaws.services.iot.model.SetDefaultPolicyVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetDefaultPolicyVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.SetDefaultPolicyVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.SetDefaultPolicyVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setDefaultPolicyVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.SetDefaultPolicyVersionRequest request]
    (-> this (.setDefaultPolicyVersionAsync request))))

(defn list-targets-for-policy-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.ListTargetsForPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTargetsForPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListTargetsForPolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListTargetsForPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTargetsForPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListTargetsForPolicyRequest request]
    (-> this (.listTargetsForPolicyAsync request))))

(defn delete-account-audit-configuration-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.DeleteAccountAuditConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAccountAuditConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeleteAccountAuditConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeleteAccountAuditConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAccountAuditConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeleteAccountAuditConfigurationRequest request]
    (-> this (.deleteAccountAuditConfigurationAsync request))))

(defn get-policy-version-async
  "Description copied from interface: AWSIotAsync

  request - The input for the GetPolicyVersion operation. - `com.amazonaws.services.iot.model.GetPolicyVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPolicyVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.GetPolicyVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.GetPolicyVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPolicyVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.GetPolicyVersionRequest request]
    (-> this (.getPolicyVersionAsync request))))

(defn list-certificates-async
  "Description copied from interface: AWSIotAsync

  request - The input for the ListCertificates operation. - `com.amazonaws.services.iot.model.ListCertificatesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCertificates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListCertificatesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListCertificatesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCertificatesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListCertificatesRequest request]
    (-> this (.listCertificatesAsync request))))

(defn update-indexing-configuration-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.UpdateIndexingConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateIndexingConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.UpdateIndexingConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.UpdateIndexingConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateIndexingConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.UpdateIndexingConfigurationRequest request]
    (-> this (.updateIndexingConfigurationAsync request))))

(defn list-policies-async
  "Description copied from interface: AWSIotAsync

  request - The input for the ListPolicies operation. - `com.amazonaws.services.iot.model.ListPoliciesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListPoliciesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListPoliciesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPoliciesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListPoliciesRequest request]
    (-> this (.listPoliciesAsync request))))

(defn create-topic-rule-async
  "Description copied from interface: AWSIotAsync

  request - The input for the CreateTopicRule operation. - `com.amazonaws.services.iot.model.CreateTopicRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTopicRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CreateTopicRuleResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CreateTopicRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTopicRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CreateTopicRuleRequest request]
    (-> this (.createTopicRuleAsync request))))

(defn detach-thing-principal-async
  "Description copied from interface: AWSIotAsync

  request - The input for the DetachThingPrincipal operation. - `com.amazonaws.services.iot.model.DetachThingPrincipalRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachThingPrincipal operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DetachThingPrincipalResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DetachThingPrincipalRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachThingPrincipalAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DetachThingPrincipalRequest request]
    (-> this (.detachThingPrincipalAsync request))))

(defn create-scheduled-audit-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.CreateScheduledAuditRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateScheduledAudit operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CreateScheduledAuditResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CreateScheduledAuditRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createScheduledAuditAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CreateScheduledAuditRequest request]
    (-> this (.createScheduledAuditAsync request))))

(defn delete-certificate-async
  "Description copied from interface: AWSIotAsync

  request - The input for the DeleteCertificate operation. - `com.amazonaws.services.iot.model.DeleteCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeleteCertificateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeleteCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeleteCertificateRequest request]
    (-> this (.deleteCertificateAsync request))))

(defn describe-thing-registration-task-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.DescribeThingRegistrationTaskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeThingRegistrationTask operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeThingRegistrationTaskResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeThingRegistrationTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeThingRegistrationTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeThingRegistrationTaskRequest request]
    (-> this (.describeThingRegistrationTaskAsync request))))

(defn create-job-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.CreateJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CreateJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CreateJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CreateJobRequest request]
    (-> this (.createJobAsync request))))

(defn list-authorizers-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.ListAuthorizersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAuthorizers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListAuthorizersResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListAuthorizersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAuthorizersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListAuthorizersRequest request]
    (-> this (.listAuthorizersAsync request))))

(defn list-security-profiles-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.ListSecurityProfilesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSecurityProfiles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListSecurityProfilesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListSecurityProfilesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSecurityProfilesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListSecurityProfilesRequest request]
    (-> this (.listSecurityProfilesAsync request))))

(defn set-v-2-logging-level-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.SetV2LoggingLevelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetV2LoggingLevel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.SetV2LoggingLevelResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.SetV2LoggingLevelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setV2LoggingLevelAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.SetV2LoggingLevelRequest request]
    (-> this (.setV2LoggingLevelAsync request))))

(defn update-job-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.UpdateJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.UpdateJobResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.UpdateJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.UpdateJobRequest request]
    (-> this (.updateJobAsync request))))

(defn create-policy-version-async
  "Description copied from interface: AWSIotAsync

  request - The input for the CreatePolicyVersion operation. - `com.amazonaws.services.iot.model.CreatePolicyVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePolicyVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CreatePolicyVersionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CreatePolicyVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPolicyVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CreatePolicyVersionRequest request]
    (-> this (.createPolicyVersionAsync request))))

(defn get-indexing-configuration-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.GetIndexingConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIndexingConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.GetIndexingConfigurationResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.GetIndexingConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIndexingConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.GetIndexingConfigurationRequest request]
    (-> this (.getIndexingConfigurationAsync request))))

(defn describe-authorizer-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.DescribeAuthorizerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAuthorizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeAuthorizerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeAuthorizerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAuthorizerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeAuthorizerRequest request]
    (-> this (.describeAuthorizerAsync request))))

(defn create-dynamic-thing-group-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.CreateDynamicThingGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDynamicThingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CreateDynamicThingGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CreateDynamicThingGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDynamicThingGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CreateDynamicThingGroupRequest request]
    (-> this (.createDynamicThingGroupAsync request))))

(defn list-policy-principals-async
  "Deprecated.

  request - The input for the ListPolicyPrincipals operation. - `com.amazonaws.services.iot.model.ListPolicyPrincipalsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPolicyPrincipals operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListPolicyPrincipalsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListPolicyPrincipalsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPolicyPrincipalsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListPolicyPrincipalsRequest request]
    (-> this (.listPolicyPrincipalsAsync request))))

(defn update-thing-async
  "Description copied from interface: AWSIotAsync

  request - The input for the UpdateThing operation. - `com.amazonaws.services.iot.model.UpdateThingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateThing operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.UpdateThingResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.UpdateThingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateThingAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.UpdateThingRequest request]
    (-> this (.updateThingAsync request))))

(defn list-v-2-logging-levels-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.ListV2LoggingLevelsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListV2LoggingLevels operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListV2LoggingLevelsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListV2LoggingLevelsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listV2LoggingLevelsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListV2LoggingLevelsRequest request]
    (-> this (.listV2LoggingLevelsAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn describe-job-execution-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.DescribeJobExecutionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeJobExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeJobExecutionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeJobExecutionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeJobExecutionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeJobExecutionRequest request]
    (-> this (.describeJobExecutionAsync request))))

(defn list-certificates-by-ca-async
  "Description copied from interface: AWSIotAsync

  request - The input to the ListCertificatesByCA operation. - `com.amazonaws.services.iot.model.ListCertificatesByCARequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCertificatesByCA operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListCertificatesByCAResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListCertificatesByCARequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCertificatesByCAAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListCertificatesByCARequest request]
    (-> this (.listCertificatesByCAAsync request))))

(defn get-policy-async
  "Description copied from interface: AWSIotAsync

  request - The input for the GetPolicy operation. - `com.amazonaws.services.iot.model.GetPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.GetPolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.GetPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.GetPolicyRequest request]
    (-> this (.getPolicyAsync request))))

(defn update-event-configurations-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.UpdateEventConfigurationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateEventConfigurations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.UpdateEventConfigurationsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.UpdateEventConfigurationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateEventConfigurationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.UpdateEventConfigurationsRequest request]
    (-> this (.updateEventConfigurationsAsync request))))

(defn stop-thing-registration-task-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.StopThingRegistrationTaskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopThingRegistrationTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.StopThingRegistrationTaskResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.StopThingRegistrationTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopThingRegistrationTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.StopThingRegistrationTaskRequest request]
    (-> this (.stopThingRegistrationTaskAsync request))))

(defn attach-principal-policy-async
  "Deprecated.

  request - The input for the AttachPrincipalPolicy operation. - `com.amazonaws.services.iot.model.AttachPrincipalPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachPrincipalPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.AttachPrincipalPolicyResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.AttachPrincipalPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachPrincipalPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.AttachPrincipalPolicyRequest request]
    (-> this (.attachPrincipalPolicyAsync request))))

(defn describe-ca-certificate-async
  "Description copied from interface: AWSIotAsync

  request - The input for the DescribeCACertificate operation. - `com.amazonaws.services.iot.model.DescribeCACertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCACertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeCACertificateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeCACertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCACertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeCACertificateRequest request]
    (-> this (.describeCACertificateAsync request))))

(defn describe-thing-async
  "Description copied from interface: AWSIotAsync

  request - The input for the DescribeThing operation. - `com.amazonaws.services.iot.model.DescribeThingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeThing operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeThingResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeThingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeThingAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeThingRequest request]
    (-> this (.describeThingAsync request))))

(defn list-principal-policies-async
  "Deprecated.

  request - The input for the ListPrincipalPolicies operation. - `com.amazonaws.services.iot.model.ListPrincipalPoliciesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPrincipalPolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListPrincipalPoliciesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListPrincipalPoliciesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPrincipalPoliciesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListPrincipalPoliciesRequest request]
    (-> this (.listPrincipalPoliciesAsync request))))

(defn create-ota-update-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.CreateOTAUpdateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateOTAUpdate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CreateOTAUpdateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CreateOTAUpdateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createOTAUpdateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CreateOTAUpdateRequest request]
    (-> this (.createOTAUpdateAsync request))))

(defn accept-certificate-transfer-async
  "Description copied from interface: AWSIotAsync

  request - The input for the AcceptCertificateTransfer operation. - `com.amazonaws.services.iot.model.AcceptCertificateTransferRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AcceptCertificateTransfer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.AcceptCertificateTransferResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.AcceptCertificateTransferRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.acceptCertificateTransferAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.AcceptCertificateTransferRequest request]
    (-> this (.acceptCertificateTransferAsync request))))

(defn enable-topic-rule-async
  "Description copied from interface: AWSIotAsync

  request - The input for the EnableTopicRuleRequest operation. - `com.amazonaws.services.iot.model.EnableTopicRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableTopicRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.EnableTopicRuleResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.EnableTopicRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableTopicRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.EnableTopicRuleRequest request]
    (-> this (.enableTopicRuleAsync request))))

(defn list-things-in-thing-group-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.ListThingsInThingGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListThingsInThingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListThingsInThingGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListThingsInThingGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listThingsInThingGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListThingsInThingGroupRequest request]
    (-> this (.listThingsInThingGroupAsync request))))

(defn list-targets-for-security-profile-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.ListTargetsForSecurityProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTargetsForSecurityProfile operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListTargetsForSecurityProfileResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListTargetsForSecurityProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTargetsForSecurityProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListTargetsForSecurityProfileRequest request]
    (-> this (.listTargetsForSecurityProfileAsync request))))

(defn register-thing-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.RegisterThingRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterThing operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.RegisterThingResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.RegisterThingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerThingAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.RegisterThingRequest request]
    (-> this (.registerThingAsync request))))

(defn cancel-audit-task-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.CancelAuditTaskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelAuditTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CancelAuditTaskResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CancelAuditTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelAuditTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CancelAuditTaskRequest request]
    (-> this (.cancelAuditTaskAsync request))))

(defn list-audit-tasks-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.ListAuditTasksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAuditTasks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListAuditTasksResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListAuditTasksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAuditTasksAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListAuditTasksRequest request]
    (-> this (.listAuditTasksAsync request))))

(defn get-v-2-logging-options-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.GetV2LoggingOptionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetV2LoggingOptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.GetV2LoggingOptionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.GetV2LoggingOptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getV2LoggingOptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.GetV2LoggingOptionsRequest request]
    (-> this (.getV2LoggingOptionsAsync request))))

(defn get-registration-code-async
  "Description copied from interface: AWSIotAsync

  request - The input to the GetRegistrationCode operation. - `com.amazonaws.services.iot.model.GetRegistrationCodeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRegistrationCode operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.GetRegistrationCodeResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.GetRegistrationCodeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRegistrationCodeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.GetRegistrationCodeRequest request]
    (-> this (.getRegistrationCodeAsync request))))

(defn list-outgoing-certificates-async
  "Description copied from interface: AWSIotAsync

  request - The input to the ListOutgoingCertificates operation. - `com.amazonaws.services.iot.model.ListOutgoingCertificatesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListOutgoingCertificates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListOutgoingCertificatesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListOutgoingCertificatesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listOutgoingCertificatesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListOutgoingCertificatesRequest request]
    (-> this (.listOutgoingCertificatesAsync request))))

(defn replace-topic-rule-async
  "Description copied from interface: AWSIotAsync

  request - The input for the ReplaceTopicRule operation. - `com.amazonaws.services.iot.model.ReplaceTopicRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReplaceTopicRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ReplaceTopicRuleResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ReplaceTopicRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.replaceTopicRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ReplaceTopicRuleRequest request]
    (-> this (.replaceTopicRuleAsync request))))

(defn list-principal-things-async
  "Description copied from interface: AWSIotAsync

  request - The input for the ListPrincipalThings operation. - `com.amazonaws.services.iot.model.ListPrincipalThingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPrincipalThings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListPrincipalThingsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListPrincipalThingsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPrincipalThingsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListPrincipalThingsRequest request]
    (-> this (.listPrincipalThingsAsync request))))

(defn create-thing-group-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.CreateThingGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateThingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CreateThingGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CreateThingGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createThingGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CreateThingGroupRequest request]
    (-> this (.createThingGroupAsync request))))

(defn list-policy-versions-async
  "Description copied from interface: AWSIotAsync

  request - The input for the ListPolicyVersions operation. - `com.amazonaws.services.iot.model.ListPolicyVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPolicyVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListPolicyVersionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListPolicyVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPolicyVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListPolicyVersionsRequest request]
    (-> this (.listPolicyVersionsAsync request))))

(defn search-index-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.SearchIndexRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchIndex operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.SearchIndexResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.SearchIndexRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchIndexAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.SearchIndexRequest request]
    (-> this (.searchIndexAsync request))))

(defn detach-security-profile-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.DetachSecurityProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachSecurityProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DetachSecurityProfileResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DetachSecurityProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachSecurityProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DetachSecurityProfileRequest request]
    (-> this (.detachSecurityProfileAsync request))))

(defn add-thing-to-billing-group-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.AddThingToBillingGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddThingToBillingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.AddThingToBillingGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.AddThingToBillingGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addThingToBillingGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.AddThingToBillingGroupRequest request]
    (-> this (.addThingToBillingGroupAsync request))))

(defn start-on-demand-audit-task-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.StartOnDemandAuditTaskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartOnDemandAuditTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.StartOnDemandAuditTaskResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.StartOnDemandAuditTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startOnDemandAuditTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.StartOnDemandAuditTaskRequest request]
    (-> this (.startOnDemandAuditTaskAsync request))))

(defn describe-scheduled-audit-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.DescribeScheduledAuditRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeScheduledAudit operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeScheduledAuditResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeScheduledAuditRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeScheduledAuditAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DescribeScheduledAuditRequest request]
    (-> this (.describeScheduledAuditAsync request))))

(defn list-active-violations-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.ListActiveViolationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListActiveViolations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListActiveViolationsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListActiveViolationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listActiveViolationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListActiveViolationsRequest request]
    (-> this (.listActiveViolationsAsync request))))

(defn create-security-profile-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.CreateSecurityProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSecurityProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CreateSecurityProfileResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CreateSecurityProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSecurityProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.CreateSecurityProfileRequest request]
    (-> this (.createSecurityProfileAsync request))))

(defn get-topic-rule-async
  "Description copied from interface: AWSIotAsync

  request - The input for the GetTopicRule operation. - `com.amazonaws.services.iot.model.GetTopicRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTopicRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.GetTopicRuleResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.GetTopicRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTopicRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.GetTopicRuleRequest request]
    (-> this (.getTopicRuleAsync request))))

(defn update-billing-group-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.UpdateBillingGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateBillingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.UpdateBillingGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.UpdateBillingGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateBillingGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.UpdateBillingGroupRequest request]
    (-> this (.updateBillingGroupAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn list-thing-groups-for-thing-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.ListThingGroupsForThingRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListThingGroupsForThing operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListThingGroupsForThingResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListThingGroupsForThingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listThingGroupsForThingAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListThingGroupsForThingRequest request]
    (-> this (.listThingGroupsForThingAsync request))))

(defn update-authorizer-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.UpdateAuthorizerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAuthorizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.UpdateAuthorizerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.UpdateAuthorizerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAuthorizerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.UpdateAuthorizerRequest request]
    (-> this (.updateAuthorizerAsync request))))

(defn list-thing-principals-async
  "Description copied from interface: AWSIotAsync

  request - The input for the ListThingPrincipal operation. - `com.amazonaws.services.iot.model.ListThingPrincipalsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListThingPrincipals operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListThingPrincipalsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListThingPrincipalsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listThingPrincipalsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListThingPrincipalsRequest request]
    (-> this (.listThingPrincipalsAsync request))))

(defn delete-role-alias-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.DeleteRoleAliasRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRoleAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeleteRoleAliasResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeleteRoleAliasRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRoleAliasAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeleteRoleAliasRequest request]
    (-> this (.deleteRoleAliasAsync request))))

(defn list-thing-groups-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.ListThingGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListThingGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListThingGroupsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListThingGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listThingGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListThingGroupsRequest request]
    (-> this (.listThingGroupsAsync request))))

(defn list-topic-rules-async
  "Description copied from interface: AWSIotAsync

  request - The input for the ListTopicRules operation. - `com.amazonaws.services.iot.model.ListTopicRulesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTopicRules operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListTopicRulesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListTopicRulesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTopicRulesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListTopicRulesRequest request]
    (-> this (.listTopicRulesAsync request))))

(defn clear-default-authorizer-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.ClearDefaultAuthorizerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ClearDefaultAuthorizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ClearDefaultAuthorizerResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ClearDefaultAuthorizerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.clearDefaultAuthorizerAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ClearDefaultAuthorizerRequest request]
    (-> this (.clearDefaultAuthorizerAsync request))))

(defn list-security-profiles-for-target-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.ListSecurityProfilesForTargetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSecurityProfilesForTarget operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListSecurityProfilesForTargetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListSecurityProfilesForTargetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSecurityProfilesForTargetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.ListSecurityProfilesForTargetRequest request]
    (-> this (.listSecurityProfilesForTargetAsync request))))

(defn delete-stream-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.DeleteStreamRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeleteStreamResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeleteStreamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteStreamAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeleteStreamRequest request]
    (-> this (.deleteStreamAsync request))))

(defn start-thing-registration-task-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.StartThingRegistrationTaskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartThingRegistrationTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.StartThingRegistrationTaskResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.StartThingRegistrationTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startThingRegistrationTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.StartThingRegistrationTaskRequest request]
    (-> this (.startThingRegistrationTaskAsync request))))

(defn set-v-2-logging-options-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.SetV2LoggingOptionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetV2LoggingOptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.SetV2LoggingOptionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.SetV2LoggingOptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setV2LoggingOptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.SetV2LoggingOptionsRequest request]
    (-> this (.setV2LoggingOptionsAsync request))))

(defn delete-thing-group-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.DeleteThingGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteThingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeleteThingGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeleteThingGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteThingGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeleteThingGroupRequest request]
    (-> this (.deleteThingGroupAsync request))))

(defn delete-billing-group-async
  "Description copied from interface: AWSIotAsync

  request - `com.amazonaws.services.iot.model.DeleteBillingGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBillingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeleteBillingGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeleteBillingGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBillingGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSIotAsync this ^com.amazonaws.services.iot.model.DeleteBillingGroupRequest request]
    (-> this (.deleteBillingGroupAsync request))))

