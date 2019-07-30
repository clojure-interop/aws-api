(ns com.amazonaws.services.iot.AbstractAWSIot
  "Abstract implementation of AWSIot. Convenient method forms pass through to the corresponding overload that
  takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.iot AbstractAWSIot]))

(defn update-thing-group
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.UpdateThingGroupRequest`

  returns: Result of the UpdateThingGroup operation returned by the service. - `com.amazonaws.services.iot.model.UpdateThingGroupResult`"
  (^com.amazonaws.services.iot.model.UpdateThingGroupResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.UpdateThingGroupRequest request]
    (-> this (.updateThingGroup request))))

(defn reject-certificate-transfer
  "Description copied from interface: AWSIot

  request - The input for the RejectCertificateTransfer operation. - `com.amazonaws.services.iot.model.RejectCertificateTransferRequest`

  returns: Result of the RejectCertificateTransfer operation returned by the service. - `com.amazonaws.services.iot.model.RejectCertificateTransferResult`"
  (^com.amazonaws.services.iot.model.RejectCertificateTransferResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.RejectCertificateTransferRequest request]
    (-> this (.rejectCertificateTransfer request))))

(defn update-ca-certificate
  "Description copied from interface: AWSIot

  request - The input to the UpdateCACertificate operation. - `com.amazonaws.services.iot.model.UpdateCACertificateRequest`

  returns: Result of the UpdateCACertificate operation returned by the service. - `com.amazonaws.services.iot.model.UpdateCACertificateResult`"
  (^com.amazonaws.services.iot.model.UpdateCACertificateResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.UpdateCACertificateRequest request]
    (-> this (.updateCACertificate request))))

(defn create-billing-group
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.CreateBillingGroupRequest`

  returns: Result of the CreateBillingGroup operation returned by the service. - `com.amazonaws.services.iot.model.CreateBillingGroupResult`"
  (^com.amazonaws.services.iot.model.CreateBillingGroupResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.CreateBillingGroupRequest request]
    (-> this (.createBillingGroup request))))

(defn search-index
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.SearchIndexRequest`

  returns: Result of the SearchIndex operation returned by the service. - `com.amazonaws.services.iot.model.SearchIndexResult`"
  (^com.amazonaws.services.iot.model.SearchIndexResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.SearchIndexRequest request]
    (-> this (.searchIndex request))))

(defn delete-thing-type
  "Description copied from interface: AWSIot

  request - The input for the DeleteThingType operation. - `com.amazonaws.services.iot.model.DeleteThingTypeRequest`

  returns: Result of the DeleteThingType operation returned by the service. - `com.amazonaws.services.iot.model.DeleteThingTypeResult`"
  (^com.amazonaws.services.iot.model.DeleteThingTypeResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DeleteThingTypeRequest request]
    (-> this (.deleteThingType request))))

(defn describe-stream
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.DescribeStreamRequest`

  returns: Result of the DescribeStream operation returned by the service. - `com.amazonaws.services.iot.model.DescribeStreamResult`"
  (^com.amazonaws.services.iot.model.DescribeStreamResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DescribeStreamRequest request]
    (-> this (.describeStream request))))

(defn list-tags-for-resource
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.iot.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.iot.model.ListTagsForResourceResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn register-certificate
  "Description copied from interface: AWSIot

  request - The input to the RegisterCertificate operation. - `com.amazonaws.services.iot.model.RegisterCertificateRequest`

  returns: Result of the RegisterCertificate operation returned by the service. - `com.amazonaws.services.iot.model.RegisterCertificateResult`"
  (^com.amazonaws.services.iot.model.RegisterCertificateResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.RegisterCertificateRequest request]
    (-> this (.registerCertificate request))))

(defn describe-authorizer
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.DescribeAuthorizerRequest`

  returns: Result of the DescribeAuthorizer operation returned by the service. - `com.amazonaws.services.iot.model.DescribeAuthorizerResult`"
  (^com.amazonaws.services.iot.model.DescribeAuthorizerResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DescribeAuthorizerRequest request]
    (-> this (.describeAuthorizer request))))

(defn list-security-profiles-for-target
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.ListSecurityProfilesForTargetRequest`

  returns: Result of the ListSecurityProfilesForTarget operation returned by the service. - `com.amazonaws.services.iot.model.ListSecurityProfilesForTargetResult`"
  (^com.amazonaws.services.iot.model.ListSecurityProfilesForTargetResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListSecurityProfilesForTargetRequest request]
    (-> this (.listSecurityProfilesForTarget request))))

(defn delete-stream
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.DeleteStreamRequest`

  returns: Result of the DeleteStream operation returned by the service. - `com.amazonaws.services.iot.model.DeleteStreamResult`"
  (^com.amazonaws.services.iot.model.DeleteStreamResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DeleteStreamRequest request]
    (-> this (.deleteStream request))))

(defn test-authorization
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.TestAuthorizationRequest`

  returns: Result of the TestAuthorization operation returned by the service. - `com.amazonaws.services.iot.model.TestAuthorizationResult`"
  (^com.amazonaws.services.iot.model.TestAuthorizationResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.TestAuthorizationRequest request]
    (-> this (.testAuthorization request))))

(defn set-region
  "Description copied from interface: AWSIot

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAWSIot this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn create-ota-update
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.CreateOTAUpdateRequest`

  returns: Result of the CreateOTAUpdate operation returned by the service. - `com.amazonaws.services.iot.model.CreateOTAUpdateResult`"
  (^com.amazonaws.services.iot.model.CreateOTAUpdateResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.CreateOTAUpdateRequest request]
    (-> this (.createOTAUpdate request))))

(defn detach-principal-policy
  "Deprecated.

  request - The input for the DetachPrincipalPolicy operation. - `com.amazonaws.services.iot.model.DetachPrincipalPolicyRequest`

  returns: Result of the DetachPrincipalPolicy operation returned by the service. - `com.amazonaws.services.iot.model.DetachPrincipalPolicyResult`"
  (^com.amazonaws.services.iot.model.DetachPrincipalPolicyResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DetachPrincipalPolicyRequest request]
    (-> this (.detachPrincipalPolicy request))))

(defn create-certificate-from-csr
  "Description copied from interface: AWSIot

  request - The input for the CreateCertificateFromCsr operation. - `com.amazonaws.services.iot.model.CreateCertificateFromCsrRequest`

  returns: Result of the CreateCertificateFromCsr operation returned by the service. - `com.amazonaws.services.iot.model.CreateCertificateFromCsrResult`"
  (^com.amazonaws.services.iot.model.CreateCertificateFromCsrResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.CreateCertificateFromCsrRequest request]
    (-> this (.createCertificateFromCsr request))))

(defn list-audit-tasks
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.ListAuditTasksRequest`

  returns: Result of the ListAuditTasks operation returned by the service. - `com.amazonaws.services.iot.model.ListAuditTasksResult`"
  (^com.amazonaws.services.iot.model.ListAuditTasksResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListAuditTasksRequest request]
    (-> this (.listAuditTasks request))))

(defn describe-thing-registration-task
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.DescribeThingRegistrationTaskRequest`

  returns: Result of the DescribeThingRegistrationTask operation returned by the service. - `com.amazonaws.services.iot.model.DescribeThingRegistrationTaskResult`"
  (^com.amazonaws.services.iot.model.DescribeThingRegistrationTaskResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DescribeThingRegistrationTaskRequest request]
    (-> this (.describeThingRegistrationTask request))))

(defn list-thing-types
  "Description copied from interface: AWSIot

  request - The input for the ListThingTypes operation. - `com.amazonaws.services.iot.model.ListThingTypesRequest`

  returns: Result of the ListThingTypes operation returned by the service. - `com.amazonaws.services.iot.model.ListThingTypesResult`"
  (^com.amazonaws.services.iot.model.ListThingTypesResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListThingTypesRequest request]
    (-> this (.listThingTypes request))))

(defn get-ota-update
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.GetOTAUpdateRequest`

  returns: Result of the GetOTAUpdate operation returned by the service. - `com.amazonaws.services.iot.model.GetOTAUpdateResult`"
  (^com.amazonaws.services.iot.model.GetOTAUpdateResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.GetOTAUpdateRequest request]
    (-> this (.getOTAUpdate request))))

(defn update-account-audit-configuration
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.UpdateAccountAuditConfigurationRequest`

  returns: Result of the UpdateAccountAuditConfiguration operation returned by the service. - `com.amazonaws.services.iot.model.UpdateAccountAuditConfigurationResult`"
  (^com.amazonaws.services.iot.model.UpdateAccountAuditConfigurationResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.UpdateAccountAuditConfigurationRequest request]
    (-> this (.updateAccountAuditConfiguration request))))

(defn list-v-2-logging-levels
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.ListV2LoggingLevelsRequest`

  returns: Result of the ListV2LoggingLevels operation returned by the service. - `com.amazonaws.services.iot.model.ListV2LoggingLevelsResult`"
  (^com.amazonaws.services.iot.model.ListV2LoggingLevelsResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListV2LoggingLevelsRequest request]
    (-> this (.listV2LoggingLevels request))))

