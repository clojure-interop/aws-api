(ns com.amazonaws.services.iot.AWSIotAsync
  "Interface for accessing AWS IoT asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSIotAsync instead.


  AWS IoT

  AWS IoT provides secure, bi-directional communication between Internet-connected devices (such as sensors, actuators,
  embedded devices, or smart appliances) and the AWS cloud. You can discover your custom IoT-Data endpoint to
  communicate with, configure rules for data processing and integration with other services, organize resources
  associated with each device (Registry), configure logging, and create and manage policies and credentials to
  authenticate devices.


  For more information about how AWS IoT works, see the Developer Guide.


  For information about how to use the credentials provider for AWS IoT, see Authorizing Direct Calls to
  AWS Services."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.iot AWSIotAsync]))

(defn add-thing-to-thing-group-async
  "Adds a thing to a thing group.

  add-thing-to-thing-group-request - `com.amazonaws.services.iot.model.AddThingToThingGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddThingToThingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.AddThingToThingGroupResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.AddThingToThingGroupRequest add-thing-to-thing-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addThingToThingGroupAsync add-thing-to-thing-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.AddThingToThingGroupRequest add-thing-to-thing-group-request]
    (-> this (.addThingToThingGroupAsync add-thing-to-thing-group-request))))

(defn untag-resource-async
  "Removes the given tags (metadata) from the resource.

  untag-resource-request - `com.amazonaws.services.iot.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn update-dynamic-thing-group-async
  "Updates a dynamic thing group.

  update-dynamic-thing-group-request - `com.amazonaws.services.iot.model.UpdateDynamicThingGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDynamicThingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.UpdateDynamicThingGroupResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.UpdateDynamicThingGroupRequest update-dynamic-thing-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDynamicThingGroupAsync update-dynamic-thing-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.UpdateDynamicThingGroupRequest update-dynamic-thing-group-request]
    (-> this (.updateDynamicThingGroupAsync update-dynamic-thing-group-request))))

(defn describe-audit-task-async
  "Gets information about a Device Defender audit.

  describe-audit-task-request - `com.amazonaws.services.iot.model.DescribeAuditTaskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAuditTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeAuditTaskResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeAuditTaskRequest describe-audit-task-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAuditTaskAsync describe-audit-task-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeAuditTaskRequest describe-audit-task-request]
    (-> this (.describeAuditTaskAsync describe-audit-task-request))))

(defn describe-endpoint-async
  "Returns a unique endpoint specific to the AWS account making the call.

  describe-endpoint-request - The input for the DescribeEndpoint operation. - `com.amazonaws.services.iot.model.DescribeEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeEndpointResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeEndpointRequest describe-endpoint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEndpointAsync describe-endpoint-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeEndpointRequest describe-endpoint-request]
    (-> this (.describeEndpointAsync describe-endpoint-request))))

(defn list-thing-registration-tasks-async
  "List bulk thing provisioning tasks.

  list-thing-registration-tasks-request - `com.amazonaws.services.iot.model.ListThingRegistrationTasksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListThingRegistrationTasks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListThingRegistrationTasksResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListThingRegistrationTasksRequest list-thing-registration-tasks-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listThingRegistrationTasksAsync list-thing-registration-tasks-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListThingRegistrationTasksRequest list-thing-registration-tasks-request]
    (-> this (.listThingRegistrationTasksAsync list-thing-registration-tasks-request))))

(defn update-role-alias-async
  "Updates a role alias.

  update-role-alias-request - `com.amazonaws.services.iot.model.UpdateRoleAliasRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRoleAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.UpdateRoleAliasResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.UpdateRoleAliasRequest update-role-alias-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRoleAliasAsync update-role-alias-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.UpdateRoleAliasRequest update-role-alias-request]
    (-> this (.updateRoleAliasAsync update-role-alias-request))))

(defn detach-principal-policy-async
  "Deprecated.

  detach-principal-policy-request - The input for the DetachPrincipalPolicy operation. - `com.amazonaws.services.iot.model.DetachPrincipalPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachPrincipalPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DetachPrincipalPolicyResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DetachPrincipalPolicyRequest detach-principal-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachPrincipalPolicyAsync detach-principal-policy-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DetachPrincipalPolicyRequest detach-principal-policy-request]
    (-> this (.detachPrincipalPolicyAsync detach-principal-policy-request))))

(defn delete-job-async
  "Deletes a job and its related job executions.


   Deleting a job may take time, depending on the number of job executions created for the job and various other
   factors. While the job is being deleted, the status of the job will be shown as \"DELETION_IN_PROGRESS\".
   Attempting to delete or cancel a job whose status is already \"DELETION_IN_PROGRESS\" will result in an error.


   Only 10 jobs may have status \"DELETION_IN_PROGRESS\" at the same time, or a LimitExceededException will occur.

  delete-job-request - `com.amazonaws.services.iot.model.DeleteJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeleteJobResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeleteJobRequest delete-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteJobAsync delete-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeleteJobRequest delete-job-request]
    (-> this (.deleteJobAsync delete-job-request))))

(defn describe-security-profile-async
  "Gets information about a Device Defender security profile.

  describe-security-profile-request - `com.amazonaws.services.iot.model.DescribeSecurityProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSecurityProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeSecurityProfileResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeSecurityProfileRequest describe-security-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSecurityProfileAsync describe-security-profile-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeSecurityProfileRequest describe-security-profile-request]
    (-> this (.describeSecurityProfileAsync describe-security-profile-request))))

(defn delete-policy-async
  "Deletes the specified policy.


   A policy cannot be deleted if it has non-default versions or it is attached to any certificate.


   To delete a policy, use the DeletePolicyVersion API to delete all non-default versions of the policy; use the
   DetachPrincipalPolicy API to detach the policy from any certificate; and then use the DeletePolicy API to delete
   the policy.


   When a policy is deleted using DeletePolicy, its default version is deleted with it.

  delete-policy-request - The input for the DeletePolicy operation. - `com.amazonaws.services.iot.model.DeletePolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeletePolicyResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeletePolicyRequest delete-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePolicyAsync delete-policy-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeletePolicyRequest delete-policy-request]
    (-> this (.deletePolicyAsync delete-policy-request))))

(defn cancel-job-execution-async
  "Cancels the execution of a job for a given thing.

  cancel-job-execution-request - `com.amazonaws.services.iot.model.CancelJobExecutionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelJobExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CancelJobExecutionResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CancelJobExecutionRequest cancel-job-execution-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelJobExecutionAsync cancel-job-execution-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CancelJobExecutionRequest cancel-job-execution-request]
    (-> this (.cancelJobExecutionAsync cancel-job-execution-request))))

(defn delete-registration-code-async
  "Deletes a CA certificate registration code.

  delete-registration-code-request - The input for the DeleteRegistrationCode operation. - `com.amazonaws.services.iot.model.DeleteRegistrationCodeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRegistrationCode operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeleteRegistrationCodeResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeleteRegistrationCodeRequest delete-registration-code-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRegistrationCodeAsync delete-registration-code-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeleteRegistrationCodeRequest delete-registration-code-request]
    (-> this (.deleteRegistrationCodeAsync delete-registration-code-request))))

(defn delete-thing-async
  "Deletes the specified thing. Returns successfully with no error if the deletion is successful or you specify a
   thing that doesn't exist.

  delete-thing-request - The input for the DeleteThing operation. - `com.amazonaws.services.iot.model.DeleteThingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteThing operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeleteThingResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeleteThingRequest delete-thing-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteThingAsync delete-thing-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeleteThingRequest delete-thing-request]
    (-> this (.deleteThingAsync delete-thing-request))))

(defn create-keys-and-certificate-async
  "Creates a 2048-bit RSA key pair and issues an X.509 certificate using the issued public key.


   Note This is the only time AWS IoT issues the private key for this certificate, so it is important to keep
   it in a secure location.

  create-keys-and-certificate-request - The input for the CreateKeysAndCertificate operation. - `com.amazonaws.services.iot.model.CreateKeysAndCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateKeysAndCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CreateKeysAndCertificateResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CreateKeysAndCertificateRequest create-keys-and-certificate-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createKeysAndCertificateAsync create-keys-and-certificate-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CreateKeysAndCertificateRequest create-keys-and-certificate-request]
    (-> this (.createKeysAndCertificateAsync create-keys-and-certificate-request))))

(defn describe-job-async
  "Describes a job.

  describe-job-request - `com.amazonaws.services.iot.model.DescribeJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeJobResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeJobRequest describe-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeJobAsync describe-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeJobRequest describe-job-request]
    (-> this (.describeJobAsync describe-job-request))))

(defn create-authorizer-async
  "Creates an authorizer.

  create-authorizer-request - `com.amazonaws.services.iot.model.CreateAuthorizerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAuthorizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CreateAuthorizerResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CreateAuthorizerRequest create-authorizer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAuthorizerAsync create-authorizer-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CreateAuthorizerRequest create-authorizer-request]
    (-> this (.createAuthorizerAsync create-authorizer-request))))

(defn deprecate-thing-type-async
  "Deprecates a thing type. You can not associate new things with deprecated thing type.

  deprecate-thing-type-request - The input for the DeprecateThingType operation. - `com.amazonaws.services.iot.model.DeprecateThingTypeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeprecateThingType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeprecateThingTypeResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeprecateThingTypeRequest deprecate-thing-type-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deprecateThingTypeAsync deprecate-thing-type-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeprecateThingTypeRequest deprecate-thing-type-request]
    (-> this (.deprecateThingTypeAsync deprecate-thing-type-request))))

(defn set-logging-options-async
  "Sets the logging options.


   NOTE: use of this command is not recommended. Use SetV2LoggingOptions instead.

  set-logging-options-request - The input for the SetLoggingOptions operation. - `com.amazonaws.services.iot.model.SetLoggingOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetLoggingOptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.SetLoggingOptionsResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.SetLoggingOptionsRequest set-logging-options-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setLoggingOptionsAsync set-logging-options-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.SetLoggingOptionsRequest set-logging-options-request]
    (-> this (.setLoggingOptionsAsync set-logging-options-request))))

(defn describe-thing-type-async
  "Gets information about the specified thing type.

  describe-thing-type-request - The input for the DescribeThingType operation. - `com.amazonaws.services.iot.model.DescribeThingTypeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeThingType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeThingTypeResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeThingTypeRequest describe-thing-type-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeThingTypeAsync describe-thing-type-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeThingTypeRequest describe-thing-type-request]
    (-> this (.describeThingTypeAsync describe-thing-type-request))))