(defn update-indexing-configuration
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.UpdateIndexingConfigurationRequest`

  returns: Result of the UpdateIndexingConfiguration operation returned by the service. - `com.amazonaws.services.iot.model.UpdateIndexingConfigurationResult`"
  (^com.amazonaws.services.iot.model.UpdateIndexingConfigurationResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.UpdateIndexingConfigurationRequest request]
    (-> this (.updateIndexingConfiguration request))))

(defn disable-topic-rule
  "Description copied from interface: AWSIot

  request - The input for the DisableTopicRuleRequest operation. - `com.amazonaws.services.iot.model.DisableTopicRuleRequest`

  returns: Result of the DisableTopicRule operation returned by the service. - `com.amazonaws.services.iot.model.DisableTopicRuleResult`"
  (^com.amazonaws.services.iot.model.DisableTopicRuleResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DisableTopicRuleRequest request]
    (-> this (.disableTopicRule request))))

(defn list-active-violations
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.ListActiveViolationsRequest`

  returns: Result of the ListActiveViolations operation returned by the service. - `com.amazonaws.services.iot.model.ListActiveViolationsResult`"
  (^com.amazonaws.services.iot.model.ListActiveViolationsResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListActiveViolationsRequest request]
    (-> this (.listActiveViolations request))))

(defn describe-job
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.DescribeJobRequest`

  returns: Result of the DescribeJob operation returned by the service. - `com.amazonaws.services.iot.model.DescribeJobResult`"
  (^com.amazonaws.services.iot.model.DescribeJobResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DescribeJobRequest request]
    (-> this (.describeJob request))))

(defn list-certificates
  "Description copied from interface: AWSIot

  request - The input for the ListCertificates operation. - `com.amazonaws.services.iot.model.ListCertificatesRequest`

  returns: Result of the ListCertificates operation returned by the service. - `com.amazonaws.services.iot.model.ListCertificatesResult`"
  (^com.amazonaws.services.iot.model.ListCertificatesResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListCertificatesRequest request]
    (-> this (.listCertificates request))))

(defn set-v-2-logging-level
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.SetV2LoggingLevelRequest`

  returns: Result of the SetV2LoggingLevel operation returned by the service. - `com.amazonaws.services.iot.model.SetV2LoggingLevelResult`"
  (^com.amazonaws.services.iot.model.SetV2LoggingLevelResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.SetV2LoggingLevelRequest request]
    (-> this (.setV2LoggingLevel request))))

(defn register-thing
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.RegisterThingRequest`

  returns: Result of the RegisterThing operation returned by the service. - `com.amazonaws.services.iot.model.RegisterThingResult`"
  (^com.amazonaws.services.iot.model.RegisterThingResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.RegisterThingRequest request]
    (-> this (.registerThing request))))

(defn list-certificates-by-ca
  "Description copied from interface: AWSIot

  request - The input to the ListCertificatesByCA operation. - `com.amazonaws.services.iot.model.ListCertificatesByCARequest`

  returns: Result of the ListCertificatesByCA operation returned by the service. - `com.amazonaws.services.iot.model.ListCertificatesByCAResult`"
  (^com.amazonaws.services.iot.model.ListCertificatesByCAResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListCertificatesByCARequest request]
    (-> this (.listCertificatesByCA request))))

(defn set-default-policy-version
  "Description copied from interface: AWSIot

  request - The input for the SetDefaultPolicyVersion operation. - `com.amazonaws.services.iot.model.SetDefaultPolicyVersionRequest`

  returns: Result of the SetDefaultPolicyVersion operation returned by the service. - `com.amazonaws.services.iot.model.SetDefaultPolicyVersionResult`"
  (^com.amazonaws.services.iot.model.SetDefaultPolicyVersionResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.SetDefaultPolicyVersionRequest request]
    (-> this (.setDefaultPolicyVersion request))))

(defn create-security-profile
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.CreateSecurityProfileRequest`

  returns: Result of the CreateSecurityProfile operation returned by the service. - `com.amazonaws.services.iot.model.CreateSecurityProfileResult`"
  (^com.amazonaws.services.iot.model.CreateSecurityProfileResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.CreateSecurityProfileRequest request]
    (-> this (.createSecurityProfile request))))

(defn create-topic-rule
  "Description copied from interface: AWSIot

  request - The input for the CreateTopicRule operation. - `com.amazonaws.services.iot.model.CreateTopicRuleRequest`

  returns: Result of the CreateTopicRule operation returned by the service. - `com.amazonaws.services.iot.model.CreateTopicRuleResult`"
  (^com.amazonaws.services.iot.model.CreateTopicRuleResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.CreateTopicRuleRequest request]
    (-> this (.createTopicRule request))))

(defn untag-resource
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.iot.model.UntagResourceResult`"
  (^com.amazonaws.services.iot.model.UntagResourceResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn list-attached-policies
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.ListAttachedPoliciesRequest`

  returns: Result of the ListAttachedPolicies operation returned by the service. - `com.amazonaws.services.iot.model.ListAttachedPoliciesResult`"
  (^com.amazonaws.services.iot.model.ListAttachedPoliciesResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListAttachedPoliciesRequest request]
    (-> this (.listAttachedPolicies request))))

(defn update-authorizer
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.UpdateAuthorizerRequest`

  returns: Result of the UpdateAuthorizer operation returned by the service. - `com.amazonaws.services.iot.model.UpdateAuthorizerResult`"
  (^com.amazonaws.services.iot.model.UpdateAuthorizerResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.UpdateAuthorizerRequest request]
    (-> this (.updateAuthorizer request))))

(defn delete-ca-certificate
  "Description copied from interface: AWSIot

  request - Input for the DeleteCACertificate operation. - `com.amazonaws.services.iot.model.DeleteCACertificateRequest`

  returns: Result of the DeleteCACertificate operation returned by the service. - `com.amazonaws.services.iot.model.DeleteCACertificateResult`"
  (^com.amazonaws.services.iot.model.DeleteCACertificateResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DeleteCACertificateRequest request]
    (-> this (.deleteCACertificate request))))

(defn create-keys-and-certificate
  "Description copied from interface: AWSIot

  request - The input for the CreateKeysAndCertificate operation. - `com.amazonaws.services.iot.model.CreateKeysAndCertificateRequest`

  returns: Result of the CreateKeysAndCertificate operation returned by the service. - `com.amazonaws.services.iot.model.CreateKeysAndCertificateResult`"
  (^com.amazonaws.services.iot.model.CreateKeysAndCertificateResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.CreateKeysAndCertificateRequest request]
    (-> this (.createKeysAndCertificate request))))

(defn cancel-certificate-transfer
  "Description copied from interface: AWSIot

  request - The input for the CancelCertificateTransfer operation. - `com.amazonaws.services.iot.model.CancelCertificateTransferRequest`

  returns: Result of the CancelCertificateTransfer operation returned by the service. - `com.amazonaws.services.iot.model.CancelCertificateTransferResult`"
  (^com.amazonaws.services.iot.model.CancelCertificateTransferResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.CancelCertificateTransferRequest request]
    (-> this (.cancelCertificateTransfer request))))

(defn create-dynamic-thing-group
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.CreateDynamicThingGroupRequest`

  returns: Result of the CreateDynamicThingGroup operation returned by the service. - `com.amazonaws.services.iot.model.CreateDynamicThingGroupResult`"
  (^com.amazonaws.services.iot.model.CreateDynamicThingGroupResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.CreateDynamicThingGroupRequest request]
    (-> this (.createDynamicThingGroup request))))

(defn delete-job-execution
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.DeleteJobExecutionRequest`

  returns: Result of the DeleteJobExecution operation returned by the service. - `com.amazonaws.services.iot.model.DeleteJobExecutionResult`"
  (^com.amazonaws.services.iot.model.DeleteJobExecutionResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DeleteJobExecutionRequest request]
    (-> this (.deleteJobExecution request))))

(defn update-event-configurations
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.UpdateEventConfigurationsRequest`

  returns: Result of the UpdateEventConfigurations operation returned by the service. - `com.amazonaws.services.iot.model.UpdateEventConfigurationsResult`"
  (^com.amazonaws.services.iot.model.UpdateEventConfigurationsResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.UpdateEventConfigurationsRequest request]
    (-> this (.updateEventConfigurations request))))

(defn update-job
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.UpdateJobRequest`

  returns: Result of the UpdateJob operation returned by the service. - `com.amazonaws.services.iot.model.UpdateJobResult`"
  (^com.amazonaws.services.iot.model.UpdateJobResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.UpdateJobRequest request]
    (-> this (.updateJob request))))

(defn cancel-audit-task
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.CancelAuditTaskRequest`

  returns: Result of the CancelAuditTask operation returned by the service. - `com.amazonaws.services.iot.model.CancelAuditTaskResult`"
  (^com.amazonaws.services.iot.model.CancelAuditTaskResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.CancelAuditTaskRequest request]
    (-> this (.cancelAuditTask request))))

(defn update-role-alias
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.UpdateRoleAliasRequest`

  returns: Result of the UpdateRoleAlias operation returned by the service. - `com.amazonaws.services.iot.model.UpdateRoleAliasResult`"
  (^com.amazonaws.services.iot.model.UpdateRoleAliasResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.UpdateRoleAliasRequest request]
    (-> this (.updateRoleAlias request))))

(defn create-scheduled-audit
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.CreateScheduledAuditRequest`

  returns: Result of the CreateScheduledAudit operation returned by the service. - `com.amazonaws.services.iot.model.CreateScheduledAuditResult`"
  (^com.amazonaws.services.iot.model.CreateScheduledAuditResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.CreateScheduledAuditRequest request]
    (-> this (.createScheduledAudit request))))

(defn deprecate-thing-type
  "Description copied from interface: AWSIot

  request - The input for the DeprecateThingType operation. - `com.amazonaws.services.iot.model.DeprecateThingTypeRequest`

  returns: Result of the DeprecateThingType operation returned by the service. - `com.amazonaws.services.iot.model.DeprecateThingTypeResult`"
  (^com.amazonaws.services.iot.model.DeprecateThingTypeResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DeprecateThingTypeRequest request]
    (-> this (.deprecateThingType request))))

(defn describe-default-authorizer
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.DescribeDefaultAuthorizerRequest`

  returns: Result of the DescribeDefaultAuthorizer operation returned by the service. - `com.amazonaws.services.iot.model.DescribeDefaultAuthorizerResult`"
  (^com.amazonaws.services.iot.model.DescribeDefaultAuthorizerResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DescribeDefaultAuthorizerRequest request]
    (-> this (.describeDefaultAuthorizer request))))

(defn delete-registration-code
  "Description copied from interface: AWSIot

  request - The input for the DeleteRegistrationCode operation. - `com.amazonaws.services.iot.model.DeleteRegistrationCodeRequest`

  returns: Result of the DeleteRegistrationCode operation returned by the service. - `com.amazonaws.services.iot.model.DeleteRegistrationCodeResult`"
  (^com.amazonaws.services.iot.model.DeleteRegistrationCodeResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DeleteRegistrationCodeRequest request]
    (-> this (.deleteRegistrationCode request))))

(defn delete-job
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.DeleteJobRequest`

  returns: Result of the DeleteJob operation returned by the service. - `com.amazonaws.services.iot.model.DeleteJobResult`"
  (^com.amazonaws.services.iot.model.DeleteJobResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DeleteJobRequest request]
    (-> this (.deleteJob request))))

(defn list-targets-for-policy
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.ListTargetsForPolicyRequest`

  returns: Result of the ListTargetsForPolicy operation returned by the service. - `com.amazonaws.services.iot.model.ListTargetsForPolicyResult`"
  (^com.amazonaws.services.iot.model.ListTargetsForPolicyResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListTargetsForPolicyRequest request]
    (-> this (.listTargetsForPolicy request))))

(defn list-thing-groups-for-thing
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.ListThingGroupsForThingRequest`

  returns: Result of the ListThingGroupsForThing operation returned by the service. - `com.amazonaws.services.iot.model.ListThingGroupsForThingResult`"
  (^com.amazonaws.services.iot.model.ListThingGroupsForThingResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListThingGroupsForThingRequest request]
    (-> this (.listThingGroupsForThing request))))

(defn delete-role-alias
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.DeleteRoleAliasRequest`

  returns: Result of the DeleteRoleAlias operation returned by the service. - `com.amazonaws.services.iot.model.DeleteRoleAliasResult`"
  (^com.amazonaws.services.iot.model.DeleteRoleAliasResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DeleteRoleAliasRequest request]
    (-> this (.deleteRoleAlias request))))

(defn set-logging-options
  "Description copied from interface: AWSIot

  request - The input for the SetLoggingOptions operation. - `com.amazonaws.services.iot.model.SetLoggingOptionsRequest`

  returns: Result of the SetLoggingOptions operation returned by the service. - `com.amazonaws.services.iot.model.SetLoggingOptionsResult`"
  (^com.amazonaws.services.iot.model.SetLoggingOptionsResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.SetLoggingOptionsRequest request]
    (-> this (.setLoggingOptions request))))

(defn list-job-executions-for-job
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.ListJobExecutionsForJobRequest`

  returns: Result of the ListJobExecutionsForJob operation returned by the service. - `com.amazonaws.services.iot.model.ListJobExecutionsForJobResult`"
  (^com.amazonaws.services.iot.model.ListJobExecutionsForJobResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListJobExecutionsForJobRequest request]
    (-> this (.listJobExecutionsForJob request))))

(defn update-thing
  "Description copied from interface: AWSIot

  request - The input for the UpdateThing operation. - `com.amazonaws.services.iot.model.UpdateThingRequest`

  returns: Result of the UpdateThing operation returned by the service. - `com.amazonaws.services.iot.model.UpdateThingResult`"
  (^com.amazonaws.services.iot.model.UpdateThingResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.UpdateThingRequest request]
    (-> this (.updateThing request))))

(defn describe-thing-type
  "Description copied from interface: AWSIot

  request - The input for the DescribeThingType operation. - `com.amazonaws.services.iot.model.DescribeThingTypeRequest`

  returns: Result of the DescribeThingType operation returned by the service. - `com.amazonaws.services.iot.model.DescribeThingTypeResult`"
  (^com.amazonaws.services.iot.model.DescribeThingTypeResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DescribeThingTypeRequest request]
    (-> this (.describeThingType request))))

(defn delete-ota-update
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.DeleteOTAUpdateRequest`

  returns: Result of the DeleteOTAUpdate operation returned by the service. - `com.amazonaws.services.iot.model.DeleteOTAUpdateResult`"
  (^com.amazonaws.services.iot.model.DeleteOTAUpdateResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DeleteOTAUpdateRequest request]
    (-> this (.deleteOTAUpdate request))))

(defn list-things-in-billing-group
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.ListThingsInBillingGroupRequest`

  returns: Result of the ListThingsInBillingGroup operation returned by the service. - `com.amazonaws.services.iot.model.ListThingsInBillingGroupResult`"
  (^com.amazonaws.services.iot.model.ListThingsInBillingGroupResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListThingsInBillingGroupRequest request]
    (-> this (.listThingsInBillingGroup request))))

(defn update-security-profile
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.UpdateSecurityProfileRequest`

  returns: Result of the UpdateSecurityProfile operation returned by the service. - `com.amazonaws.services.iot.model.UpdateSecurityProfileResult`"
  (^com.amazonaws.services.iot.model.UpdateSecurityProfileResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.UpdateSecurityProfileRequest request]
    (-> this (.updateSecurityProfile request))))

(defn create-policy-version
  "Description copied from interface: AWSIot

  request - The input for the CreatePolicyVersion operation. - `com.amazonaws.services.iot.model.CreatePolicyVersionRequest`

  returns: Result of the CreatePolicyVersion operation returned by the service. - `com.amazonaws.services.iot.model.CreatePolicyVersionResult`"
  (^com.amazonaws.services.iot.model.CreatePolicyVersionResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.CreatePolicyVersionRequest request]
    (-> this (.createPolicyVersion request))))

(defn set-default-authorizer
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.SetDefaultAuthorizerRequest`

  returns: Result of the SetDefaultAuthorizer operation returned by the service. - `com.amazonaws.services.iot.model.SetDefaultAuthorizerResult`"
  (^com.amazonaws.services.iot.model.SetDefaultAuthorizerResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.SetDefaultAuthorizerRequest request]
    (-> this (.setDefaultAuthorizer request))))

(defn list-principal-things
  "Description copied from interface: AWSIot

  request - The input for the ListPrincipalThings operation. - `com.amazonaws.services.iot.model.ListPrincipalThingsRequest`

  returns: Result of the ListPrincipalThings operation returned by the service. - `com.amazonaws.services.iot.model.ListPrincipalThingsResult`"
  (^com.amazonaws.services.iot.model.ListPrincipalThingsResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListPrincipalThingsRequest request]
    (-> this (.listPrincipalThings request))))