(defn delete-topic-rule-async
  "Deletes the rule.

  delete-topic-rule-request - The input for the DeleteTopicRule operation. - `com.amazonaws.services.iot.model.DeleteTopicRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTopicRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeleteTopicRuleResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeleteTopicRuleRequest delete-topic-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTopicRuleAsync delete-topic-rule-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeleteTopicRuleRequest delete-topic-rule-request]
    (-> this (.deleteTopicRuleAsync delete-topic-rule-request))))

(defn delete-job-execution-async
  "Deletes a job execution.

  delete-job-execution-request - `com.amazonaws.services.iot.model.DeleteJobExecutionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteJobExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeleteJobExecutionResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeleteJobExecutionRequest delete-job-execution-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteJobExecutionAsync delete-job-execution-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeleteJobExecutionRequest delete-job-execution-request]
    (-> this (.deleteJobExecutionAsync delete-job-execution-request))))

(defn delete-security-profile-async
  "Deletes a Device Defender security profile.

  delete-security-profile-request - `com.amazonaws.services.iot.model.DeleteSecurityProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSecurityProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeleteSecurityProfileResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeleteSecurityProfileRequest delete-security-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSecurityProfileAsync delete-security-profile-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeleteSecurityProfileRequest delete-security-profile-request]
    (-> this (.deleteSecurityProfileAsync delete-security-profile-request))))

(defn delete-dynamic-thing-group-async
  "Deletes a dynamic thing group.

  delete-dynamic-thing-group-request - `com.amazonaws.services.iot.model.DeleteDynamicThingGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDynamicThingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeleteDynamicThingGroupResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeleteDynamicThingGroupRequest delete-dynamic-thing-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDynamicThingGroupAsync delete-dynamic-thing-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeleteDynamicThingGroupRequest delete-dynamic-thing-group-request]
    (-> this (.deleteDynamicThingGroupAsync delete-dynamic-thing-group-request))))

(defn list-jobs-async
  "Lists jobs.

  list-jobs-request - `com.amazonaws.services.iot.model.ListJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListJobsResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListJobsRequest list-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listJobsAsync list-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListJobsRequest list-jobs-request]
    (-> this (.listJobsAsync list-jobs-request))))

(defn validate-security-profile-behaviors-async
  "Validates a Device Defender security profile behaviors specification.

  validate-security-profile-behaviors-request - `com.amazonaws.services.iot.model.ValidateSecurityProfileBehaviorsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ValidateSecurityProfileBehaviors operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ValidateSecurityProfileBehaviorsResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ValidateSecurityProfileBehaviorsRequest validate-security-profile-behaviors-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.validateSecurityProfileBehaviorsAsync validate-security-profile-behaviors-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ValidateSecurityProfileBehaviorsRequest validate-security-profile-behaviors-request]
    (-> this (.validateSecurityProfileBehaviorsAsync validate-security-profile-behaviors-request))))

(defn associate-targets-with-job-async
  "Associates a group with a continuous job. The following criteria must be met:




   The job must have been created with the targetSelection field set to \"CONTINUOUS\".




   The job status must currently be \"IN_PROGRESS\".




   The total number of targets associated with a job must not exceed 100.

  associate-targets-with-job-request - `com.amazonaws.services.iot.model.AssociateTargetsWithJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateTargetsWithJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.AssociateTargetsWithJobResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.AssociateTargetsWithJobRequest associate-targets-with-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateTargetsWithJobAsync associate-targets-with-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.AssociateTargetsWithJobRequest associate-targets-with-job-request]
    (-> this (.associateTargetsWithJobAsync associate-targets-with-job-request))))

(defn attach-thing-principal-async
  "Attaches the specified principal to the specified thing. A principal can be X.509 certificates, IAM users,
   groups, and roles, Amazon Cognito identities or federated identities.

  attach-thing-principal-request - The input for the AttachThingPrincipal operation. - `com.amazonaws.services.iot.model.AttachThingPrincipalRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachThingPrincipal operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.AttachThingPrincipalResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.AttachThingPrincipalRequest attach-thing-principal-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachThingPrincipalAsync attach-thing-principal-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.AttachThingPrincipalRequest attach-thing-principal-request]
    (-> this (.attachThingPrincipalAsync attach-thing-principal-request))))

(defn create-billing-group-async
  "Creates a billing group.

  create-billing-group-request - `com.amazonaws.services.iot.model.CreateBillingGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateBillingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CreateBillingGroupResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CreateBillingGroupRequest create-billing-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createBillingGroupAsync create-billing-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CreateBillingGroupRequest create-billing-group-request]
    (-> this (.createBillingGroupAsync create-billing-group-request))))

(defn create-thing-async
  "Creates a thing record in the registry. If this call is made multiple times using the same thing name and
   configuration, the call will succeed. If this call is made with the same thing name but different configuration a
   ResourceAlreadyExistsException is thrown.



   This is a control plane operation. See Authorization for information
   about authorizing control plane actions.

  create-thing-request - The input for the CreateThing operation. - `com.amazonaws.services.iot.model.CreateThingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateThing operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CreateThingResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CreateThingRequest create-thing-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createThingAsync create-thing-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CreateThingRequest create-thing-request]
    (-> this (.createThingAsync create-thing-request))))

(defn update-security-profile-async
  "Updates a Device Defender security profile.

  update-security-profile-request - `com.amazonaws.services.iot.model.UpdateSecurityProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSecurityProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.UpdateSecurityProfileResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.UpdateSecurityProfileRequest update-security-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSecurityProfileAsync update-security-profile-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.UpdateSecurityProfileRequest update-security-profile-request]
    (-> this (.updateSecurityProfileAsync update-security-profile-request))))

(defn attach-policy-async
  "Attaches a policy to the specified target.

  attach-policy-request - `com.amazonaws.services.iot.model.AttachPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.AttachPolicyResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.AttachPolicyRequest attach-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachPolicyAsync attach-policy-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.AttachPolicyRequest attach-policy-request]
    (-> this (.attachPolicyAsync attach-policy-request))))

(defn create-policy-async
  "Creates an AWS IoT policy.


   The created policy is the default version for the policy. This operation creates a policy version with a version
   identifier of 1 and sets 1 as the policy's default version.

  create-policy-request - The input for the CreatePolicy operation. - `com.amazonaws.services.iot.model.CreatePolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CreatePolicyResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CreatePolicyRequest create-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPolicyAsync create-policy-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CreatePolicyRequest create-policy-request]
    (-> this (.createPolicyAsync create-policy-request))))

(defn create-stream-async
  "Creates a stream for delivering one or more large files in chunks over MQTT. A stream transports data bytes in
   chunks or blocks packaged as MQTT messages from a source like S3. You can have one or more files associated with
   a stream. The total size of a file associated with the stream cannot exceed more than 2 MB. The stream will be
   created with version 0. If a stream is created with the same streamID as a stream that existed and was deleted
   within last 90 days, we will resurrect that old stream by incrementing the version by 1.

  create-stream-request - `com.amazonaws.services.iot.model.CreateStreamRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CreateStreamResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CreateStreamRequest create-stream-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createStreamAsync create-stream-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CreateStreamRequest create-stream-request]
    (-> this (.createStreamAsync create-stream-request))))

(defn cancel-certificate-transfer-async
  "Cancels a pending transfer for the specified certificate.


   Note Only the transfer source account can use this operation to cancel a transfer. (Transfer destinations
   can use RejectCertificateTransfer instead.) After transfer, AWS IoT returns the certificate to the source
   account in the INACTIVE state. After the destination account has accepted the transfer, the transfer cannot be
   cancelled.


   After a certificate transfer is cancelled, the status of the certificate changes from PENDING_TRANSFER to
   INACTIVE.

  cancel-certificate-transfer-request - The input for the CancelCertificateTransfer operation. - `com.amazonaws.services.iot.model.CancelCertificateTransferRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelCertificateTransfer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CancelCertificateTransferResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CancelCertificateTransferRequest cancel-certificate-transfer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelCertificateTransferAsync cancel-certificate-transfer-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CancelCertificateTransferRequest cancel-certificate-transfer-request]
    (-> this (.cancelCertificateTransferAsync cancel-certificate-transfer-request))))

(defn list-audit-findings-async
  "Lists the findings (results) of a Device Defender audit or of the audits performed during a specified time
   period. (Findings are retained for 180 days.)

  list-audit-findings-request - `com.amazonaws.services.iot.model.ListAuditFindingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAuditFindings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListAuditFindingsResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListAuditFindingsRequest list-audit-findings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAuditFindingsAsync list-audit-findings-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListAuditFindingsRequest list-audit-findings-request]
    (-> this (.listAuditFindingsAsync list-audit-findings-request))))

(defn delete-thing-type-async
  "Deletes the specified thing type. You cannot delete a thing type if it has things associated with it. To delete a
   thing type, first mark it as deprecated by calling DeprecateThingType, then remove any associated things
   by calling UpdateThing to change the thing type on any associated thing, and finally use
   DeleteThingType to delete the thing type.

  delete-thing-type-request - The input for the DeleteThingType operation. - `com.amazonaws.services.iot.model.DeleteThingTypeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteThingType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeleteThingTypeResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeleteThingTypeRequest delete-thing-type-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteThingTypeAsync delete-thing-type-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeleteThingTypeRequest delete-thing-type-request]
    (-> this (.deleteThingTypeAsync delete-thing-type-request))))

(defn list-thing-types-async
  "Lists the existing thing types.

  list-thing-types-request - The input for the ListThingTypes operation. - `com.amazonaws.services.iot.model.ListThingTypesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListThingTypes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListThingTypesResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListThingTypesRequest list-thing-types-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listThingTypesAsync list-thing-types-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListThingTypesRequest list-thing-types-request]
    (-> this (.listThingTypesAsync list-thing-types-request))))

(defn transfer-certificate-async
  "Transfers the specified certificate to the specified AWS account.


   You can cancel the transfer until it is acknowledged by the recipient.


   No notification is sent to the transfer destination's account. It is up to the caller to notify the transfer
   target.


   The certificate being transferred must not be in the ACTIVE state. You can use the UpdateCertificate API to
   deactivate it.


   The certificate must not have any policies attached to it. You can use the DetachPrincipalPolicy API to detach
   them.

  transfer-certificate-request - The input for the TransferCertificate operation. - `com.amazonaws.services.iot.model.TransferCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TransferCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.TransferCertificateResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.TransferCertificateRequest transfer-certificate-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.transferCertificateAsync transfer-certificate-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.TransferCertificateRequest transfer-certificate-request]
    (-> this (.transferCertificateAsync transfer-certificate-request))))

(defn list-violation-events-async
  "Lists the Device Defender security profile violations discovered during the given time period. You can use
   filters to limit the results to those alerts issued for a particular security profile, behavior or thing
   (device).

  list-violation-events-request - `com.amazonaws.services.iot.model.ListViolationEventsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListViolationEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListViolationEventsResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListViolationEventsRequest list-violation-events-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listViolationEventsAsync list-violation-events-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListViolationEventsRequest list-violation-events-request]
    (-> this (.listViolationEventsAsync list-violation-events-request))))

(defn test-authorization-async
  "Tests if a specified principal is authorized to perform an AWS IoT action on a specified resource. Use this to
   test and debug the authorization behavior of devices that connect to the AWS IoT device gateway.

  test-authorization-request - `com.amazonaws.services.iot.model.TestAuthorizationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TestAuthorization operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.TestAuthorizationResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.TestAuthorizationRequest test-authorization-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.testAuthorizationAsync test-authorization-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.TestAuthorizationRequest test-authorization-request]
    (-> this (.testAuthorizationAsync test-authorization-request))))

(defn list-job-executions-for-job-async
  "Lists the job executions for a job.

  list-job-executions-for-job-request - `com.amazonaws.services.iot.model.ListJobExecutionsForJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListJobExecutionsForJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListJobExecutionsForJobResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListJobExecutionsForJobRequest list-job-executions-for-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listJobExecutionsForJobAsync list-job-executions-for-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListJobExecutionsForJobRequest list-job-executions-for-job-request]
    (-> this (.listJobExecutionsForJobAsync list-job-executions-for-job-request))))

(defn delete-ota-update-async
  "Delete an OTA update.

  delete-ota-update-request - `com.amazonaws.services.iot.model.DeleteOTAUpdateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteOTAUpdate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeleteOTAUpdateResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeleteOTAUpdateRequest delete-ota-update-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteOTAUpdateAsync delete-ota-update-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeleteOTAUpdateRequest delete-ota-update-request]
    (-> this (.deleteOTAUpdateAsync delete-ota-update-request))))

(defn describe-billing-group-async
  "Returns information about a billing group.

  describe-billing-group-request - `com.amazonaws.services.iot.model.DescribeBillingGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeBillingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeBillingGroupResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeBillingGroupRequest describe-billing-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeBillingGroupAsync describe-billing-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeBillingGroupRequest describe-billing-group-request]
    (-> this (.describeBillingGroupAsync describe-billing-group-request))))

(defn get-statistics-async
  "Gets statistics about things that match the specified query.

  get-statistics-request - `com.amazonaws.services.iot.model.GetStatisticsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetStatistics operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.GetStatisticsResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.GetStatisticsRequest get-statistics-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getStatisticsAsync get-statistics-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.GetStatisticsRequest get-statistics-request]
    (-> this (.getStatisticsAsync get-statistics-request))))

(defn describe-default-authorizer-async
  "Describes the default authorizer.

  describe-default-authorizer-request - `com.amazonaws.services.iot.model.DescribeDefaultAuthorizerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDefaultAuthorizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeDefaultAuthorizerResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeDefaultAuthorizerRequest describe-default-authorizer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDefaultAuthorizerAsync describe-default-authorizer-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeDefaultAuthorizerRequest describe-default-authorizer-request]
    (-> this (.describeDefaultAuthorizerAsync describe-default-authorizer-request))))

(defn delete-authorizer-async
  "Deletes an authorizer.

  delete-authorizer-request - `com.amazonaws.services.iot.model.DeleteAuthorizerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAuthorizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeleteAuthorizerResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeleteAuthorizerRequest delete-authorizer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAuthorizerAsync delete-authorizer-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeleteAuthorizerRequest delete-authorizer-request]
    (-> this (.deleteAuthorizerAsync delete-authorizer-request))))

(defn test-invoke-authorizer-async
  "Tests a custom authorization behavior by invoking a specified custom authorizer. Use this to test and debug the
   custom authorization behavior of devices that connect to the AWS IoT device gateway.

  test-invoke-authorizer-request - `com.amazonaws.services.iot.model.TestInvokeAuthorizerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TestInvokeAuthorizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.TestInvokeAuthorizerResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.TestInvokeAuthorizerRequest test-invoke-authorizer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.testInvokeAuthorizerAsync test-invoke-authorizer-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.TestInvokeAuthorizerRequest test-invoke-authorizer-request]
    (-> this (.testInvokeAuthorizerAsync test-invoke-authorizer-request))))

(defn update-stream-async
  "Updates an existing stream. The stream version will be incremented by one.

  update-stream-request - `com.amazonaws.services.iot.model.UpdateStreamRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.UpdateStreamResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.UpdateStreamRequest update-stream-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateStreamAsync update-stream-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.UpdateStreamRequest update-stream-request]
    (-> this (.updateStreamAsync update-stream-request))))

(defn delete-ca-certificate-async
  "Deletes a registered CA certificate.

  delete-ca-certificate-request - Input for the DeleteCACertificate operation. - `com.amazonaws.services.iot.model.DeleteCACertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCACertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeleteCACertificateResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeleteCACertificateRequest delete-ca-certificate-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCACertificateAsync delete-ca-certificate-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeleteCACertificateRequest delete-ca-certificate-request]
    (-> this (.deleteCACertificateAsync delete-ca-certificate-request))))

(defn register-certificate-async
  "Registers a device certificate with AWS IoT. If you have more than one CA certificate that has the same subject
   field, you must specify the CA certificate that was used to sign the device certificate being registered.

  register-certificate-request - The input to the RegisterCertificate operation. - `com.amazonaws.services.iot.model.RegisterCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.RegisterCertificateResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.RegisterCertificateRequest register-certificate-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerCertificateAsync register-certificate-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.RegisterCertificateRequest register-certificate-request]
    (-> this (.registerCertificateAsync register-certificate-request))))

(defn remove-thing-from-billing-group-async
  "Removes the given thing from the billing group.

  remove-thing-from-billing-group-request - `com.amazonaws.services.iot.model.RemoveThingFromBillingGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveThingFromBillingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.RemoveThingFromBillingGroupResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.RemoveThingFromBillingGroupRequest remove-thing-from-billing-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeThingFromBillingGroupAsync remove-thing-from-billing-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.RemoveThingFromBillingGroupRequest remove-thing-from-billing-group-request]
    (-> this (.removeThingFromBillingGroupAsync remove-thing-from-billing-group-request))))

(defn get-ota-update-async
  "Gets an OTA update.

  get-ota-update-request - `com.amazonaws.services.iot.model.GetOTAUpdateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetOTAUpdate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.GetOTAUpdateResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.GetOTAUpdateRequest get-ota-update-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getOTAUpdateAsync get-ota-update-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.GetOTAUpdateRequest get-ota-update-request]
    (-> this (.getOTAUpdateAsync get-ota-update-request))))

(defn list-things-in-billing-group-async
  "Lists the things you have added to the given billing group.

  list-things-in-billing-group-request - `com.amazonaws.services.iot.model.ListThingsInBillingGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListThingsInBillingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListThingsInBillingGroupResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListThingsInBillingGroupRequest list-things-in-billing-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listThingsInBillingGroupAsync list-things-in-billing-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListThingsInBillingGroupRequest list-things-in-billing-group-request]
    (-> this (.listThingsInBillingGroupAsync list-things-in-billing-group-request))))

(defn remove-thing-from-thing-group-async
  "Remove the specified thing from the specified group.

  remove-thing-from-thing-group-request - `com.amazonaws.services.iot.model.RemoveThingFromThingGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveThingFromThingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.RemoveThingFromThingGroupResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.RemoveThingFromThingGroupRequest remove-thing-from-thing-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeThingFromThingGroupAsync remove-thing-from-thing-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.RemoveThingFromThingGroupRequest remove-thing-from-thing-group-request]
    (-> this (.removeThingFromThingGroupAsync remove-thing-from-thing-group-request))))

(defn register-ca-certificate-async
  "Registers a CA certificate with AWS IoT. This CA certificate can then be used to sign device certificates, which
   can be then registered with AWS IoT. You can register up to 10 CA certificates per AWS account that have the same
   subject field. This enables you to have up to 10 certificate authorities sign your device certificates. If you
   have more than one CA certificate registered, make sure you pass the CA certificate when you register your device
   certificates with the RegisterCertificate API.

  register-ca-certificate-request - The input to the RegisterCACertificate operation. - `com.amazonaws.services.iot.model.RegisterCACertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterCACertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.RegisterCACertificateResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.RegisterCACertificateRequest register-ca-certificate-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerCACertificateAsync register-ca-certificate-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.RegisterCACertificateRequest register-ca-certificate-request]
    (-> this (.registerCACertificateAsync register-ca-certificate-request))))

(defn set-default-authorizer-async
  "Sets the default authorizer. This will be used if a websocket connection is made without specifying an
   authorizer.

  set-default-authorizer-request - `com.amazonaws.services.iot.model.SetDefaultAuthorizerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetDefaultAuthorizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.SetDefaultAuthorizerResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.SetDefaultAuthorizerRequest set-default-authorizer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setDefaultAuthorizerAsync set-default-authorizer-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.SetDefaultAuthorizerRequest set-default-authorizer-request]
    (-> this (.setDefaultAuthorizerAsync set-default-authorizer-request))))

(defn delete-policy-version-async
  "Deletes the specified version of the specified policy. You cannot delete the default version of a policy using
   this API. To delete the default version of a policy, use DeletePolicy. To find out which version of a
   policy is marked as the default version, use ListPolicyVersions.

  delete-policy-version-request - The input for the DeletePolicyVersion operation. - `com.amazonaws.services.iot.model.DeletePolicyVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePolicyVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeletePolicyVersionResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeletePolicyVersionRequest delete-policy-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePolicyVersionAsync delete-policy-version-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeletePolicyVersionRequest delete-policy-version-request]
    (-> this (.deletePolicyVersionAsync delete-policy-version-request))))

(defn update-thing-group-async
  "Update a thing group.

  update-thing-group-request - `com.amazonaws.services.iot.model.UpdateThingGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateThingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.UpdateThingGroupResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.UpdateThingGroupRequest update-thing-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateThingGroupAsync update-thing-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.UpdateThingGroupRequest update-thing-group-request]
    (-> this (.updateThingGroupAsync update-thing-group-request))))

(defn list-streams-async
  "Lists all of the streams in your AWS account.

  list-streams-request - `com.amazonaws.services.iot.model.ListStreamsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListStreams operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListStreamsResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListStreamsRequest list-streams-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listStreamsAsync list-streams-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListStreamsRequest list-streams-request]
    (-> this (.listStreamsAsync list-streams-request))))