(defn add-thing-to-billing-group
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.AddThingToBillingGroupRequest`

  returns: Result of the AddThingToBillingGroup operation returned by the service. - `com.amazonaws.services.iot.model.AddThingToBillingGroupResult`"
  (^com.amazonaws.services.iot.model.AddThingToBillingGroupResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.AddThingToBillingGroupRequest request]
    (-> this (.addThingToBillingGroup request))))

(defn list-security-profiles
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.ListSecurityProfilesRequest`

  returns: Result of the ListSecurityProfiles operation returned by the service. - `com.amazonaws.services.iot.model.ListSecurityProfilesResult`"
  (^com.amazonaws.services.iot.model.ListSecurityProfilesResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListSecurityProfilesRequest request]
    (-> this (.listSecurityProfiles request))))

(defn delete-policy-version
  "Description copied from interface: AWSIot

  request - The input for the DeletePolicyVersion operation. - `com.amazonaws.services.iot.model.DeletePolicyVersionRequest`

  returns: Result of the DeletePolicyVersion operation returned by the service. - `com.amazonaws.services.iot.model.DeletePolicyVersionResult`"
  (^com.amazonaws.services.iot.model.DeletePolicyVersionResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DeletePolicyVersionRequest request]
    (-> this (.deletePolicyVersion request))))

(defn start-on-demand-audit-task
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.StartOnDemandAuditTaskRequest`

  returns: Result of the StartOnDemandAuditTask operation returned by the service. - `com.amazonaws.services.iot.model.StartOnDemandAuditTaskResult`"
  (^com.amazonaws.services.iot.model.StartOnDemandAuditTaskResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.StartOnDemandAuditTaskRequest request]
    (-> this (.startOnDemandAuditTask request))))

(defn update-dynamic-thing-group
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.UpdateDynamicThingGroupRequest`

  returns: Result of the UpdateDynamicThingGroup operation returned by the service. - `com.amazonaws.services.iot.model.UpdateDynamicThingGroupResult`"
  (^com.amazonaws.services.iot.model.UpdateDynamicThingGroupResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.UpdateDynamicThingGroupRequest request]
    (-> this (.updateDynamicThingGroup request))))

(defn list-outgoing-certificates
  "Description copied from interface: AWSIot

  request - The input to the ListOutgoingCertificates operation. - `com.amazonaws.services.iot.model.ListOutgoingCertificatesRequest`

  returns: Result of the ListOutgoingCertificates operation returned by the service. - `com.amazonaws.services.iot.model.ListOutgoingCertificatesResult`"
  (^com.amazonaws.services.iot.model.ListOutgoingCertificatesResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListOutgoingCertificatesRequest request]
    (-> this (.listOutgoingCertificates request))))

(defn delete-policy
  "Description copied from interface: AWSIot

  request - The input for the DeletePolicy operation. - `com.amazonaws.services.iot.model.DeletePolicyRequest`

  returns: Result of the DeletePolicy operation returned by the service. - `com.amazonaws.services.iot.model.DeletePolicyResult`"
  (^com.amazonaws.services.iot.model.DeletePolicyResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DeletePolicyRequest request]
    (-> this (.deletePolicy request))))

(defn replace-topic-rule
  "Description copied from interface: AWSIot

  request - The input for the ReplaceTopicRule operation. - `com.amazonaws.services.iot.model.ReplaceTopicRuleRequest`

  returns: Result of the ReplaceTopicRule operation returned by the service. - `com.amazonaws.services.iot.model.ReplaceTopicRuleResult`"
  (^com.amazonaws.services.iot.model.ReplaceTopicRuleResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ReplaceTopicRuleRequest request]
    (-> this (.replaceTopicRule request))))

(defn describe-audit-task
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.DescribeAuditTaskRequest`

  returns: Result of the DescribeAuditTask operation returned by the service. - `com.amazonaws.services.iot.model.DescribeAuditTaskResult`"
  (^com.amazonaws.services.iot.model.DescribeAuditTaskResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DescribeAuditTaskRequest request]
    (-> this (.describeAuditTask request))))

(defn shutdown
  "Description copied from interface: AWSIot"
  ([^AbstractAWSIot this]
    (-> this (.shutdown))))

(defn attach-policy
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.AttachPolicyRequest`

  returns: Result of the AttachPolicy operation returned by the service. - `com.amazonaws.services.iot.model.AttachPolicyResult`"
  (^com.amazonaws.services.iot.model.AttachPolicyResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.AttachPolicyRequest request]
    (-> this (.attachPolicy request))))

(defn list-thing-groups
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.ListThingGroupsRequest`

  returns: Result of the ListThingGroups operation returned by the service. - `com.amazonaws.services.iot.model.ListThingGroupsResult`"
  (^com.amazonaws.services.iot.model.ListThingGroupsResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListThingGroupsRequest request]
    (-> this (.listThingGroups request))))

(defn stop-thing-registration-task
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.StopThingRegistrationTaskRequest`

  returns: Result of the StopThingRegistrationTask operation returned by the service. - `com.amazonaws.services.iot.model.StopThingRegistrationTaskResult`"
  (^com.amazonaws.services.iot.model.StopThingRegistrationTaskResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.StopThingRegistrationTaskRequest request]
    (-> this (.stopThingRegistrationTask request))))

(defn validate-security-profile-behaviors
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.ValidateSecurityProfileBehaviorsRequest`

  returns: Result of the ValidateSecurityProfileBehaviors operation returned by the service. - `com.amazonaws.services.iot.model.ValidateSecurityProfileBehaviorsResult`"
  (^com.amazonaws.services.iot.model.ValidateSecurityProfileBehaviorsResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ValidateSecurityProfileBehaviorsRequest request]
    (-> this (.validateSecurityProfileBehaviors request))))

(defn describe-event-configurations
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.DescribeEventConfigurationsRequest`

  returns: Result of the DescribeEventConfigurations operation returned by the service. - `com.amazonaws.services.iot.model.DescribeEventConfigurationsResult`"
  (^com.amazonaws.services.iot.model.DescribeEventConfigurationsResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DescribeEventConfigurationsRequest request]
    (-> this (.describeEventConfigurations request))))

(defn list-streams
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.ListStreamsRequest`

  returns: Result of the ListStreams operation returned by the service. - `com.amazonaws.services.iot.model.ListStreamsResult`"
  (^com.amazonaws.services.iot.model.ListStreamsResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListStreamsRequest request]
    (-> this (.listStreams request))))

(defn describe-ca-certificate
  "Description copied from interface: AWSIot

  request - The input for the DescribeCACertificate operation. - `com.amazonaws.services.iot.model.DescribeCACertificateRequest`

  returns: Result of the DescribeCACertificate operation returned by the service. - `com.amazonaws.services.iot.model.DescribeCACertificateResult`"
  (^com.amazonaws.services.iot.model.DescribeCACertificateResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DescribeCACertificateRequest request]
    (-> this (.describeCACertificate request))))

(defn test-invoke-authorizer
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.TestInvokeAuthorizerRequest`

  returns: Result of the TestInvokeAuthorizer operation returned by the service. - `com.amazonaws.services.iot.model.TestInvokeAuthorizerResult`"
  (^com.amazonaws.services.iot.model.TestInvokeAuthorizerResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.TestInvokeAuthorizerRequest request]
    (-> this (.testInvokeAuthorizer request))))

(defn describe-certificate
  "Description copied from interface: AWSIot

  request - The input for the DescribeCertificate operation. - `com.amazonaws.services.iot.model.DescribeCertificateRequest`

  returns: Result of the DescribeCertificate operation returned by the service. - `com.amazonaws.services.iot.model.DescribeCertificateResult`"
  (^com.amazonaws.services.iot.model.DescribeCertificateResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DescribeCertificateRequest request]
    (-> this (.describeCertificate request))))

(defn delete-thing
  "Description copied from interface: AWSIot

  request - The input for the DeleteThing operation. - `com.amazonaws.services.iot.model.DeleteThingRequest`

  returns: Result of the DeleteThing operation returned by the service. - `com.amazonaws.services.iot.model.DeleteThingResult`"
  (^com.amazonaws.services.iot.model.DeleteThingResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DeleteThingRequest request]
    (-> this (.deleteThing request))))

(defn list-thing-principals
  "Description copied from interface: AWSIot

  request - The input for the ListThingPrincipal operation. - `com.amazonaws.services.iot.model.ListThingPrincipalsRequest`

  returns: Result of the ListThingPrincipals operation returned by the service. - `com.amazonaws.services.iot.model.ListThingPrincipalsResult`"
  (^com.amazonaws.services.iot.model.ListThingPrincipalsResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListThingPrincipalsRequest request]
    (-> this (.listThingPrincipals request))))