(defn update-ca-certificate-async
  "Updates a registered CA certificate.

  update-ca-certificate-request - The input to the UpdateCACertificate operation. - `com.amazonaws.services.iot.model.UpdateCACertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateCACertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.UpdateCACertificateResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.UpdateCACertificateRequest update-ca-certificate-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateCACertificateAsync update-ca-certificate-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.UpdateCACertificateRequest update-ca-certificate-request]
    (-> this (.updateCACertificateAsync update-ca-certificate-request))))

(defn get-effective-policies-async
  "Gets a list of the policies that have an effect on the authorization behavior of the specified device when it
   connects to the AWS IoT device gateway.

  get-effective-policies-request - `com.amazonaws.services.iot.model.GetEffectivePoliciesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetEffectivePolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.GetEffectivePoliciesResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.GetEffectivePoliciesRequest get-effective-policies-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getEffectivePoliciesAsync get-effective-policies-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.GetEffectivePoliciesRequest get-effective-policies-request]
    (-> this (.getEffectivePoliciesAsync get-effective-policies-request))))

(defn list-things-async
  "Lists your things. Use the attributeName and attributeValue parameters to filter your things. For
   example, calling ListThings with attributeName=Color and attributeValue=Red retrieves all things in
   the registry that contain an attribute Color with the value Red.

  list-things-request - The input for the ListThings operation. - `com.amazonaws.services.iot.model.ListThingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListThings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListThingsResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListThingsRequest list-things-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listThingsAsync list-things-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListThingsRequest list-things-request]
    (-> this (.listThingsAsync list-things-request))))

(defn list-scheduled-audits-async
  "Lists all of your scheduled audits.

  list-scheduled-audits-request - `com.amazonaws.services.iot.model.ListScheduledAuditsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListScheduledAudits operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListScheduledAuditsResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListScheduledAuditsRequest list-scheduled-audits-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listScheduledAuditsAsync list-scheduled-audits-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListScheduledAuditsRequest list-scheduled-audits-request]
    (-> this (.listScheduledAuditsAsync list-scheduled-audits-request))))

(defn detach-policy-async
  "Detaches a policy from the specified target.

  detach-policy-request - `com.amazonaws.services.iot.model.DetachPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DetachPolicyResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DetachPolicyRequest detach-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachPolicyAsync detach-policy-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DetachPolicyRequest detach-policy-request]
    (-> this (.detachPolicyAsync detach-policy-request))))

(defn update-scheduled-audit-async
  "Updates a scheduled audit, including what checks are performed and how often the audit takes place.

  update-scheduled-audit-request - `com.amazonaws.services.iot.model.UpdateScheduledAuditRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateScheduledAudit operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.UpdateScheduledAuditResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.UpdateScheduledAuditRequest update-scheduled-audit-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateScheduledAuditAsync update-scheduled-audit-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.UpdateScheduledAuditRequest update-scheduled-audit-request]
    (-> this (.updateScheduledAuditAsync update-scheduled-audit-request))))

(defn create-certificate-from-csr-async
  "Creates an X.509 certificate using the specified certificate signing request.


   Note: The CSR must include a public key that is either an RSA key with a length of at least 2048 bits or
   an ECC key from NIST P-256 or NIST P-384 curves.


   Note: Reusing the same certificate signing request (CSR) results in a distinct certificate.


   You can create multiple certificates in a batch by creating a directory, copying multiple .csr files into that
   directory, and then specifying that directory on the command line. The following commands show how to create a
   batch of certificates given a batch of CSRs.


   Assuming a set of CSRs are located inside of the directory my-csr-directory:


   On Linux and OS X, the command is:


   $ ls my-csr-directory/ | xargs -I {} aws iot create-certificate-from-csr --certificate-signing-request
   file://my-csr-directory/{}


   This command lists all of the CSRs in my-csr-directory and pipes each CSR file name to the aws iot
   create-certificate-from-csr AWS CLI command to create a certificate for the corresponding CSR.


   The aws iot create-certificate-from-csr part of the command can also be run in parallel to speed up the
   certificate creation process:


   $ ls my-csr-directory/ | xargs -P 10 -I {} aws iot create-certificate-from-csr --certificate-signing-request
   file://my-csr-directory/{}


   On Windows PowerShell, the command to create certificates for all CSRs in my-csr-directory is:


   > ls -Name my-csr-directory | %{aws iot create-certificate-from-csr --certificate-signing-request
   file://my-csr-directory/$_}


   On a Windows command prompt, the command to create certificates for all CSRs in my-csr-directory is:


   > forfiles /p my-csr-directory /c
   \"cmd /c aws iot create-certificate-from-csr --certificate-signing-request file://@path\"

  create-certificate-from-csr-request - The input for the CreateCertificateFromCsr operation. - `com.amazonaws.services.iot.model.CreateCertificateFromCsrRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCertificateFromCsr operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CreateCertificateFromCsrResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CreateCertificateFromCsrRequest create-certificate-from-csr-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCertificateFromCsrAsync create-certificate-from-csr-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CreateCertificateFromCsrRequest create-certificate-from-csr-request]
    (-> this (.createCertificateFromCsrAsync create-certificate-from-csr-request))))

(defn list-job-executions-for-thing-async
  "Lists the job executions for the specified thing.

  list-job-executions-for-thing-request - `com.amazonaws.services.iot.model.ListJobExecutionsForThingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListJobExecutionsForThing operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListJobExecutionsForThingResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListJobExecutionsForThingRequest list-job-executions-for-thing-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listJobExecutionsForThingAsync list-job-executions-for-thing-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListJobExecutionsForThingRequest list-job-executions-for-thing-request]
    (-> this (.listJobExecutionsForThingAsync list-job-executions-for-thing-request))))

(defn attach-security-profile-async
  "Associates a Device Defender security profile with a thing group or with this account. Each thing group or
   account can have up to five security profiles associated with it.

  attach-security-profile-request - `com.amazonaws.services.iot.model.AttachSecurityProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachSecurityProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.AttachSecurityProfileResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.AttachSecurityProfileRequest attach-security-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachSecurityProfileAsync attach-security-profile-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.AttachSecurityProfileRequest attach-security-profile-request]
    (-> this (.attachSecurityProfileAsync attach-security-profile-request))))

(defn describe-certificate-async
  "Gets information about the specified certificate.

  describe-certificate-request - The input for the DescribeCertificate operation. - `com.amazonaws.services.iot.model.DescribeCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeCertificateResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeCertificateRequest describe-certificate-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCertificateAsync describe-certificate-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeCertificateRequest describe-certificate-request]
    (-> this (.describeCertificateAsync describe-certificate-request))))

(defn describe-index-async
  "Describes a search index.

  describe-index-request - `com.amazonaws.services.iot.model.DescribeIndexRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeIndex operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeIndexResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeIndexRequest describe-index-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeIndexAsync describe-index-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeIndexRequest describe-index-request]
    (-> this (.describeIndexAsync describe-index-request))))

(defn reject-certificate-transfer-async
  "Rejects a pending certificate transfer. After AWS IoT rejects a certificate transfer, the certificate status
   changes from PENDING_TRANSFER to INACTIVE.


   To check for pending certificate transfers, call ListCertificates to enumerate your certificates.


   This operation can only be called by the transfer destination. After it is called, the certificate will be
   returned to the source's account in the INACTIVE state.

  reject-certificate-transfer-request - The input for the RejectCertificateTransfer operation. - `com.amazonaws.services.iot.model.RejectCertificateTransferRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RejectCertificateTransfer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.RejectCertificateTransferResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.RejectCertificateTransferRequest reject-certificate-transfer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rejectCertificateTransferAsync reject-certificate-transfer-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.RejectCertificateTransferRequest reject-certificate-transfer-request]
    (-> this (.rejectCertificateTransferAsync reject-certificate-transfer-request))))

(defn create-thing-type-async
  "Creates a new thing type.

  create-thing-type-request - The input for the CreateThingType operation. - `com.amazonaws.services.iot.model.CreateThingTypeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateThingType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CreateThingTypeResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CreateThingTypeRequest create-thing-type-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createThingTypeAsync create-thing-type-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CreateThingTypeRequest create-thing-type-request]
    (-> this (.createThingTypeAsync create-thing-type-request))))

(defn create-role-alias-async
  "Creates a role alias.

  create-role-alias-request - `com.amazonaws.services.iot.model.CreateRoleAliasRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRoleAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CreateRoleAliasResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CreateRoleAliasRequest create-role-alias-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRoleAliasAsync create-role-alias-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CreateRoleAliasRequest create-role-alias-request]
    (-> this (.createRoleAliasAsync create-role-alias-request))))

(defn update-certificate-async
  "Updates the status of the specified certificate. This operation is idempotent.


   Moving a certificate from the ACTIVE state (including REVOKED) will not disconnect currently connected devices,
   but these devices will be unable to reconnect.


   The ACTIVE state is required to authenticate devices connecting to AWS IoT using a certificate.

  update-certificate-request - The input for the UpdateCertificate operation. - `com.amazonaws.services.iot.model.UpdateCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.UpdateCertificateResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.UpdateCertificateRequest update-certificate-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateCertificateAsync update-certificate-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.UpdateCertificateRequest update-certificate-request]
    (-> this (.updateCertificateAsync update-certificate-request))))

(defn delete-v-2-logging-level-async
  "Deletes a logging level.

  delete-v-2-logging-level-request - `com.amazonaws.services.iot.model.DeleteV2LoggingLevelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteV2LoggingLevel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeleteV2LoggingLevelResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeleteV2LoggingLevelRequest delete-v-2-logging-level-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteV2LoggingLevelAsync delete-v-2-logging-level-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeleteV2LoggingLevelRequest delete-v-2-logging-level-request]
    (-> this (.deleteV2LoggingLevelAsync delete-v-2-logging-level-request))))

(defn update-thing-groups-for-thing-async
  "Updates the groups to which the thing belongs.

  update-thing-groups-for-thing-request - `com.amazonaws.services.iot.model.UpdateThingGroupsForThingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateThingGroupsForThing operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.UpdateThingGroupsForThingResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.UpdateThingGroupsForThingRequest update-thing-groups-for-thing-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateThingGroupsForThingAsync update-thing-groups-for-thing-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.UpdateThingGroupsForThingRequest update-thing-groups-for-thing-request]
    (-> this (.updateThingGroupsForThingAsync update-thing-groups-for-thing-request))))

(defn describe-thing-group-async
  "Describe a thing group.

  describe-thing-group-request - `com.amazonaws.services.iot.model.DescribeThingGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeThingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeThingGroupResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeThingGroupRequest describe-thing-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeThingGroupAsync describe-thing-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeThingGroupRequest describe-thing-group-request]
    (-> this (.describeThingGroupAsync describe-thing-group-request))))