(defn describe-endpoint
  "Description copied from interface: AWSIot

  request - The input for the DescribeEndpoint operation. - `com.amazonaws.services.iot.model.DescribeEndpointRequest`

  returns: Result of the DescribeEndpoint operation returned by the service. - `com.amazonaws.services.iot.model.DescribeEndpointResult`"
  (^com.amazonaws.services.iot.model.DescribeEndpointResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DescribeEndpointRequest request]
    (-> this (.describeEndpoint request))))

(defn describe-thing
  "Description copied from interface: AWSIot

  request - The input for the DescribeThing operation. - `com.amazonaws.services.iot.model.DescribeThingRequest`

  returns: Result of the DescribeThing operation returned by the service. - `com.amazonaws.services.iot.model.DescribeThingResult`"
  (^com.amazonaws.services.iot.model.DescribeThingResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DescribeThingRequest request]
    (-> this (.describeThing request))))

(defn list-ca-certificates
  "Description copied from interface: AWSIot

  request - Input for the ListCACertificates operation. - `com.amazonaws.services.iot.model.ListCACertificatesRequest`

  returns: Result of the ListCACertificates operation returned by the service. - `com.amazonaws.services.iot.model.ListCACertificatesResult`"
  (^com.amazonaws.services.iot.model.ListCACertificatesResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListCACertificatesRequest request]
    (-> this (.listCACertificates request))))

(defn delete-dynamic-thing-group
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.DeleteDynamicThingGroupRequest`

  returns: Result of the DeleteDynamicThingGroup operation returned by the service. - `com.amazonaws.services.iot.model.DeleteDynamicThingGroupResult`"
  (^com.amazonaws.services.iot.model.DeleteDynamicThingGroupResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DeleteDynamicThingGroupRequest request]
    (-> this (.deleteDynamicThingGroup request))))

(defn list-things
  "Description copied from interface: AWSIot

  request - The input for the ListThings operation. - `com.amazonaws.services.iot.model.ListThingsRequest`

  returns: Result of the ListThings operation returned by the service. - `com.amazonaws.services.iot.model.ListThingsResult`"
  (^com.amazonaws.services.iot.model.ListThingsResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListThingsRequest request]
    (-> this (.listThings request))))

(defn set-endpoint
  "Description copied from interface: AWSIot

  endpoint - The endpoint (ex: \"iot.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://iot.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAWSIot this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn create-role-alias
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.CreateRoleAliasRequest`

  returns: Result of the CreateRoleAlias operation returned by the service. - `com.amazonaws.services.iot.model.CreateRoleAliasResult`"
  (^com.amazonaws.services.iot.model.CreateRoleAliasResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.CreateRoleAliasRequest request]
    (-> this (.createRoleAlias request))))

(defn cancel-job
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.CancelJobRequest`

  returns: Result of the CancelJob operation returned by the service. - `com.amazonaws.services.iot.model.CancelJobResult`"
  (^com.amazonaws.services.iot.model.CancelJobResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.CancelJobRequest request]
    (-> this (.cancelJob request))))

(defn delete-certificate
  "Description copied from interface: AWSIot

  request - The input for the DeleteCertificate operation. - `com.amazonaws.services.iot.model.DeleteCertificateRequest`

  returns: Result of the DeleteCertificate operation returned by the service. - `com.amazonaws.services.iot.model.DeleteCertificateResult`"
  (^com.amazonaws.services.iot.model.DeleteCertificateResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DeleteCertificateRequest request]
    (-> this (.deleteCertificate request))))

(defn register-ca-certificate
  "Description copied from interface: AWSIot

  request - The input to the RegisterCACertificate operation. - `com.amazonaws.services.iot.model.RegisterCACertificateRequest`

  returns: Result of the RegisterCACertificate operation returned by the service. - `com.amazonaws.services.iot.model.RegisterCACertificateResult`"
  (^com.amazonaws.services.iot.model.RegisterCACertificateResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.RegisterCACertificateRequest request]
    (-> this (.registerCACertificate request))))

(defn add-thing-to-thing-group
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.AddThingToThingGroupRequest`

  returns: Result of the AddThingToThingGroup operation returned by the service. - `com.amazonaws.services.iot.model.AddThingToThingGroupResult`"
  (^com.amazonaws.services.iot.model.AddThingToThingGroupResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.AddThingToThingGroupRequest request]
    (-> this (.addThingToThingGroup request))))

(defn describe-role-alias
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.DescribeRoleAliasRequest`

  returns: Result of the DescribeRoleAlias operation returned by the service. - `com.amazonaws.services.iot.model.DescribeRoleAliasResult`"
  (^com.amazonaws.services.iot.model.DescribeRoleAliasResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DescribeRoleAliasRequest request]
    (-> this (.describeRoleAlias request))))

(defn transfer-certificate
  "Description copied from interface: AWSIot

  request - The input for the TransferCertificate operation. - `com.amazonaws.services.iot.model.TransferCertificateRequest`

  returns: Result of the TransferCertificate operation returned by the service. - `com.amazonaws.services.iot.model.TransferCertificateResult`"
  (^com.amazonaws.services.iot.model.TransferCertificateResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.TransferCertificateRequest request]
    (-> this (.transferCertificate request))))

(defn get-statistics
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.GetStatisticsRequest`

  returns: Result of the GetStatistics operation returned by the service. - `com.amazonaws.services.iot.model.GetStatisticsResult`"
  (^com.amazonaws.services.iot.model.GetStatisticsResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.GetStatisticsRequest request]
    (-> this (.getStatistics request))))

(defn set-v-2-logging-options
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.SetV2LoggingOptionsRequest`

  returns: Result of the SetV2LoggingOptions operation returned by the service. - `com.amazonaws.services.iot.model.SetV2LoggingOptionsResult`"
  (^com.amazonaws.services.iot.model.SetV2LoggingOptionsResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.SetV2LoggingOptionsRequest request]
    (-> this (.setV2LoggingOptions request))))

(defn get-policy
  "Description copied from interface: AWSIot

  request - The input for the GetPolicy operation. - `com.amazonaws.services.iot.model.GetPolicyRequest`

  returns: Result of the GetPolicy operation returned by the service. - `com.amazonaws.services.iot.model.GetPolicyResult`"
  (^com.amazonaws.services.iot.model.GetPolicyResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.GetPolicyRequest request]
    (-> this (.getPolicy request))))

(defn list-jobs
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.ListJobsRequest`

  returns: Result of the ListJobs operation returned by the service. - `com.amazonaws.services.iot.model.ListJobsResult`"
  (^com.amazonaws.services.iot.model.ListJobsResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListJobsRequest request]
    (-> this (.listJobs request))))

(defn list-policy-versions
  "Description copied from interface: AWSIot

  request - The input for the ListPolicyVersions operation. - `com.amazonaws.services.iot.model.ListPolicyVersionsRequest`

  returns: Result of the ListPolicyVersions operation returned by the service. - `com.amazonaws.services.iot.model.ListPolicyVersionsResult`"
  (^com.amazonaws.services.iot.model.ListPolicyVersionsResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListPolicyVersionsRequest request]
    (-> this (.listPolicyVersions request))))

(defn clear-default-authorizer
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.ClearDefaultAuthorizerRequest`

  returns: Result of the ClearDefaultAuthorizer operation returned by the service. - `com.amazonaws.services.iot.model.ClearDefaultAuthorizerResult`"
  (^com.amazonaws.services.iot.model.ClearDefaultAuthorizerResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ClearDefaultAuthorizerRequest request]
    (-> this (.clearDefaultAuthorizer request))))

(defn get-v-2-logging-options
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.GetV2LoggingOptionsRequest`

  returns: Result of the GetV2LoggingOptions operation returned by the service. - `com.amazonaws.services.iot.model.GetV2LoggingOptionsResult`"
  (^com.amazonaws.services.iot.model.GetV2LoggingOptionsResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.GetV2LoggingOptionsRequest request]
    (-> this (.getV2LoggingOptions request))))

(defn detach-policy
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.DetachPolicyRequest`

  returns: Result of the DetachPolicy operation returned by the service. - `com.amazonaws.services.iot.model.DetachPolicyResult`"
  (^com.amazonaws.services.iot.model.DetachPolicyResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DetachPolicyRequest request]
    (-> this (.detachPolicy request))))

(defn attach-thing-principal
  "Description copied from interface: AWSIot

  request - The input for the AttachThingPrincipal operation. - `com.amazonaws.services.iot.model.AttachThingPrincipalRequest`

  returns: Result of the AttachThingPrincipal operation returned by the service. - `com.amazonaws.services.iot.model.AttachThingPrincipalResult`"
  (^com.amazonaws.services.iot.model.AttachThingPrincipalResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.AttachThingPrincipalRequest request]
    (-> this (.attachThingPrincipal request))))

(defn delete-v-2-logging-level
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.DeleteV2LoggingLevelRequest`

  returns: Result of the DeleteV2LoggingLevel operation returned by the service. - `com.amazonaws.services.iot.model.DeleteV2LoggingLevelResult`"
  (^com.amazonaws.services.iot.model.DeleteV2LoggingLevelResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DeleteV2LoggingLevelRequest request]
    (-> this (.deleteV2LoggingLevel request))))

(defn delete-scheduled-audit
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.DeleteScheduledAuditRequest`

  returns: Result of the DeleteScheduledAudit operation returned by the service. - `com.amazonaws.services.iot.model.DeleteScheduledAuditResult`"
  (^com.amazonaws.services.iot.model.DeleteScheduledAuditResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DeleteScheduledAuditRequest request]
    (-> this (.deleteScheduledAudit request))))

(defn delete-billing-group
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.DeleteBillingGroupRequest`

  returns: Result of the DeleteBillingGroup operation returned by the service. - `com.amazonaws.services.iot.model.DeleteBillingGroupResult`"
  (^com.amazonaws.services.iot.model.DeleteBillingGroupResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DeleteBillingGroupRequest request]
    (-> this (.deleteBillingGroup request))))

(defn list-violation-events
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.ListViolationEventsRequest`

  returns: Result of the ListViolationEvents operation returned by the service. - `com.amazonaws.services.iot.model.ListViolationEventsResult`"
  (^com.amazonaws.services.iot.model.ListViolationEventsResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListViolationEventsRequest request]
    (-> this (.listViolationEvents request))))

(defn list-topic-rules
  "Description copied from interface: AWSIot

  request - The input for the ListTopicRules operation. - `com.amazonaws.services.iot.model.ListTopicRulesRequest`

  returns: Result of the ListTopicRules operation returned by the service. - `com.amazonaws.services.iot.model.ListTopicRulesResult`"
  (^com.amazonaws.services.iot.model.ListTopicRulesResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListTopicRulesRequest request]
    (-> this (.listTopicRules request))))

(defn list-thing-registration-tasks
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.ListThingRegistrationTasksRequest`

  returns: Result of the ListThingRegistrationTasks operation returned by the service. - `com.amazonaws.services.iot.model.ListThingRegistrationTasksResult`"
  (^com.amazonaws.services.iot.model.ListThingRegistrationTasksResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListThingRegistrationTasksRequest request]
    (-> this (.listThingRegistrationTasks request))))

(defn update-scheduled-audit
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.UpdateScheduledAuditRequest`

  returns: Result of the UpdateScheduledAudit operation returned by the service. - `com.amazonaws.services.iot.model.UpdateScheduledAuditResult`"
  (^com.amazonaws.services.iot.model.UpdateScheduledAuditResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.UpdateScheduledAuditRequest request]
    (-> this (.updateScheduledAudit request))))

(defn get-indexing-configuration
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.GetIndexingConfigurationRequest`

  returns: Result of the GetIndexingConfiguration operation returned by the service. - `com.amazonaws.services.iot.model.GetIndexingConfigurationResult`"
  (^com.amazonaws.services.iot.model.GetIndexingConfigurationResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.GetIndexingConfigurationRequest request]
    (-> this (.getIndexingConfiguration request))))

(defn list-billing-groups
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.ListBillingGroupsRequest`

  returns: Result of the ListBillingGroups operation returned by the service. - `com.amazonaws.services.iot.model.ListBillingGroupsResult`"
  (^com.amazonaws.services.iot.model.ListBillingGroupsResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListBillingGroupsRequest request]
    (-> this (.listBillingGroups request))))

(defn delete-thing-group
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.DeleteThingGroupRequest`

  returns: Result of the DeleteThingGroup operation returned by the service. - `com.amazonaws.services.iot.model.DeleteThingGroupResult`"
  (^com.amazonaws.services.iot.model.DeleteThingGroupResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DeleteThingGroupRequest request]
    (-> this (.deleteThingGroup request))))

(defn update-thing-groups-for-thing
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.UpdateThingGroupsForThingRequest`

  returns: Result of the UpdateThingGroupsForThing operation returned by the service. - `com.amazonaws.services.iot.model.UpdateThingGroupsForThingResult`"
  (^com.amazonaws.services.iot.model.UpdateThingGroupsForThingResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.UpdateThingGroupsForThingRequest request]
    (-> this (.updateThingGroupsForThing request))))

(defn list-role-aliases
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.ListRoleAliasesRequest`

  returns: Result of the ListRoleAliases operation returned by the service. - `com.amazonaws.services.iot.model.ListRoleAliasesResult`"
  (^com.amazonaws.services.iot.model.ListRoleAliasesResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListRoleAliasesRequest request]
    (-> this (.listRoleAliases request))))

(defn attach-principal-policy
  "Deprecated.

  request - The input for the AttachPrincipalPolicy operation. - `com.amazonaws.services.iot.model.AttachPrincipalPolicyRequest`

  returns: Result of the AttachPrincipalPolicy operation returned by the service. - `com.amazonaws.services.iot.model.AttachPrincipalPolicyResult`"
  (^com.amazonaws.services.iot.model.AttachPrincipalPolicyResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.AttachPrincipalPolicyRequest request]
    (-> this (.attachPrincipalPolicy request))))

(defn list-thing-registration-task-reports
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.ListThingRegistrationTaskReportsRequest`

  returns: Result of the ListThingRegistrationTaskReports operation returned by the service. - `com.amazonaws.services.iot.model.ListThingRegistrationTaskReportsResult`"
  (^com.amazonaws.services.iot.model.ListThingRegistrationTaskReportsResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListThingRegistrationTaskReportsRequest request]
    (-> this (.listThingRegistrationTaskReports request))))

(defn update-billing-group
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.UpdateBillingGroupRequest`

  returns: Result of the UpdateBillingGroup operation returned by the service. - `com.amazonaws.services.iot.model.UpdateBillingGroupResult`"
  (^com.amazonaws.services.iot.model.UpdateBillingGroupResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.UpdateBillingGroupRequest request]
    (-> this (.updateBillingGroup request))))

(defn describe-account-audit-configuration
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.DescribeAccountAuditConfigurationRequest`

  returns: Result of the DescribeAccountAuditConfiguration operation returned by the service. - `com.amazonaws.services.iot.model.DescribeAccountAuditConfigurationResult`"
  (^com.amazonaws.services.iot.model.DescribeAccountAuditConfigurationResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DescribeAccountAuditConfigurationRequest request]
    (-> this (.describeAccountAuditConfiguration request))))

(defn update-stream
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.UpdateStreamRequest`

  returns: Result of the UpdateStream operation returned by the service. - `com.amazonaws.services.iot.model.UpdateStreamResult`"
  (^com.amazonaws.services.iot.model.UpdateStreamResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.UpdateStreamRequest request]
    (-> this (.updateStream request))))

(defn list-ota-updates
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.ListOTAUpdatesRequest`

  returns: Result of the ListOTAUpdates operation returned by the service. - `com.amazonaws.services.iot.model.ListOTAUpdatesResult`"
  (^com.amazonaws.services.iot.model.ListOTAUpdatesResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListOTAUpdatesRequest request]
    (-> this (.listOTAUpdates request))))

(defn get-topic-rule
  "Description copied from interface: AWSIot

  request - The input for the GetTopicRule operation. - `com.amazonaws.services.iot.model.GetTopicRuleRequest`

  returns: Result of the GetTopicRule operation returned by the service. - `com.amazonaws.services.iot.model.GetTopicRuleResult`"
  (^com.amazonaws.services.iot.model.GetTopicRuleResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.GetTopicRuleRequest request]
    (-> this (.getTopicRule request))))

(defn create-thing-type
  "Description copied from interface: AWSIot

  request - The input for the CreateThingType operation. - `com.amazonaws.services.iot.model.CreateThingTypeRequest`

  returns: Result of the CreateThingType operation returned by the service. - `com.amazonaws.services.iot.model.CreateThingTypeResult`"
  (^com.amazonaws.services.iot.model.CreateThingTypeResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.CreateThingTypeRequest request]
    (-> this (.createThingType request))))

(defn update-certificate
  "Description copied from interface: AWSIot

  request - The input for the UpdateCertificate operation. - `com.amazonaws.services.iot.model.UpdateCertificateRequest`

  returns: Result of the UpdateCertificate operation returned by the service. - `com.amazonaws.services.iot.model.UpdateCertificateResult`"
  (^com.amazonaws.services.iot.model.UpdateCertificateResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.UpdateCertificateRequest request]
    (-> this (.updateCertificate request))))

(defn get-logging-options
  "Description copied from interface: AWSIot

  request - The input for the GetLoggingOptions operation. - `com.amazonaws.services.iot.model.GetLoggingOptionsRequest`

  returns: Result of the GetLoggingOptions operation returned by the service. - `com.amazonaws.services.iot.model.GetLoggingOptionsResult`"
  (^com.amazonaws.services.iot.model.GetLoggingOptionsResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.GetLoggingOptionsRequest request]
    (-> this (.getLoggingOptions request))))

(defn list-job-executions-for-thing
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.ListJobExecutionsForThingRequest`

  returns: Result of the ListJobExecutionsForThing operation returned by the service. - `com.amazonaws.services.iot.model.ListJobExecutionsForThingResult`"
  (^com.amazonaws.services.iot.model.ListJobExecutionsForThingResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListJobExecutionsForThingRequest request]
    (-> this (.listJobExecutionsForThing request))))