(defn describe-account-audit-configuration-async
  "Gets information about the Device Defender audit settings for this account. Settings include how audit
   notifications are sent and which audit checks are enabled or disabled.

  describe-account-audit-configuration-request - `com.amazonaws.services.iot.model.DescribeAccountAuditConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAccountAuditConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeAccountAuditConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeAccountAuditConfigurationRequest describe-account-audit-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAccountAuditConfigurationAsync describe-account-audit-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeAccountAuditConfigurationRequest describe-account-audit-configuration-request]
    (-> this (.describeAccountAuditConfigurationAsync describe-account-audit-configuration-request))))

(defn describe-stream-async
  "Gets information about a stream.

  describe-stream-request - `com.amazonaws.services.iot.model.DescribeStreamRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeStreamResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeStreamRequest describe-stream-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStreamAsync describe-stream-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeStreamRequest describe-stream-request]
    (-> this (.describeStreamAsync describe-stream-request))))

(defn list-billing-groups-async
  "Lists the billing groups you have created.

  list-billing-groups-request - `com.amazonaws.services.iot.model.ListBillingGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBillingGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListBillingGroupsResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListBillingGroupsRequest list-billing-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBillingGroupsAsync list-billing-groups-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListBillingGroupsRequest list-billing-groups-request]
    (-> this (.listBillingGroupsAsync list-billing-groups-request))))

(defn describe-role-alias-async
  "Describes a role alias.

  describe-role-alias-request - `com.amazonaws.services.iot.model.DescribeRoleAliasRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRoleAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeRoleAliasResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeRoleAliasRequest describe-role-alias-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRoleAliasAsync describe-role-alias-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeRoleAliasRequest describe-role-alias-request]
    (-> this (.describeRoleAliasAsync describe-role-alias-request))))

(defn list-role-aliases-async
  "Lists the role aliases registered in your account.

  list-role-aliases-request - `com.amazonaws.services.iot.model.ListRoleAliasesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRoleAliases operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListRoleAliasesResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListRoleAliasesRequest list-role-aliases-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRoleAliasesAsync list-role-aliases-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListRoleAliasesRequest list-role-aliases-request]
    (-> this (.listRoleAliasesAsync list-role-aliases-request))))

(defn list-ca-certificates-async
  "Lists the CA certificates registered for your AWS account.


   The results are paginated with a default page size of 25. You can use the returned marker to retrieve additional
   results.

  list-ca-certificates-request - Input for the ListCACertificates operation. - `com.amazonaws.services.iot.model.ListCACertificatesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCACertificates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListCACertificatesResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListCACertificatesRequest list-ca-certificates-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCACertificatesAsync list-ca-certificates-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListCACertificatesRequest list-ca-certificates-request]
    (-> this (.listCACertificatesAsync list-ca-certificates-request))))

(defn list-indices-async
  "Lists the search indices.

  list-indices-request - `com.amazonaws.services.iot.model.ListIndicesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListIndices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListIndicesResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListIndicesRequest list-indices-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listIndicesAsync list-indices-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListIndicesRequest list-indices-request]
    (-> this (.listIndicesAsync list-indices-request))))

(defn delete-scheduled-audit-async
  "Deletes a scheduled audit.

  delete-scheduled-audit-request - `com.amazonaws.services.iot.model.DeleteScheduledAuditRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteScheduledAudit operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeleteScheduledAuditResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeleteScheduledAuditRequest delete-scheduled-audit-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteScheduledAuditAsync delete-scheduled-audit-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeleteScheduledAuditRequest delete-scheduled-audit-request]
    (-> this (.deleteScheduledAuditAsync delete-scheduled-audit-request))))

(defn list-ota-updates-async
  "Lists OTA updates.

  list-ota-updates-request - `com.amazonaws.services.iot.model.ListOTAUpdatesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListOTAUpdates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListOTAUpdatesResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListOTAUpdatesRequest list-ota-updates-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listOTAUpdatesAsync list-ota-updates-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListOTAUpdatesRequest list-ota-updates-request]
    (-> this (.listOTAUpdatesAsync list-ota-updates-request))))

(defn describe-event-configurations-async
  "Describes event configurations.

  describe-event-configurations-request - `com.amazonaws.services.iot.model.DescribeEventConfigurationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventConfigurations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeEventConfigurationsResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeEventConfigurationsRequest describe-event-configurations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventConfigurationsAsync describe-event-configurations-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeEventConfigurationsRequest describe-event-configurations-request]
    (-> this (.describeEventConfigurationsAsync describe-event-configurations-request))))

(defn get-logging-options-async
  "Gets the logging options.


   NOTE: use of this command is not recommended. Use GetV2LoggingOptions instead.

  get-logging-options-request - The input for the GetLoggingOptions operation. - `com.amazonaws.services.iot.model.GetLoggingOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLoggingOptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.GetLoggingOptionsResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.GetLoggingOptionsRequest get-logging-options-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLoggingOptionsAsync get-logging-options-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.GetLoggingOptionsRequest get-logging-options-request]
    (-> this (.getLoggingOptionsAsync get-logging-options-request))))

(defn update-account-audit-configuration-async
  "Configures or reconfigures the Device Defender audit settings for this account. Settings include how audit
   notifications are sent and which audit checks are enabled or disabled.

  update-account-audit-configuration-request - `com.amazonaws.services.iot.model.UpdateAccountAuditConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAccountAuditConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.UpdateAccountAuditConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.UpdateAccountAuditConfigurationRequest update-account-audit-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAccountAuditConfigurationAsync update-account-audit-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.UpdateAccountAuditConfigurationRequest update-account-audit-configuration-request]
    (-> this (.updateAccountAuditConfigurationAsync update-account-audit-configuration-request))))

(defn cancel-job-async
  "Cancels a job.

  cancel-job-request - `com.amazonaws.services.iot.model.CancelJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CancelJobResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CancelJobRequest cancel-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelJobAsync cancel-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CancelJobRequest cancel-job-request]
    (-> this (.cancelJobAsync cancel-job-request))))

(defn list-thing-registration-task-reports-async
  "Information about the thing registration tasks.

  list-thing-registration-task-reports-request - `com.amazonaws.services.iot.model.ListThingRegistrationTaskReportsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListThingRegistrationTaskReports operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListThingRegistrationTaskReportsResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListThingRegistrationTaskReportsRequest list-thing-registration-task-reports-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listThingRegistrationTaskReportsAsync list-thing-registration-task-reports-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListThingRegistrationTaskReportsRequest list-thing-registration-task-reports-request]
    (-> this (.listThingRegistrationTaskReportsAsync list-thing-registration-task-reports-request))))

(defn list-attached-policies-async
  "Lists the policies attached to the specified thing group.

  list-attached-policies-request - `com.amazonaws.services.iot.model.ListAttachedPoliciesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAttachedPolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListAttachedPoliciesResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListAttachedPoliciesRequest list-attached-policies-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAttachedPoliciesAsync list-attached-policies-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListAttachedPoliciesRequest list-attached-policies-request]
    (-> this (.listAttachedPoliciesAsync list-attached-policies-request))))

(defn disable-topic-rule-async
  "Disables the rule.

  disable-topic-rule-request - The input for the DisableTopicRuleRequest operation. - `com.amazonaws.services.iot.model.DisableTopicRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableTopicRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DisableTopicRuleResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DisableTopicRuleRequest disable-topic-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableTopicRuleAsync disable-topic-rule-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DisableTopicRuleRequest disable-topic-rule-request]
    (-> this (.disableTopicRuleAsync disable-topic-rule-request))))

(defn get-job-document-async
  "Gets a job document.

  get-job-document-request - `com.amazonaws.services.iot.model.GetJobDocumentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetJobDocument operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.GetJobDocumentResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.GetJobDocumentRequest get-job-document-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getJobDocumentAsync get-job-document-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.GetJobDocumentRequest get-job-document-request]
    (-> this (.getJobDocumentAsync get-job-document-request))))

(defn set-default-policy-version-async
  "Sets the specified version of the specified policy as the policy's default (operative) version. This action
   affects all certificates to which the policy is attached. To list the principals the policy is attached to, use
   the ListPrincipalPolicy API.

  set-default-policy-version-request - The input for the SetDefaultPolicyVersion operation. - `com.amazonaws.services.iot.model.SetDefaultPolicyVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetDefaultPolicyVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.SetDefaultPolicyVersionResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.SetDefaultPolicyVersionRequest set-default-policy-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setDefaultPolicyVersionAsync set-default-policy-version-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.SetDefaultPolicyVersionRequest set-default-policy-version-request]
    (-> this (.setDefaultPolicyVersionAsync set-default-policy-version-request))))

(defn list-targets-for-policy-async
  "List targets for the specified policy.

  list-targets-for-policy-request - `com.amazonaws.services.iot.model.ListTargetsForPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTargetsForPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListTargetsForPolicyResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListTargetsForPolicyRequest list-targets-for-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTargetsForPolicyAsync list-targets-for-policy-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListTargetsForPolicyRequest list-targets-for-policy-request]
    (-> this (.listTargetsForPolicyAsync list-targets-for-policy-request))))

(defn delete-account-audit-configuration-async
  "Restores the default settings for Device Defender audits for this account. Any configuration data you entered is
   deleted and all audit checks are reset to disabled.

  delete-account-audit-configuration-request - `com.amazonaws.services.iot.model.DeleteAccountAuditConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAccountAuditConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeleteAccountAuditConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeleteAccountAuditConfigurationRequest delete-account-audit-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAccountAuditConfigurationAsync delete-account-audit-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeleteAccountAuditConfigurationRequest delete-account-audit-configuration-request]
    (-> this (.deleteAccountAuditConfigurationAsync delete-account-audit-configuration-request))))

(defn get-policy-version-async
  "Gets information about the specified policy version.

  get-policy-version-request - The input for the GetPolicyVersion operation. - `com.amazonaws.services.iot.model.GetPolicyVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPolicyVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.GetPolicyVersionResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.GetPolicyVersionRequest get-policy-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPolicyVersionAsync get-policy-version-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.GetPolicyVersionRequest get-policy-version-request]
    (-> this (.getPolicyVersionAsync get-policy-version-request))))

(defn list-certificates-async
  "Lists the certificates registered in your AWS account.


   The results are paginated with a default page size of 25. You can use the returned marker to retrieve additional
   results.

  list-certificates-request - The input for the ListCertificates operation. - `com.amazonaws.services.iot.model.ListCertificatesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCertificates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListCertificatesResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListCertificatesRequest list-certificates-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCertificatesAsync list-certificates-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListCertificatesRequest list-certificates-request]
    (-> this (.listCertificatesAsync list-certificates-request))))