(defn create-thing-group
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.CreateThingGroupRequest`

  returns: Result of the CreateThingGroup operation returned by the service. - `com.amazonaws.services.iot.model.CreateThingGroupResult`"
  (^com.amazonaws.services.iot.model.CreateThingGroupResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.CreateThingGroupRequest request]
    (-> this (.createThingGroup request))))

(defn remove-thing-from-billing-group
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.RemoveThingFromBillingGroupRequest`

  returns: Result of the RemoveThingFromBillingGroup operation returned by the service. - `com.amazonaws.services.iot.model.RemoveThingFromBillingGroupResult`"
  (^com.amazonaws.services.iot.model.RemoveThingFromBillingGroupResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.RemoveThingFromBillingGroupRequest request]
    (-> this (.removeThingFromBillingGroup request))))

(defn list-policy-principals
  "Deprecated.

  request - The input for the ListPolicyPrincipals operation. - `com.amazonaws.services.iot.model.ListPolicyPrincipalsRequest`

  returns: Result of the ListPolicyPrincipals operation returned by the service. - `com.amazonaws.services.iot.model.ListPolicyPrincipalsResult`"
  (^com.amazonaws.services.iot.model.ListPolicyPrincipalsResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListPolicyPrincipalsRequest request]
    (-> this (.listPolicyPrincipals request))))

(defn create-policy
  "Description copied from interface: AWSIot

  request - The input for the CreatePolicy operation. - `com.amazonaws.services.iot.model.CreatePolicyRequest`

  returns: Result of the CreatePolicy operation returned by the service. - `com.amazonaws.services.iot.model.CreatePolicyResult`"
  (^com.amazonaws.services.iot.model.CreatePolicyResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.CreatePolicyRequest request]
    (-> this (.createPolicy request))))

(defn create-authorizer
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.CreateAuthorizerRequest`

  returns: Result of the CreateAuthorizer operation returned by the service. - `com.amazonaws.services.iot.model.CreateAuthorizerResult`"
  (^com.amazonaws.services.iot.model.CreateAuthorizerResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.CreateAuthorizerRequest request]
    (-> this (.createAuthorizer request))))

(defn get-effective-policies
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.GetEffectivePoliciesRequest`

  returns: Result of the GetEffectivePolicies operation returned by the service. - `com.amazonaws.services.iot.model.GetEffectivePoliciesResult`"
  (^com.amazonaws.services.iot.model.GetEffectivePoliciesResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.GetEffectivePoliciesRequest request]
    (-> this (.getEffectivePolicies request))))

(defn describe-job-execution
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.DescribeJobExecutionRequest`

  returns: Result of the DescribeJobExecution operation returned by the service. - `com.amazonaws.services.iot.model.DescribeJobExecutionResult`"
  (^com.amazonaws.services.iot.model.DescribeJobExecutionResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DescribeJobExecutionRequest request]
    (-> this (.describeJobExecution request))))

(defn describe-scheduled-audit
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.DescribeScheduledAuditRequest`

  returns: Result of the DescribeScheduledAudit operation returned by the service. - `com.amazonaws.services.iot.model.DescribeScheduledAuditResult`"
  (^com.amazonaws.services.iot.model.DescribeScheduledAuditResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DescribeScheduledAuditRequest request]
    (-> this (.describeScheduledAudit request))))

(defn list-policies
  "Description copied from interface: AWSIot

  request - The input for the ListPolicies operation. - `com.amazonaws.services.iot.model.ListPoliciesRequest`

  returns: Result of the ListPolicies operation returned by the service. - `com.amazonaws.services.iot.model.ListPoliciesResult`"
  (^com.amazonaws.services.iot.model.ListPoliciesResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListPoliciesRequest request]
    (-> this (.listPolicies request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSIot

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSIot this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-indices
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.ListIndicesRequest`

  returns: Result of the ListIndices operation returned by the service. - `com.amazonaws.services.iot.model.ListIndicesResult`"
  (^com.amazonaws.services.iot.model.ListIndicesResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListIndicesRequest request]
    (-> this (.listIndices request))))

(defn delete-security-profile
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.DeleteSecurityProfileRequest`

  returns: Result of the DeleteSecurityProfile operation returned by the service. - `com.amazonaws.services.iot.model.DeleteSecurityProfileResult`"
  (^com.amazonaws.services.iot.model.DeleteSecurityProfileResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DeleteSecurityProfileRequest request]
    (-> this (.deleteSecurityProfile request))))

(defn get-policy-version
  "Description copied from interface: AWSIot

  request - The input for the GetPolicyVersion operation. - `com.amazonaws.services.iot.model.GetPolicyVersionRequest`

  returns: Result of the GetPolicyVersion operation returned by the service. - `com.amazonaws.services.iot.model.GetPolicyVersionResult`"
  (^com.amazonaws.services.iot.model.GetPolicyVersionResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.GetPolicyVersionRequest request]
    (-> this (.getPolicyVersion request))))

(defn list-authorizers
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.ListAuthorizersRequest`

  returns: Result of the ListAuthorizers operation returned by the service. - `com.amazonaws.services.iot.model.ListAuthorizersResult`"
  (^com.amazonaws.services.iot.model.ListAuthorizersResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListAuthorizersRequest request]
    (-> this (.listAuthorizers request))))

(defn describe-security-profile
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.DescribeSecurityProfileRequest`

  returns: Result of the DescribeSecurityProfile operation returned by the service. - `com.amazonaws.services.iot.model.DescribeSecurityProfileResult`"
  (^com.amazonaws.services.iot.model.DescribeSecurityProfileResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DescribeSecurityProfileRequest request]
    (-> this (.describeSecurityProfile request))))

(defn create-job
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.CreateJobRequest`

  returns: Result of the CreateJob operation returned by the service. - `com.amazonaws.services.iot.model.CreateJobResult`"
  (^com.amazonaws.services.iot.model.CreateJobResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.CreateJobRequest request]
    (-> this (.createJob request))))

(defn delete-topic-rule
  "Description copied from interface: AWSIot

  request - The input for the DeleteTopicRule operation. - `com.amazonaws.services.iot.model.DeleteTopicRuleRequest`

  returns: Result of the DeleteTopicRule operation returned by the service. - `com.amazonaws.services.iot.model.DeleteTopicRuleResult`"
  (^com.amazonaws.services.iot.model.DeleteTopicRuleResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DeleteTopicRuleRequest request]
    (-> this (.deleteTopicRule request))))

(defn detach-security-profile
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.DetachSecurityProfileRequest`

  returns: Result of the DetachSecurityProfile operation returned by the service. - `com.amazonaws.services.iot.model.DetachSecurityProfileResult`"
  (^com.amazonaws.services.iot.model.DetachSecurityProfileResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DetachSecurityProfileRequest request]
    (-> this (.detachSecurityProfile request))))

(defn cancel-job-execution
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.CancelJobExecutionRequest`

  returns: Result of the CancelJobExecution operation returned by the service. - `com.amazonaws.services.iot.model.CancelJobExecutionResult`"
  (^com.amazonaws.services.iot.model.CancelJobExecutionResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.CancelJobExecutionRequest request]
    (-> this (.cancelJobExecution request))))

(defn start-thing-registration-task
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.StartThingRegistrationTaskRequest`

  returns: Result of the StartThingRegistrationTask operation returned by the service. - `com.amazonaws.services.iot.model.StartThingRegistrationTaskResult`"
  (^com.amazonaws.services.iot.model.StartThingRegistrationTaskResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.StartThingRegistrationTaskRequest request]
    (-> this (.startThingRegistrationTask request))))