(defn update-indexing-configuration-async
  "Updates the search configuration.

  update-indexing-configuration-request - `com.amazonaws.services.iot.model.UpdateIndexingConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateIndexingConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.UpdateIndexingConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.UpdateIndexingConfigurationRequest update-indexing-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateIndexingConfigurationAsync update-indexing-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.UpdateIndexingConfigurationRequest update-indexing-configuration-request]
    (-> this (.updateIndexingConfigurationAsync update-indexing-configuration-request))))

(defn list-policies-async
  "Lists your policies.

  list-policies-request - The input for the ListPolicies operation. - `com.amazonaws.services.iot.model.ListPoliciesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListPoliciesResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListPoliciesRequest list-policies-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPoliciesAsync list-policies-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListPoliciesRequest list-policies-request]
    (-> this (.listPoliciesAsync list-policies-request))))

(defn create-topic-rule-async
  "Creates a rule. Creating rules is an administrator-level action. Any user who has permission to create rules will
   be able to access data processed by the rule.

  create-topic-rule-request - The input for the CreateTopicRule operation. - `com.amazonaws.services.iot.model.CreateTopicRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTopicRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CreateTopicRuleResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CreateTopicRuleRequest create-topic-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTopicRuleAsync create-topic-rule-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CreateTopicRuleRequest create-topic-rule-request]
    (-> this (.createTopicRuleAsync create-topic-rule-request))))

(defn detach-thing-principal-async
  "Detaches the specified principal from the specified thing. A principal can be X.509 certificates, IAM users,
   groups, and roles, Amazon Cognito identities or federated identities.



   This call is asynchronous. It might take several seconds for the detachment to propagate.

  detach-thing-principal-request - The input for the DetachThingPrincipal operation. - `com.amazonaws.services.iot.model.DetachThingPrincipalRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachThingPrincipal operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DetachThingPrincipalResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DetachThingPrincipalRequest detach-thing-principal-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachThingPrincipalAsync detach-thing-principal-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DetachThingPrincipalRequest detach-thing-principal-request]
    (-> this (.detachThingPrincipalAsync detach-thing-principal-request))))

(defn create-scheduled-audit-async
  "Creates a scheduled audit that is run at a specified time interval.

  create-scheduled-audit-request - `com.amazonaws.services.iot.model.CreateScheduledAuditRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateScheduledAudit operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CreateScheduledAuditResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CreateScheduledAuditRequest create-scheduled-audit-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createScheduledAuditAsync create-scheduled-audit-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CreateScheduledAuditRequest create-scheduled-audit-request]
    (-> this (.createScheduledAuditAsync create-scheduled-audit-request))))

(defn delete-certificate-async
  "Deletes the specified certificate.


   A certificate cannot be deleted if it has a policy attached to it or if its status is set to ACTIVE. To delete a
   certificate, first use the DetachPrincipalPolicy API to detach all policies. Next, use the
   UpdateCertificate API to set the certificate to the INACTIVE status.

  delete-certificate-request - The input for the DeleteCertificate operation. - `com.amazonaws.services.iot.model.DeleteCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeleteCertificateResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeleteCertificateRequest delete-certificate-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCertificateAsync delete-certificate-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeleteCertificateRequest delete-certificate-request]
    (-> this (.deleteCertificateAsync delete-certificate-request))))

(defn describe-thing-registration-task-async
  "Describes a bulk thing provisioning task.

  describe-thing-registration-task-request - `com.amazonaws.services.iot.model.DescribeThingRegistrationTaskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeThingRegistrationTask operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeThingRegistrationTaskResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeThingRegistrationTaskRequest describe-thing-registration-task-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeThingRegistrationTaskAsync describe-thing-registration-task-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeThingRegistrationTaskRequest describe-thing-registration-task-request]
    (-> this (.describeThingRegistrationTaskAsync describe-thing-registration-task-request))))

(defn create-job-async
  "Creates a job.

  create-job-request - `com.amazonaws.services.iot.model.CreateJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CreateJobResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CreateJobRequest create-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createJobAsync create-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CreateJobRequest create-job-request]
    (-> this (.createJobAsync create-job-request))))

(defn list-authorizers-async
  "Lists the authorizers registered in your account.

  list-authorizers-request - `com.amazonaws.services.iot.model.ListAuthorizersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAuthorizers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListAuthorizersResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListAuthorizersRequest list-authorizers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAuthorizersAsync list-authorizers-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListAuthorizersRequest list-authorizers-request]
    (-> this (.listAuthorizersAsync list-authorizers-request))))

(defn list-security-profiles-async
  "Lists the Device Defender security profiles you have created. You can use filters to list only those security
   profiles associated with a thing group or only those associated with your account.

  list-security-profiles-request - `com.amazonaws.services.iot.model.ListSecurityProfilesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSecurityProfiles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListSecurityProfilesResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListSecurityProfilesRequest list-security-profiles-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSecurityProfilesAsync list-security-profiles-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListSecurityProfilesRequest list-security-profiles-request]
    (-> this (.listSecurityProfilesAsync list-security-profiles-request))))

(defn set-v-2-logging-level-async
  "Sets the logging level.

  set-v-2-logging-level-request - `com.amazonaws.services.iot.model.SetV2LoggingLevelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetV2LoggingLevel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.SetV2LoggingLevelResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.SetV2LoggingLevelRequest set-v-2-logging-level-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setV2LoggingLevelAsync set-v-2-logging-level-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.SetV2LoggingLevelRequest set-v-2-logging-level-request]
    (-> this (.setV2LoggingLevelAsync set-v-2-logging-level-request))))

(defn update-job-async
  "Updates supported fields of the specified job.

  update-job-request - `com.amazonaws.services.iot.model.UpdateJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.UpdateJobResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.UpdateJobRequest update-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateJobAsync update-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.UpdateJobRequest update-job-request]
    (-> this (.updateJobAsync update-job-request))))

(defn create-policy-version-async
  "Creates a new version of the specified AWS IoT policy. To update a policy, create a new policy version. A managed
   policy can have up to five versions. If the policy has five versions, you must use DeletePolicyVersion to
   delete an existing version before you create a new one.


   Optionally, you can set the new version as the policy's default version. The default version is the operative
   version (that is, the version that is in effect for the certificates to which the policy is attached).

  create-policy-version-request - The input for the CreatePolicyVersion operation. - `com.amazonaws.services.iot.model.CreatePolicyVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePolicyVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CreatePolicyVersionResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CreatePolicyVersionRequest create-policy-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPolicyVersionAsync create-policy-version-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CreatePolicyVersionRequest create-policy-version-request]
    (-> this (.createPolicyVersionAsync create-policy-version-request))))

(defn get-indexing-configuration-async
  "Gets the search configuration.

  get-indexing-configuration-request - `com.amazonaws.services.iot.model.GetIndexingConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIndexingConfiguration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.GetIndexingConfigurationResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.GetIndexingConfigurationRequest get-indexing-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIndexingConfigurationAsync get-indexing-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.GetIndexingConfigurationRequest get-indexing-configuration-request]
    (-> this (.getIndexingConfigurationAsync get-indexing-configuration-request))))

(defn describe-authorizer-async
  "Describes an authorizer.

  describe-authorizer-request - `com.amazonaws.services.iot.model.DescribeAuthorizerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAuthorizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeAuthorizerResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeAuthorizerRequest describe-authorizer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAuthorizerAsync describe-authorizer-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeAuthorizerRequest describe-authorizer-request]
    (-> this (.describeAuthorizerAsync describe-authorizer-request))))

(defn create-dynamic-thing-group-async
  "Creates a dynamic thing group.

  create-dynamic-thing-group-request - `com.amazonaws.services.iot.model.CreateDynamicThingGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDynamicThingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CreateDynamicThingGroupResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CreateDynamicThingGroupRequest create-dynamic-thing-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDynamicThingGroupAsync create-dynamic-thing-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CreateDynamicThingGroupRequest create-dynamic-thing-group-request]
    (-> this (.createDynamicThingGroupAsync create-dynamic-thing-group-request))))

(defn list-policy-principals-async
  "Deprecated.

  list-policy-principals-request - The input for the ListPolicyPrincipals operation. - `com.amazonaws.services.iot.model.ListPolicyPrincipalsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPolicyPrincipals operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListPolicyPrincipalsResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListPolicyPrincipalsRequest list-policy-principals-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPolicyPrincipalsAsync list-policy-principals-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListPolicyPrincipalsRequest list-policy-principals-request]
    (-> this (.listPolicyPrincipalsAsync list-policy-principals-request))))

(defn update-thing-async
  "Updates the data for a thing.

  update-thing-request - The input for the UpdateThing operation. - `com.amazonaws.services.iot.model.UpdateThingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateThing operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.UpdateThingResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.UpdateThingRequest update-thing-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateThingAsync update-thing-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.UpdateThingRequest update-thing-request]
    (-> this (.updateThingAsync update-thing-request))))

(defn list-v-2-logging-levels-async
  "Lists logging levels.

  list-v-2-logging-levels-request - `com.amazonaws.services.iot.model.ListV2LoggingLevelsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListV2LoggingLevels operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListV2LoggingLevelsResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListV2LoggingLevelsRequest list-v-2-logging-levels-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listV2LoggingLevelsAsync list-v-2-logging-levels-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListV2LoggingLevelsRequest list-v-2-logging-levels-request]
    (-> this (.listV2LoggingLevelsAsync list-v-2-logging-levels-request))))

(defn list-tags-for-resource-async
  "Lists the tags (metadata) you have assigned to the resource.

  list-tags-for-resource-request - `com.amazonaws.services.iot.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn describe-job-execution-async
  "Describes a job execution.

  describe-job-execution-request - `com.amazonaws.services.iot.model.DescribeJobExecutionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeJobExecution operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeJobExecutionResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeJobExecutionRequest describe-job-execution-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeJobExecutionAsync describe-job-execution-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeJobExecutionRequest describe-job-execution-request]
    (-> this (.describeJobExecutionAsync describe-job-execution-request))))

(defn list-certificates-by-ca-async
  "List the device certificates signed by the specified CA certificate.

  list-certificates-by-ca-request - The input to the ListCertificatesByCA operation. - `com.amazonaws.services.iot.model.ListCertificatesByCARequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCertificatesByCA operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListCertificatesByCAResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListCertificatesByCARequest list-certificates-by-ca-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCertificatesByCAAsync list-certificates-by-ca-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListCertificatesByCARequest list-certificates-by-ca-request]
    (-> this (.listCertificatesByCAAsync list-certificates-by-ca-request))))