(defn describe-index
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.DescribeIndexRequest`

  returns: Result of the DescribeIndex operation returned by the service. - `com.amazonaws.services.iot.model.DescribeIndexResult`"
  (^com.amazonaws.services.iot.model.DescribeIndexResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DescribeIndexRequest request]
    (-> this (.describeIndex request))))

(defn list-audit-findings
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.ListAuditFindingsRequest`

  returns: Result of the ListAuditFindings operation returned by the service. - `com.amazonaws.services.iot.model.ListAuditFindingsResult`"
  (^com.amazonaws.services.iot.model.ListAuditFindingsResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListAuditFindingsRequest request]
    (-> this (.listAuditFindings request))))

(defn attach-security-profile
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.AttachSecurityProfileRequest`

  returns: Result of the AttachSecurityProfile operation returned by the service. - `com.amazonaws.services.iot.model.AttachSecurityProfileResult`"
  (^com.amazonaws.services.iot.model.AttachSecurityProfileResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.AttachSecurityProfileRequest request]
    (-> this (.attachSecurityProfile request))))

(defn tag-resource
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.iot.model.TagResourceResult`"
  (^com.amazonaws.services.iot.model.TagResourceResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn delete-authorizer
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.DeleteAuthorizerRequest`

  returns: Result of the DeleteAuthorizer operation returned by the service. - `com.amazonaws.services.iot.model.DeleteAuthorizerResult`"
  (^com.amazonaws.services.iot.model.DeleteAuthorizerResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DeleteAuthorizerRequest request]
    (-> this (.deleteAuthorizer request))))

(defn remove-thing-from-thing-group
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.RemoveThingFromThingGroupRequest`

  returns: Result of the RemoveThingFromThingGroup operation returned by the service. - `com.amazonaws.services.iot.model.RemoveThingFromThingGroupResult`"
  (^com.amazonaws.services.iot.model.RemoveThingFromThingGroupResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.RemoveThingFromThingGroupRequest request]
    (-> this (.removeThingFromThingGroup request))))

(defn create-stream
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.CreateStreamRequest`

  returns: Result of the CreateStream operation returned by the service. - `com.amazonaws.services.iot.model.CreateStreamResult`"
  (^com.amazonaws.services.iot.model.CreateStreamResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.CreateStreamRequest request]
    (-> this (.createStream request))))

(defn list-scheduled-audits
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.ListScheduledAuditsRequest`

  returns: Result of the ListScheduledAudits operation returned by the service. - `com.amazonaws.services.iot.model.ListScheduledAuditsResult`"
  (^com.amazonaws.services.iot.model.ListScheduledAuditsResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListScheduledAuditsRequest request]
    (-> this (.listScheduledAudits request))))

(defn list-things-in-thing-group
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.ListThingsInThingGroupRequest`

  returns: Result of the ListThingsInThingGroup operation returned by the service. - `com.amazonaws.services.iot.model.ListThingsInThingGroupResult`"
  (^com.amazonaws.services.iot.model.ListThingsInThingGroupResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListThingsInThingGroupRequest request]
    (-> this (.listThingsInThingGroup request))))

(defn enable-topic-rule
  "Description copied from interface: AWSIot

  request - The input for the EnableTopicRuleRequest operation. - `com.amazonaws.services.iot.model.EnableTopicRuleRequest`

  returns: Result of the EnableTopicRule operation returned by the service. - `com.amazonaws.services.iot.model.EnableTopicRuleResult`"
  (^com.amazonaws.services.iot.model.EnableTopicRuleResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.EnableTopicRuleRequest request]
    (-> this (.enableTopicRule request))))

(defn accept-certificate-transfer
  "Description copied from interface: AWSIot

  request - The input for the AcceptCertificateTransfer operation. - `com.amazonaws.services.iot.model.AcceptCertificateTransferRequest`

  returns: Result of the AcceptCertificateTransfer operation returned by the service. - `com.amazonaws.services.iot.model.AcceptCertificateTransferResult`"
  (^com.amazonaws.services.iot.model.AcceptCertificateTransferResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.AcceptCertificateTransferRequest request]
    (-> this (.acceptCertificateTransfer request))))

(defn list-targets-for-security-profile
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.ListTargetsForSecurityProfileRequest`

  returns: Result of the ListTargetsForSecurityProfile operation returned by the service. - `com.amazonaws.services.iot.model.ListTargetsForSecurityProfileResult`"
  (^com.amazonaws.services.iot.model.ListTargetsForSecurityProfileResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListTargetsForSecurityProfileRequest request]
    (-> this (.listTargetsForSecurityProfile request))))

(defn describe-billing-group
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.DescribeBillingGroupRequest`

  returns: Result of the DescribeBillingGroup operation returned by the service. - `com.amazonaws.services.iot.model.DescribeBillingGroupResult`"
  (^com.amazonaws.services.iot.model.DescribeBillingGroupResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DescribeBillingGroupRequest request]
    (-> this (.describeBillingGroup request))))

(defn get-job-document
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.GetJobDocumentRequest`

  returns: Result of the GetJobDocument operation returned by the service. - `com.amazonaws.services.iot.model.GetJobDocumentResult`"
  (^com.amazonaws.services.iot.model.GetJobDocumentResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.GetJobDocumentRequest request]
    (-> this (.getJobDocument request))))

(defn associate-targets-with-job
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.AssociateTargetsWithJobRequest`

  returns: Result of the AssociateTargetsWithJob operation returned by the service. - `com.amazonaws.services.iot.model.AssociateTargetsWithJobResult`"
  (^com.amazonaws.services.iot.model.AssociateTargetsWithJobResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.AssociateTargetsWithJobRequest request]
    (-> this (.associateTargetsWithJob request))))

(defn detach-thing-principal
  "Description copied from interface: AWSIot

  request - The input for the DetachThingPrincipal operation. - `com.amazonaws.services.iot.model.DetachThingPrincipalRequest`

  returns: Result of the DetachThingPrincipal operation returned by the service. - `com.amazonaws.services.iot.model.DetachThingPrincipalResult`"
  (^com.amazonaws.services.iot.model.DetachThingPrincipalResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DetachThingPrincipalRequest request]
    (-> this (.detachThingPrincipal request))))

(defn create-thing
  "Description copied from interface: AWSIot

  request - The input for the CreateThing operation. - `com.amazonaws.services.iot.model.CreateThingRequest`

  returns: Result of the CreateThing operation returned by the service. - `com.amazonaws.services.iot.model.CreateThingResult`"
  (^com.amazonaws.services.iot.model.CreateThingResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.CreateThingRequest request]
    (-> this (.createThing request))))

(defn list-principal-policies
  "Deprecated.

  request - The input for the ListPrincipalPolicies operation. - `com.amazonaws.services.iot.model.ListPrincipalPoliciesRequest`

  returns: Result of the ListPrincipalPolicies operation returned by the service. - `com.amazonaws.services.iot.model.ListPrincipalPoliciesResult`"
  (^com.amazonaws.services.iot.model.ListPrincipalPoliciesResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.ListPrincipalPoliciesRequest request]
    (-> this (.listPrincipalPolicies request))))

(defn describe-thing-group
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.DescribeThingGroupRequest`

  returns: Result of the DescribeThingGroup operation returned by the service. - `com.amazonaws.services.iot.model.DescribeThingGroupResult`"
  (^com.amazonaws.services.iot.model.DescribeThingGroupResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DescribeThingGroupRequest request]
    (-> this (.describeThingGroup request))))

(defn get-registration-code
  "Description copied from interface: AWSIot

  request - The input to the GetRegistrationCode operation. - `com.amazonaws.services.iot.model.GetRegistrationCodeRequest`

  returns: Result of the GetRegistrationCode operation returned by the service. - `com.amazonaws.services.iot.model.GetRegistrationCodeResult`"
  (^com.amazonaws.services.iot.model.GetRegistrationCodeResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.GetRegistrationCodeRequest request]
    (-> this (.getRegistrationCode request))))

(defn delete-account-audit-configuration
  "Description copied from interface: AWSIot

  request - `com.amazonaws.services.iot.model.DeleteAccountAuditConfigurationRequest`

  returns: Result of the DeleteAccountAuditConfiguration operation returned by the service. - `com.amazonaws.services.iot.model.DeleteAccountAuditConfigurationResult`"
  (^com.amazonaws.services.iot.model.DeleteAccountAuditConfigurationResult [^AbstractAWSIot this ^com.amazonaws.services.iot.model.DeleteAccountAuditConfigurationRequest request]
    (-> this (.deleteAccountAuditConfiguration request))))