(defn get-policy-async
  "Gets information about the specified policy with the policy document of the default version.

  get-policy-request - The input for the GetPolicy operation. - `com.amazonaws.services.iot.model.GetPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.GetPolicyResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.GetPolicyRequest get-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPolicyAsync get-policy-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.GetPolicyRequest get-policy-request]
    (-> this (.getPolicyAsync get-policy-request))))

(defn update-event-configurations-async
  "Updates the event configurations.

  update-event-configurations-request - `com.amazonaws.services.iot.model.UpdateEventConfigurationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateEventConfigurations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.UpdateEventConfigurationsResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.UpdateEventConfigurationsRequest update-event-configurations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateEventConfigurationsAsync update-event-configurations-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.UpdateEventConfigurationsRequest update-event-configurations-request]
    (-> this (.updateEventConfigurationsAsync update-event-configurations-request))))

(defn stop-thing-registration-task-async
  "Cancels a bulk thing provisioning task.

  stop-thing-registration-task-request - `com.amazonaws.services.iot.model.StopThingRegistrationTaskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopThingRegistrationTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.StopThingRegistrationTaskResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.StopThingRegistrationTaskRequest stop-thing-registration-task-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopThingRegistrationTaskAsync stop-thing-registration-task-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.StopThingRegistrationTaskRequest stop-thing-registration-task-request]
    (-> this (.stopThingRegistrationTaskAsync stop-thing-registration-task-request))))

(defn attach-principal-policy-async
  "Deprecated.

  attach-principal-policy-request - The input for the AttachPrincipalPolicy operation. - `com.amazonaws.services.iot.model.AttachPrincipalPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachPrincipalPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.AttachPrincipalPolicyResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.AttachPrincipalPolicyRequest attach-principal-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachPrincipalPolicyAsync attach-principal-policy-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.AttachPrincipalPolicyRequest attach-principal-policy-request]
    (-> this (.attachPrincipalPolicyAsync attach-principal-policy-request))))

(defn describe-ca-certificate-async
  "Describes a registered CA certificate.

  describe-ca-certificate-request - The input for the DescribeCACertificate operation. - `com.amazonaws.services.iot.model.DescribeCACertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCACertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeCACertificateResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeCACertificateRequest describe-ca-certificate-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCACertificateAsync describe-ca-certificate-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeCACertificateRequest describe-ca-certificate-request]
    (-> this (.describeCACertificateAsync describe-ca-certificate-request))))

(defn describe-thing-async
  "Gets information about the specified thing.

  describe-thing-request - The input for the DescribeThing operation. - `com.amazonaws.services.iot.model.DescribeThingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeThing operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeThingResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeThingRequest describe-thing-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeThingAsync describe-thing-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeThingRequest describe-thing-request]
    (-> this (.describeThingAsync describe-thing-request))))

(defn list-principal-policies-async
  "Deprecated.

  list-principal-policies-request - The input for the ListPrincipalPolicies operation. - `com.amazonaws.services.iot.model.ListPrincipalPoliciesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPrincipalPolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListPrincipalPoliciesResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListPrincipalPoliciesRequest list-principal-policies-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPrincipalPoliciesAsync list-principal-policies-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListPrincipalPoliciesRequest list-principal-policies-request]
    (-> this (.listPrincipalPoliciesAsync list-principal-policies-request))))

(defn create-ota-update-async
  "Creates an AWS IoT OTAUpdate on a target group of things or groups.

  create-ota-update-request - `com.amazonaws.services.iot.model.CreateOTAUpdateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateOTAUpdate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CreateOTAUpdateResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CreateOTAUpdateRequest create-ota-update-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createOTAUpdateAsync create-ota-update-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CreateOTAUpdateRequest create-ota-update-request]
    (-> this (.createOTAUpdateAsync create-ota-update-request))))

(defn accept-certificate-transfer-async
  "Accepts a pending certificate transfer. The default state of the certificate is INACTIVE.


   To check for pending certificate transfers, call ListCertificates to enumerate your certificates.

  accept-certificate-transfer-request - The input for the AcceptCertificateTransfer operation. - `com.amazonaws.services.iot.model.AcceptCertificateTransferRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AcceptCertificateTransfer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.AcceptCertificateTransferResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.AcceptCertificateTransferRequest accept-certificate-transfer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.acceptCertificateTransferAsync accept-certificate-transfer-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.AcceptCertificateTransferRequest accept-certificate-transfer-request]
    (-> this (.acceptCertificateTransferAsync accept-certificate-transfer-request))))

(defn enable-topic-rule-async
  "Enables the rule.

  enable-topic-rule-request - The input for the EnableTopicRuleRequest operation. - `com.amazonaws.services.iot.model.EnableTopicRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableTopicRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.EnableTopicRuleResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.EnableTopicRuleRequest enable-topic-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableTopicRuleAsync enable-topic-rule-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.EnableTopicRuleRequest enable-topic-rule-request]
    (-> this (.enableTopicRuleAsync enable-topic-rule-request))))

(defn list-things-in-thing-group-async
  "Lists the things in the specified group.

  list-things-in-thing-group-request - `com.amazonaws.services.iot.model.ListThingsInThingGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListThingsInThingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListThingsInThingGroupResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListThingsInThingGroupRequest list-things-in-thing-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listThingsInThingGroupAsync list-things-in-thing-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListThingsInThingGroupRequest list-things-in-thing-group-request]
    (-> this (.listThingsInThingGroupAsync list-things-in-thing-group-request))))

(defn list-targets-for-security-profile-async
  "Lists the targets (thing groups) associated with a given Device Defender security profile.

  list-targets-for-security-profile-request - `com.amazonaws.services.iot.model.ListTargetsForSecurityProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTargetsForSecurityProfile operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListTargetsForSecurityProfileResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListTargetsForSecurityProfileRequest list-targets-for-security-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTargetsForSecurityProfileAsync list-targets-for-security-profile-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListTargetsForSecurityProfileRequest list-targets-for-security-profile-request]
    (-> this (.listTargetsForSecurityProfileAsync list-targets-for-security-profile-request))))

(defn register-thing-async
  "Provisions a thing.

  register-thing-request - `com.amazonaws.services.iot.model.RegisterThingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterThing operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.RegisterThingResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.RegisterThingRequest register-thing-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerThingAsync register-thing-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.RegisterThingRequest register-thing-request]
    (-> this (.registerThingAsync register-thing-request))))

(defn cancel-audit-task-async
  "Cancels an audit that is in progress. The audit can be either scheduled or on-demand. If the audit is not in
   progress, an \"InvalidRequestException\" occurs.

  cancel-audit-task-request - `com.amazonaws.services.iot.model.CancelAuditTaskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelAuditTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CancelAuditTaskResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CancelAuditTaskRequest cancel-audit-task-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelAuditTaskAsync cancel-audit-task-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CancelAuditTaskRequest cancel-audit-task-request]
    (-> this (.cancelAuditTaskAsync cancel-audit-task-request))))

(defn list-audit-tasks-async
  "Lists the Device Defender audits that have been performed during a given time period.

  list-audit-tasks-request - `com.amazonaws.services.iot.model.ListAuditTasksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAuditTasks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListAuditTasksResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListAuditTasksRequest list-audit-tasks-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAuditTasksAsync list-audit-tasks-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListAuditTasksRequest list-audit-tasks-request]
    (-> this (.listAuditTasksAsync list-audit-tasks-request))))

(defn get-v-2-logging-options-async
  "Gets the fine grained logging options.

  get-v-2-logging-options-request - `com.amazonaws.services.iot.model.GetV2LoggingOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetV2LoggingOptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.GetV2LoggingOptionsResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.GetV2LoggingOptionsRequest get-v-2-logging-options-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getV2LoggingOptionsAsync get-v-2-logging-options-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.GetV2LoggingOptionsRequest get-v-2-logging-options-request]
    (-> this (.getV2LoggingOptionsAsync get-v-2-logging-options-request))))

(defn get-registration-code-async
  "Gets a registration code used to register a CA certificate with AWS IoT.

  get-registration-code-request - The input to the GetRegistrationCode operation. - `com.amazonaws.services.iot.model.GetRegistrationCodeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRegistrationCode operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.GetRegistrationCodeResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.GetRegistrationCodeRequest get-registration-code-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRegistrationCodeAsync get-registration-code-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.GetRegistrationCodeRequest get-registration-code-request]
    (-> this (.getRegistrationCodeAsync get-registration-code-request))))

(defn list-outgoing-certificates-async
  "Lists certificates that are being transferred but not yet accepted.

  list-outgoing-certificates-request - The input to the ListOutgoingCertificates operation. - `com.amazonaws.services.iot.model.ListOutgoingCertificatesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListOutgoingCertificates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListOutgoingCertificatesResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListOutgoingCertificatesRequest list-outgoing-certificates-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listOutgoingCertificatesAsync list-outgoing-certificates-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListOutgoingCertificatesRequest list-outgoing-certificates-request]
    (-> this (.listOutgoingCertificatesAsync list-outgoing-certificates-request))))

(defn replace-topic-rule-async
  "Replaces the rule. You must specify all parameters for the new rule. Creating rules is an administrator-level
   action. Any user who has permission to create rules will be able to access data processed by the rule.

  replace-topic-rule-request - The input for the ReplaceTopicRule operation. - `com.amazonaws.services.iot.model.ReplaceTopicRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReplaceTopicRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ReplaceTopicRuleResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ReplaceTopicRuleRequest replace-topic-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.replaceTopicRuleAsync replace-topic-rule-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ReplaceTopicRuleRequest replace-topic-rule-request]
    (-> this (.replaceTopicRuleAsync replace-topic-rule-request))))

(defn list-principal-things-async
  "Lists the things associated with the specified principal. A principal can be X.509 certificates, IAM users,
   groups, and roles, Amazon Cognito identities or federated identities.

  list-principal-things-request - The input for the ListPrincipalThings operation. - `com.amazonaws.services.iot.model.ListPrincipalThingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPrincipalThings operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListPrincipalThingsResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListPrincipalThingsRequest list-principal-things-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPrincipalThingsAsync list-principal-things-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListPrincipalThingsRequest list-principal-things-request]
    (-> this (.listPrincipalThingsAsync list-principal-things-request))))

(defn create-thing-group-async
  "Create a thing group.



   This is a control plane operation. See Authorization for information
   about authorizing control plane actions.

  create-thing-group-request - `com.amazonaws.services.iot.model.CreateThingGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateThingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CreateThingGroupResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CreateThingGroupRequest create-thing-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createThingGroupAsync create-thing-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CreateThingGroupRequest create-thing-group-request]
    (-> this (.createThingGroupAsync create-thing-group-request))))

(defn list-policy-versions-async
  "Lists the versions of the specified policy and identifies the default version.

  list-policy-versions-request - The input for the ListPolicyVersions operation. - `com.amazonaws.services.iot.model.ListPolicyVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPolicyVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListPolicyVersionsResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListPolicyVersionsRequest list-policy-versions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPolicyVersionsAsync list-policy-versions-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListPolicyVersionsRequest list-policy-versions-request]
    (-> this (.listPolicyVersionsAsync list-policy-versions-request))))

(defn search-index-async
  "The query search index.

  search-index-request - `com.amazonaws.services.iot.model.SearchIndexRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchIndex operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.SearchIndexResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.SearchIndexRequest search-index-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchIndexAsync search-index-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.SearchIndexRequest search-index-request]
    (-> this (.searchIndexAsync search-index-request))))

(defn detach-security-profile-async
  "Disassociates a Device Defender security profile from a thing group or from this account.

  detach-security-profile-request - `com.amazonaws.services.iot.model.DetachSecurityProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachSecurityProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DetachSecurityProfileResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DetachSecurityProfileRequest detach-security-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachSecurityProfileAsync detach-security-profile-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DetachSecurityProfileRequest detach-security-profile-request]
    (-> this (.detachSecurityProfileAsync detach-security-profile-request))))

(defn add-thing-to-billing-group-async
  "Adds a thing to a billing group.

  add-thing-to-billing-group-request - `com.amazonaws.services.iot.model.AddThingToBillingGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddThingToBillingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.AddThingToBillingGroupResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.AddThingToBillingGroupRequest add-thing-to-billing-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addThingToBillingGroupAsync add-thing-to-billing-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.AddThingToBillingGroupRequest add-thing-to-billing-group-request]
    (-> this (.addThingToBillingGroupAsync add-thing-to-billing-group-request))))

(defn start-on-demand-audit-task-async
  "Starts an on-demand Device Defender audit.

  start-on-demand-audit-task-request - `com.amazonaws.services.iot.model.StartOnDemandAuditTaskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartOnDemandAuditTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.StartOnDemandAuditTaskResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.StartOnDemandAuditTaskRequest start-on-demand-audit-task-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startOnDemandAuditTaskAsync start-on-demand-audit-task-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.StartOnDemandAuditTaskRequest start-on-demand-audit-task-request]
    (-> this (.startOnDemandAuditTaskAsync start-on-demand-audit-task-request))))

(defn describe-scheduled-audit-async
  "Gets information about a scheduled audit.

  describe-scheduled-audit-request - `com.amazonaws.services.iot.model.DescribeScheduledAuditRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeScheduledAudit operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DescribeScheduledAuditResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeScheduledAuditRequest describe-scheduled-audit-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeScheduledAuditAsync describe-scheduled-audit-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DescribeScheduledAuditRequest describe-scheduled-audit-request]
    (-> this (.describeScheduledAuditAsync describe-scheduled-audit-request))))

(defn list-active-violations-async
  "Lists the active violations for a given Device Defender security profile.

  list-active-violations-request - `com.amazonaws.services.iot.model.ListActiveViolationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListActiveViolations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListActiveViolationsResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListActiveViolationsRequest list-active-violations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listActiveViolationsAsync list-active-violations-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListActiveViolationsRequest list-active-violations-request]
    (-> this (.listActiveViolationsAsync list-active-violations-request))))

(defn create-security-profile-async
  "Creates a Device Defender security profile.

  create-security-profile-request - `com.amazonaws.services.iot.model.CreateSecurityProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSecurityProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.CreateSecurityProfileResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CreateSecurityProfileRequest create-security-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSecurityProfileAsync create-security-profile-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.CreateSecurityProfileRequest create-security-profile-request]
    (-> this (.createSecurityProfileAsync create-security-profile-request))))

(defn get-topic-rule-async
  "Gets information about the rule.

  get-topic-rule-request - The input for the GetTopicRule operation. - `com.amazonaws.services.iot.model.GetTopicRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTopicRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.GetTopicRuleResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.GetTopicRuleRequest get-topic-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTopicRuleAsync get-topic-rule-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.GetTopicRuleRequest get-topic-rule-request]
    (-> this (.getTopicRuleAsync get-topic-rule-request))))

(defn update-billing-group-async
  "Updates information about the billing group.

  update-billing-group-request - `com.amazonaws.services.iot.model.UpdateBillingGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateBillingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.UpdateBillingGroupResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.UpdateBillingGroupRequest update-billing-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateBillingGroupAsync update-billing-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.UpdateBillingGroupRequest update-billing-group-request]
    (-> this (.updateBillingGroupAsync update-billing-group-request))))

(defn tag-resource-async
  "Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource.

  tag-resource-request - `com.amazonaws.services.iot.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn list-thing-groups-for-thing-async
  "List the thing groups to which the specified thing belongs.

  list-thing-groups-for-thing-request - `com.amazonaws.services.iot.model.ListThingGroupsForThingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListThingGroupsForThing operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListThingGroupsForThingResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListThingGroupsForThingRequest list-thing-groups-for-thing-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listThingGroupsForThingAsync list-thing-groups-for-thing-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListThingGroupsForThingRequest list-thing-groups-for-thing-request]
    (-> this (.listThingGroupsForThingAsync list-thing-groups-for-thing-request))))

(defn update-authorizer-async
  "Updates an authorizer.

  update-authorizer-request - `com.amazonaws.services.iot.model.UpdateAuthorizerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAuthorizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.UpdateAuthorizerResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.UpdateAuthorizerRequest update-authorizer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAuthorizerAsync update-authorizer-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.UpdateAuthorizerRequest update-authorizer-request]
    (-> this (.updateAuthorizerAsync update-authorizer-request))))

(defn list-thing-principals-async
  "Lists the principals associated with the specified thing. A principal can be X.509 certificates, IAM users,
   groups, and roles, Amazon Cognito identities or federated identities.

  list-thing-principals-request - The input for the ListThingPrincipal operation. - `com.amazonaws.services.iot.model.ListThingPrincipalsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListThingPrincipals operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListThingPrincipalsResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListThingPrincipalsRequest list-thing-principals-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listThingPrincipalsAsync list-thing-principals-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListThingPrincipalsRequest list-thing-principals-request]
    (-> this (.listThingPrincipalsAsync list-thing-principals-request))))

(defn delete-role-alias-async
  "Deletes a role alias

  delete-role-alias-request - `com.amazonaws.services.iot.model.DeleteRoleAliasRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRoleAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeleteRoleAliasResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeleteRoleAliasRequest delete-role-alias-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRoleAliasAsync delete-role-alias-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeleteRoleAliasRequest delete-role-alias-request]
    (-> this (.deleteRoleAliasAsync delete-role-alias-request))))

(defn list-thing-groups-async
  "List the thing groups in your account.

  list-thing-groups-request - `com.amazonaws.services.iot.model.ListThingGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListThingGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListThingGroupsResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListThingGroupsRequest list-thing-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listThingGroupsAsync list-thing-groups-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListThingGroupsRequest list-thing-groups-request]
    (-> this (.listThingGroupsAsync list-thing-groups-request))))

(defn list-topic-rules-async
  "Lists the rules for the specific topic.

  list-topic-rules-request - The input for the ListTopicRules operation. - `com.amazonaws.services.iot.model.ListTopicRulesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTopicRules operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListTopicRulesResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListTopicRulesRequest list-topic-rules-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTopicRulesAsync list-topic-rules-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListTopicRulesRequest list-topic-rules-request]
    (-> this (.listTopicRulesAsync list-topic-rules-request))))

(defn clear-default-authorizer-async
  "Clears the default authorizer.

  clear-default-authorizer-request - `com.amazonaws.services.iot.model.ClearDefaultAuthorizerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ClearDefaultAuthorizer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ClearDefaultAuthorizerResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ClearDefaultAuthorizerRequest clear-default-authorizer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.clearDefaultAuthorizerAsync clear-default-authorizer-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ClearDefaultAuthorizerRequest clear-default-authorizer-request]
    (-> this (.clearDefaultAuthorizerAsync clear-default-authorizer-request))))

(defn list-security-profiles-for-target-async
  "Lists the Device Defender security profiles attached to a target (thing group).

  list-security-profiles-for-target-request - `com.amazonaws.services.iot.model.ListSecurityProfilesForTargetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSecurityProfilesForTarget operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.ListSecurityProfilesForTargetResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListSecurityProfilesForTargetRequest list-security-profiles-for-target-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSecurityProfilesForTargetAsync list-security-profiles-for-target-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.ListSecurityProfilesForTargetRequest list-security-profiles-for-target-request]
    (-> this (.listSecurityProfilesForTargetAsync list-security-profiles-for-target-request))))

(defn delete-stream-async
  "Deletes a stream.

  delete-stream-request - `com.amazonaws.services.iot.model.DeleteStreamRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteStream operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeleteStreamResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeleteStreamRequest delete-stream-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteStreamAsync delete-stream-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeleteStreamRequest delete-stream-request]
    (-> this (.deleteStreamAsync delete-stream-request))))

(defn start-thing-registration-task-async
  "Creates a bulk thing provisioning task.

  start-thing-registration-task-request - `com.amazonaws.services.iot.model.StartThingRegistrationTaskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartThingRegistrationTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.StartThingRegistrationTaskResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.StartThingRegistrationTaskRequest start-thing-registration-task-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startThingRegistrationTaskAsync start-thing-registration-task-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.StartThingRegistrationTaskRequest start-thing-registration-task-request]
    (-> this (.startThingRegistrationTaskAsync start-thing-registration-task-request))))

(defn set-v-2-logging-options-async
  "Sets the logging options for the V2 logging service.

  set-v-2-logging-options-request - `com.amazonaws.services.iot.model.SetV2LoggingOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetV2LoggingOptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.SetV2LoggingOptionsResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.SetV2LoggingOptionsRequest set-v-2-logging-options-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setV2LoggingOptionsAsync set-v-2-logging-options-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.SetV2LoggingOptionsRequest set-v-2-logging-options-request]
    (-> this (.setV2LoggingOptionsAsync set-v-2-logging-options-request))))

(defn delete-thing-group-async
  "Deletes a thing group.

  delete-thing-group-request - `com.amazonaws.services.iot.model.DeleteThingGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteThingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeleteThingGroupResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeleteThingGroupRequest delete-thing-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteThingGroupAsync delete-thing-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeleteThingGroupRequest delete-thing-group-request]
    (-> this (.deleteThingGroupAsync delete-thing-group-request))))

(defn delete-billing-group-async
  "Deletes the billing group.

  delete-billing-group-request - `com.amazonaws.services.iot.model.DeleteBillingGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBillingGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.iot.model.DeleteBillingGroupResult>`"
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeleteBillingGroupRequest delete-billing-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBillingGroupAsync delete-billing-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSIotAsync this ^com.amazonaws.services.iot.model.DeleteBillingGroupRequest delete-billing-group-request]
    (-> this (.deleteBillingGroupAsync delete-billing-group-request))))

