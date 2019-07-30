(ns com.amazonaws.services.iot.AWSIot
  "Interface for accessing AWS IoT.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSIot instead.


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
  (:import [com.amazonaws.services.iot AWSIot]))

(defn update-thing-group
  "Update a thing group.

  update-thing-group-request - `com.amazonaws.services.iot.model.UpdateThingGroupRequest`

  returns: Result of the UpdateThingGroup operation returned by the service. - `com.amazonaws.services.iot.model.UpdateThingGroupResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.UpdateThingGroupResult [^AWSIot this ^com.amazonaws.services.iot.model.UpdateThingGroupRequest update-thing-group-request]
    (-> this (.updateThingGroup update-thing-group-request))))

(defn reject-certificate-transfer
  "Rejects a pending certificate transfer. After AWS IoT rejects a certificate transfer, the certificate status
   changes from PENDING_TRANSFER to INACTIVE.


   To check for pending certificate transfers, call ListCertificates to enumerate your certificates.


   This operation can only be called by the transfer destination. After it is called, the certificate will be
   returned to the source's account in the INACTIVE state.

  reject-certificate-transfer-request - The input for the RejectCertificateTransfer operation. - `com.amazonaws.services.iot.model.RejectCertificateTransferRequest`

  returns: Result of the RejectCertificateTransfer operation returned by the service. - `com.amazonaws.services.iot.model.RejectCertificateTransferResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.RejectCertificateTransferResult [^AWSIot this ^com.amazonaws.services.iot.model.RejectCertificateTransferRequest reject-certificate-transfer-request]
    (-> this (.rejectCertificateTransfer reject-certificate-transfer-request))))

(defn update-ca-certificate
  "Updates a registered CA certificate.

  update-ca-certificate-request - The input to the UpdateCACertificate operation. - `com.amazonaws.services.iot.model.UpdateCACertificateRequest`

  returns: Result of the UpdateCACertificate operation returned by the service. - `com.amazonaws.services.iot.model.UpdateCACertificateResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.UpdateCACertificateResult [^AWSIot this ^com.amazonaws.services.iot.model.UpdateCACertificateRequest update-ca-certificate-request]
    (-> this (.updateCACertificate update-ca-certificate-request))))

(defn create-billing-group
  "Creates a billing group.

  create-billing-group-request - `com.amazonaws.services.iot.model.CreateBillingGroupRequest`

  returns: Result of the CreateBillingGroup operation returned by the service. - `com.amazonaws.services.iot.model.CreateBillingGroupResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.CreateBillingGroupResult [^AWSIot this ^com.amazonaws.services.iot.model.CreateBillingGroupRequest create-billing-group-request]
    (-> this (.createBillingGroup create-billing-group-request))))

(defn search-index
  "The query search index.

  search-index-request - `com.amazonaws.services.iot.model.SearchIndexRequest`

  returns: Result of the SearchIndex operation returned by the service. - `com.amazonaws.services.iot.model.SearchIndexResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.SearchIndexResult [^AWSIot this ^com.amazonaws.services.iot.model.SearchIndexRequest search-index-request]
    (-> this (.searchIndex search-index-request))))

(defn delete-thing-type
  "Deletes the specified thing type. You cannot delete a thing type if it has things associated with it. To delete a
   thing type, first mark it as deprecated by calling DeprecateThingType, then remove any associated things
   by calling UpdateThing to change the thing type on any associated thing, and finally use
   DeleteThingType to delete the thing type.

  delete-thing-type-request - The input for the DeleteThingType operation. - `com.amazonaws.services.iot.model.DeleteThingTypeRequest`

  returns: Result of the DeleteThingType operation returned by the service. - `com.amazonaws.services.iot.model.DeleteThingTypeResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.DeleteThingTypeResult [^AWSIot this ^com.amazonaws.services.iot.model.DeleteThingTypeRequest delete-thing-type-request]
    (-> this (.deleteThingType delete-thing-type-request))))

(defn describe-stream
  "Gets information about a stream.

  describe-stream-request - `com.amazonaws.services.iot.model.DescribeStreamRequest`

  returns: Result of the DescribeStream operation returned by the service. - `com.amazonaws.services.iot.model.DescribeStreamResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DescribeStreamResult [^AWSIot this ^com.amazonaws.services.iot.model.DescribeStreamRequest describe-stream-request]
    (-> this (.describeStream describe-stream-request))))

(defn list-tags-for-resource
  "Lists the tags (metadata) you have assigned to the resource.

  list-tags-for-resource-request - `com.amazonaws.services.iot.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.iot.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListTagsForResourceResult [^AWSIot this ^com.amazonaws.services.iot.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn register-certificate
  "Registers a device certificate with AWS IoT. If you have more than one CA certificate that has the same subject
   field, you must specify the CA certificate that was used to sign the device certificate being registered.

  register-certificate-request - The input to the RegisterCertificate operation. - `com.amazonaws.services.iot.model.RegisterCertificateRequest`

  returns: Result of the RegisterCertificate operation returned by the service. - `com.amazonaws.services.iot.model.RegisterCertificateResult`

  throws: com.amazonaws.services.iot.model.CertificateValidationException - The certificate is invalid."
  (^com.amazonaws.services.iot.model.RegisterCertificateResult [^AWSIot this ^com.amazonaws.services.iot.model.RegisterCertificateRequest register-certificate-request]
    (-> this (.registerCertificate register-certificate-request))))

(defn describe-authorizer
  "Describes an authorizer.

  describe-authorizer-request - `com.amazonaws.services.iot.model.DescribeAuthorizerRequest`

  returns: Result of the DescribeAuthorizer operation returned by the service. - `com.amazonaws.services.iot.model.DescribeAuthorizerResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.DescribeAuthorizerResult [^AWSIot this ^com.amazonaws.services.iot.model.DescribeAuthorizerRequest describe-authorizer-request]
    (-> this (.describeAuthorizer describe-authorizer-request))))

(defn list-security-profiles-for-target
  "Lists the Device Defender security profiles attached to a target (thing group).

  list-security-profiles-for-target-request - `com.amazonaws.services.iot.model.ListSecurityProfilesForTargetRequest`

  returns: Result of the ListSecurityProfilesForTarget operation returned by the service. - `com.amazonaws.services.iot.model.ListSecurityProfilesForTargetResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListSecurityProfilesForTargetResult [^AWSIot this ^com.amazonaws.services.iot.model.ListSecurityProfilesForTargetRequest list-security-profiles-for-target-request]
    (-> this (.listSecurityProfilesForTarget list-security-profiles-for-target-request))))

(defn delete-stream
  "Deletes a stream.

  delete-stream-request - `com.amazonaws.services.iot.model.DeleteStreamRequest`

  returns: Result of the DeleteStream operation returned by the service. - `com.amazonaws.services.iot.model.DeleteStreamResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.DeleteStreamResult [^AWSIot this ^com.amazonaws.services.iot.model.DeleteStreamRequest delete-stream-request]
    (-> this (.deleteStream delete-stream-request))))

(defn test-authorization
  "Tests if a specified principal is authorized to perform an AWS IoT action on a specified resource. Use this to
   test and debug the authorization behavior of devices that connect to the AWS IoT device gateway.

  test-authorization-request - `com.amazonaws.services.iot.model.TestAuthorizationRequest`

  returns: Result of the TestAuthorization operation returned by the service. - `com.amazonaws.services.iot.model.TestAuthorizationResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.TestAuthorizationResult [^AWSIot this ^com.amazonaws.services.iot.model.TestAuthorizationRequest test-authorization-request]
    (-> this (.testAuthorization test-authorization-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AWSIot this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn create-ota-update
  "Creates an AWS IoT OTAUpdate on a target group of things or groups.

  create-ota-update-request - `com.amazonaws.services.iot.model.CreateOTAUpdateRequest`

  returns: Result of the CreateOTAUpdate operation returned by the service. - `com.amazonaws.services.iot.model.CreateOTAUpdateResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.CreateOTAUpdateResult [^AWSIot this ^com.amazonaws.services.iot.model.CreateOTAUpdateRequest create-ota-update-request]
    (-> this (.createOTAUpdate create-ota-update-request))))

(defn detach-principal-policy
  "Deprecated.

  detach-principal-policy-request - The input for the DetachPrincipalPolicy operation. - `com.amazonaws.services.iot.model.DetachPrincipalPolicyRequest`

  returns: Result of the DetachPrincipalPolicy operation returned by the service. - `com.amazonaws.services.iot.model.DetachPrincipalPolicyResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.DetachPrincipalPolicyResult [^AWSIot this ^com.amazonaws.services.iot.model.DetachPrincipalPolicyRequest detach-principal-policy-request]
    (-> this (.detachPrincipalPolicy detach-principal-policy-request))))

(defn create-certificate-from-csr
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

  returns: Result of the CreateCertificateFromCsr operation returned by the service. - `com.amazonaws.services.iot.model.CreateCertificateFromCsrResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.CreateCertificateFromCsrResult [^AWSIot this ^com.amazonaws.services.iot.model.CreateCertificateFromCsrRequest create-certificate-from-csr-request]
    (-> this (.createCertificateFromCsr create-certificate-from-csr-request))))

(defn list-audit-tasks
  "Lists the Device Defender audits that have been performed during a given time period.

  list-audit-tasks-request - `com.amazonaws.services.iot.model.ListAuditTasksRequest`

  returns: Result of the ListAuditTasks operation returned by the service. - `com.amazonaws.services.iot.model.ListAuditTasksResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListAuditTasksResult [^AWSIot this ^com.amazonaws.services.iot.model.ListAuditTasksRequest list-audit-tasks-request]
    (-> this (.listAuditTasks list-audit-tasks-request))))

(defn describe-thing-registration-task
  "Describes a bulk thing provisioning task.

  describe-thing-registration-task-request - `com.amazonaws.services.iot.model.DescribeThingRegistrationTaskRequest`

  returns: Result of the DescribeThingRegistrationTask operation returned by the service. - `com.amazonaws.services.iot.model.DescribeThingRegistrationTaskResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DescribeThingRegistrationTaskResult [^AWSIot this ^com.amazonaws.services.iot.model.DescribeThingRegistrationTaskRequest describe-thing-registration-task-request]
    (-> this (.describeThingRegistrationTask describe-thing-registration-task-request))))

(defn list-thing-types
  "Lists the existing thing types.

  list-thing-types-request - The input for the ListThingTypes operation. - `com.amazonaws.services.iot.model.ListThingTypesRequest`

  returns: Result of the ListThingTypes operation returned by the service. - `com.amazonaws.services.iot.model.ListThingTypesResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListThingTypesResult [^AWSIot this ^com.amazonaws.services.iot.model.ListThingTypesRequest list-thing-types-request]
    (-> this (.listThingTypes list-thing-types-request))))

(defn get-ota-update
  "Gets an OTA update.

  get-ota-update-request - `com.amazonaws.services.iot.model.GetOTAUpdateRequest`

  returns: Result of the GetOTAUpdate operation returned by the service. - `com.amazonaws.services.iot.model.GetOTAUpdateResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.GetOTAUpdateResult [^AWSIot this ^com.amazonaws.services.iot.model.GetOTAUpdateRequest get-ota-update-request]
    (-> this (.getOTAUpdate get-ota-update-request))))

(defn update-account-audit-configuration
  "Configures or reconfigures the Device Defender audit settings for this account. Settings include how audit
   notifications are sent and which audit checks are enabled or disabled.

  update-account-audit-configuration-request - `com.amazonaws.services.iot.model.UpdateAccountAuditConfigurationRequest`

  returns: Result of the UpdateAccountAuditConfiguration operation returned by the service. - `com.amazonaws.services.iot.model.UpdateAccountAuditConfigurationResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.UpdateAccountAuditConfigurationResult [^AWSIot this ^com.amazonaws.services.iot.model.UpdateAccountAuditConfigurationRequest update-account-audit-configuration-request]
    (-> this (.updateAccountAuditConfiguration update-account-audit-configuration-request))))

(defn list-v-2-logging-levels
  "Lists logging levels.

  list-v-2-logging-levels-request - `com.amazonaws.services.iot.model.ListV2LoggingLevelsRequest`

  returns: Result of the ListV2LoggingLevels operation returned by the service. - `com.amazonaws.services.iot.model.ListV2LoggingLevelsResult`

  throws: com.amazonaws.services.iot.model.InternalException - An unexpected error has occurred."
  (^com.amazonaws.services.iot.model.ListV2LoggingLevelsResult [^AWSIot this ^com.amazonaws.services.iot.model.ListV2LoggingLevelsRequest list-v-2-logging-levels-request]
    (-> this (.listV2LoggingLevels list-v-2-logging-levels-request))))

(defn update-indexing-configuration
  "Updates the search configuration.

  update-indexing-configuration-request - `com.amazonaws.services.iot.model.UpdateIndexingConfigurationRequest`

  returns: Result of the UpdateIndexingConfiguration operation returned by the service. - `com.amazonaws.services.iot.model.UpdateIndexingConfigurationResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.UpdateIndexingConfigurationResult [^AWSIot this ^com.amazonaws.services.iot.model.UpdateIndexingConfigurationRequest update-indexing-configuration-request]
    (-> this (.updateIndexingConfiguration update-indexing-configuration-request))))

(defn disable-topic-rule
  "Disables the rule.

  disable-topic-rule-request - The input for the DisableTopicRuleRequest operation. - `com.amazonaws.services.iot.model.DisableTopicRuleRequest`

  returns: Result of the DisableTopicRule operation returned by the service. - `com.amazonaws.services.iot.model.DisableTopicRuleResult`

  throws: com.amazonaws.services.iot.model.InternalException - An unexpected error has occurred."
  (^com.amazonaws.services.iot.model.DisableTopicRuleResult [^AWSIot this ^com.amazonaws.services.iot.model.DisableTopicRuleRequest disable-topic-rule-request]
    (-> this (.disableTopicRule disable-topic-rule-request))))

(defn list-active-violations
  "Lists the active violations for a given Device Defender security profile.

  list-active-violations-request - `com.amazonaws.services.iot.model.ListActiveViolationsRequest`

  returns: Result of the ListActiveViolations operation returned by the service. - `com.amazonaws.services.iot.model.ListActiveViolationsResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListActiveViolationsResult [^AWSIot this ^com.amazonaws.services.iot.model.ListActiveViolationsRequest list-active-violations-request]
    (-> this (.listActiveViolations list-active-violations-request))))

(defn describe-job
  "Describes a job.

  describe-job-request - `com.amazonaws.services.iot.model.DescribeJobRequest`

  returns: Result of the DescribeJob operation returned by the service. - `com.amazonaws.services.iot.model.DescribeJobResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DescribeJobResult [^AWSIot this ^com.amazonaws.services.iot.model.DescribeJobRequest describe-job-request]
    (-> this (.describeJob describe-job-request))))

(defn list-certificates
  "Lists the certificates registered in your AWS account.


   The results are paginated with a default page size of 25. You can use the returned marker to retrieve additional
   results.

  list-certificates-request - The input for the ListCertificates operation. - `com.amazonaws.services.iot.model.ListCertificatesRequest`

  returns: Result of the ListCertificates operation returned by the service. - `com.amazonaws.services.iot.model.ListCertificatesResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListCertificatesResult [^AWSIot this ^com.amazonaws.services.iot.model.ListCertificatesRequest list-certificates-request]
    (-> this (.listCertificates list-certificates-request))))

(defn set-v-2-logging-level
  "Sets the logging level.

  set-v-2-logging-level-request - `com.amazonaws.services.iot.model.SetV2LoggingLevelRequest`

  returns: Result of the SetV2LoggingLevel operation returned by the service. - `com.amazonaws.services.iot.model.SetV2LoggingLevelResult`

  throws: com.amazonaws.services.iot.model.InternalException - An unexpected error has occurred."
  (^com.amazonaws.services.iot.model.SetV2LoggingLevelResult [^AWSIot this ^com.amazonaws.services.iot.model.SetV2LoggingLevelRequest set-v-2-logging-level-request]
    (-> this (.setV2LoggingLevel set-v-2-logging-level-request))))

(defn register-thing
  "Provisions a thing.

  register-thing-request - `com.amazonaws.services.iot.model.RegisterThingRequest`

  returns: Result of the RegisterThing operation returned by the service. - `com.amazonaws.services.iot.model.RegisterThingResult`

  throws: com.amazonaws.services.iot.model.InternalFailureException - An unexpected error has occurred."
  (^com.amazonaws.services.iot.model.RegisterThingResult [^AWSIot this ^com.amazonaws.services.iot.model.RegisterThingRequest register-thing-request]
    (-> this (.registerThing register-thing-request))))

(defn list-certificates-by-ca
  "List the device certificates signed by the specified CA certificate.

  list-certificates-by-ca-request - The input to the ListCertificatesByCA operation. - `com.amazonaws.services.iot.model.ListCertificatesByCARequest`

  returns: Result of the ListCertificatesByCA operation returned by the service. - `com.amazonaws.services.iot.model.ListCertificatesByCAResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListCertificatesByCAResult [^AWSIot this ^com.amazonaws.services.iot.model.ListCertificatesByCARequest list-certificates-by-ca-request]
    (-> this (.listCertificatesByCA list-certificates-by-ca-request))))

(defn set-default-policy-version
  "Sets the specified version of the specified policy as the policy's default (operative) version. This action
   affects all certificates to which the policy is attached. To list the principals the policy is attached to, use
   the ListPrincipalPolicy API.

  set-default-policy-version-request - The input for the SetDefaultPolicyVersion operation. - `com.amazonaws.services.iot.model.SetDefaultPolicyVersionRequest`

  returns: Result of the SetDefaultPolicyVersion operation returned by the service. - `com.amazonaws.services.iot.model.SetDefaultPolicyVersionResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.SetDefaultPolicyVersionResult [^AWSIot this ^com.amazonaws.services.iot.model.SetDefaultPolicyVersionRequest set-default-policy-version-request]
    (-> this (.setDefaultPolicyVersion set-default-policy-version-request))))

(defn create-security-profile
  "Creates a Device Defender security profile.

  create-security-profile-request - `com.amazonaws.services.iot.model.CreateSecurityProfileRequest`

  returns: Result of the CreateSecurityProfile operation returned by the service. - `com.amazonaws.services.iot.model.CreateSecurityProfileResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.CreateSecurityProfileResult [^AWSIot this ^com.amazonaws.services.iot.model.CreateSecurityProfileRequest create-security-profile-request]
    (-> this (.createSecurityProfile create-security-profile-request))))

(defn create-topic-rule
  "Creates a rule. Creating rules is an administrator-level action. Any user who has permission to create rules will
   be able to access data processed by the rule.

  create-topic-rule-request - The input for the CreateTopicRule operation. - `com.amazonaws.services.iot.model.CreateTopicRuleRequest`

  returns: Result of the CreateTopicRule operation returned by the service. - `com.amazonaws.services.iot.model.CreateTopicRuleResult`

  throws: com.amazonaws.services.iot.model.SqlParseException - The Rule-SQL expression can't be parsed correctly."
  (^com.amazonaws.services.iot.model.CreateTopicRuleResult [^AWSIot this ^com.amazonaws.services.iot.model.CreateTopicRuleRequest create-topic-rule-request]
    (-> this (.createTopicRule create-topic-rule-request))))

(defn untag-resource
  "Removes the given tags (metadata) from the resource.

  untag-resource-request - `com.amazonaws.services.iot.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.iot.model.UntagResourceResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.UntagResourceResult [^AWSIot this ^com.amazonaws.services.iot.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResource untag-resource-request))))

(defn list-attached-policies
  "Lists the policies attached to the specified thing group.

  list-attached-policies-request - `com.amazonaws.services.iot.model.ListAttachedPoliciesRequest`

  returns: Result of the ListAttachedPolicies operation returned by the service. - `com.amazonaws.services.iot.model.ListAttachedPoliciesResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.ListAttachedPoliciesResult [^AWSIot this ^com.amazonaws.services.iot.model.ListAttachedPoliciesRequest list-attached-policies-request]
    (-> this (.listAttachedPolicies list-attached-policies-request))))

(defn update-authorizer
  "Updates an authorizer.

  update-authorizer-request - `com.amazonaws.services.iot.model.UpdateAuthorizerRequest`

  returns: Result of the UpdateAuthorizer operation returned by the service. - `com.amazonaws.services.iot.model.UpdateAuthorizerResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.UpdateAuthorizerResult [^AWSIot this ^com.amazonaws.services.iot.model.UpdateAuthorizerRequest update-authorizer-request]
    (-> this (.updateAuthorizer update-authorizer-request))))

(defn delete-ca-certificate
  "Deletes a registered CA certificate.

  delete-ca-certificate-request - Input for the DeleteCACertificate operation. - `com.amazonaws.services.iot.model.DeleteCACertificateRequest`

  returns: Result of the DeleteCACertificate operation returned by the service. - `com.amazonaws.services.iot.model.DeleteCACertificateResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DeleteCACertificateResult [^AWSIot this ^com.amazonaws.services.iot.model.DeleteCACertificateRequest delete-ca-certificate-request]
    (-> this (.deleteCACertificate delete-ca-certificate-request))))

(defn create-keys-and-certificate
  "Creates a 2048-bit RSA key pair and issues an X.509 certificate using the issued public key.


   Note This is the only time AWS IoT issues the private key for this certificate, so it is important to keep
   it in a secure location.

  create-keys-and-certificate-request - The input for the CreateKeysAndCertificate operation. - `com.amazonaws.services.iot.model.CreateKeysAndCertificateRequest`

  returns: Result of the CreateKeysAndCertificate operation returned by the service. - `com.amazonaws.services.iot.model.CreateKeysAndCertificateResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.CreateKeysAndCertificateResult [^AWSIot this ^com.amazonaws.services.iot.model.CreateKeysAndCertificateRequest create-keys-and-certificate-request]
    (-> this (.createKeysAndCertificate create-keys-and-certificate-request))))

(defn cancel-certificate-transfer
  "Cancels a pending transfer for the specified certificate.


   Note Only the transfer source account can use this operation to cancel a transfer. (Transfer destinations
   can use RejectCertificateTransfer instead.) After transfer, AWS IoT returns the certificate to the source
   account in the INACTIVE state. After the destination account has accepted the transfer, the transfer cannot be
   cancelled.


   After a certificate transfer is cancelled, the status of the certificate changes from PENDING_TRANSFER to
   INACTIVE.

  cancel-certificate-transfer-request - The input for the CancelCertificateTransfer operation. - `com.amazonaws.services.iot.model.CancelCertificateTransferRequest`

  returns: Result of the CancelCertificateTransfer operation returned by the service. - `com.amazonaws.services.iot.model.CancelCertificateTransferResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.CancelCertificateTransferResult [^AWSIot this ^com.amazonaws.services.iot.model.CancelCertificateTransferRequest cancel-certificate-transfer-request]
    (-> this (.cancelCertificateTransfer cancel-certificate-transfer-request))))

(defn create-dynamic-thing-group
  "Creates a dynamic thing group.

  create-dynamic-thing-group-request - `com.amazonaws.services.iot.model.CreateDynamicThingGroupRequest`

  returns: Result of the CreateDynamicThingGroup operation returned by the service. - `com.amazonaws.services.iot.model.CreateDynamicThingGroupResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.CreateDynamicThingGroupResult [^AWSIot this ^com.amazonaws.services.iot.model.CreateDynamicThingGroupRequest create-dynamic-thing-group-request]
    (-> this (.createDynamicThingGroup create-dynamic-thing-group-request))))

(defn delete-job-execution
  "Deletes a job execution.

  delete-job-execution-request - `com.amazonaws.services.iot.model.DeleteJobExecutionRequest`

  returns: Result of the DeleteJobExecution operation returned by the service. - `com.amazonaws.services.iot.model.DeleteJobExecutionResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DeleteJobExecutionResult [^AWSIot this ^com.amazonaws.services.iot.model.DeleteJobExecutionRequest delete-job-execution-request]
    (-> this (.deleteJobExecution delete-job-execution-request))))

(defn update-event-configurations
  "Updates the event configurations.

  update-event-configurations-request - `com.amazonaws.services.iot.model.UpdateEventConfigurationsRequest`

  returns: Result of the UpdateEventConfigurations operation returned by the service. - `com.amazonaws.services.iot.model.UpdateEventConfigurationsResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.UpdateEventConfigurationsResult [^AWSIot this ^com.amazonaws.services.iot.model.UpdateEventConfigurationsRequest update-event-configurations-request]
    (-> this (.updateEventConfigurations update-event-configurations-request))))

(defn update-job
  "Updates supported fields of the specified job.

  update-job-request - `com.amazonaws.services.iot.model.UpdateJobRequest`

  returns: Result of the UpdateJob operation returned by the service. - `com.amazonaws.services.iot.model.UpdateJobResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.UpdateJobResult [^AWSIot this ^com.amazonaws.services.iot.model.UpdateJobRequest update-job-request]
    (-> this (.updateJob update-job-request))))

(defn cancel-audit-task
  "Cancels an audit that is in progress. The audit can be either scheduled or on-demand. If the audit is not in
   progress, an \"InvalidRequestException\" occurs.

  cancel-audit-task-request - `com.amazonaws.services.iot.model.CancelAuditTaskRequest`

  returns: Result of the CancelAuditTask operation returned by the service. - `com.amazonaws.services.iot.model.CancelAuditTaskResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.CancelAuditTaskResult [^AWSIot this ^com.amazonaws.services.iot.model.CancelAuditTaskRequest cancel-audit-task-request]
    (-> this (.cancelAuditTask cancel-audit-task-request))))

(defn update-role-alias
  "Updates a role alias.

  update-role-alias-request - `com.amazonaws.services.iot.model.UpdateRoleAliasRequest`

  returns: Result of the UpdateRoleAlias operation returned by the service. - `com.amazonaws.services.iot.model.UpdateRoleAliasResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.UpdateRoleAliasResult [^AWSIot this ^com.amazonaws.services.iot.model.UpdateRoleAliasRequest update-role-alias-request]
    (-> this (.updateRoleAlias update-role-alias-request))))

(defn create-scheduled-audit
  "Creates a scheduled audit that is run at a specified time interval.

  create-scheduled-audit-request - `com.amazonaws.services.iot.model.CreateScheduledAuditRequest`

  returns: Result of the CreateScheduledAudit operation returned by the service. - `com.amazonaws.services.iot.model.CreateScheduledAuditResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.CreateScheduledAuditResult [^AWSIot this ^com.amazonaws.services.iot.model.CreateScheduledAuditRequest create-scheduled-audit-request]
    (-> this (.createScheduledAudit create-scheduled-audit-request))))

(defn deprecate-thing-type
  "Deprecates a thing type. You can not associate new things with deprecated thing type.

  deprecate-thing-type-request - The input for the DeprecateThingType operation. - `com.amazonaws.services.iot.model.DeprecateThingTypeRequest`

  returns: Result of the DeprecateThingType operation returned by the service. - `com.amazonaws.services.iot.model.DeprecateThingTypeResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.DeprecateThingTypeResult [^AWSIot this ^com.amazonaws.services.iot.model.DeprecateThingTypeRequest deprecate-thing-type-request]
    (-> this (.deprecateThingType deprecate-thing-type-request))))

(defn describe-default-authorizer
  "Describes the default authorizer.

  describe-default-authorizer-request - `com.amazonaws.services.iot.model.DescribeDefaultAuthorizerRequest`

  returns: Result of the DescribeDefaultAuthorizer operation returned by the service. - `com.amazonaws.services.iot.model.DescribeDefaultAuthorizerResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.DescribeDefaultAuthorizerResult [^AWSIot this ^com.amazonaws.services.iot.model.DescribeDefaultAuthorizerRequest describe-default-authorizer-request]
    (-> this (.describeDefaultAuthorizer describe-default-authorizer-request))))

(defn delete-registration-code
  "Deletes a CA certificate registration code.

  delete-registration-code-request - The input for the DeleteRegistrationCode operation. - `com.amazonaws.services.iot.model.DeleteRegistrationCodeRequest`

  returns: Result of the DeleteRegistrationCode operation returned by the service. - `com.amazonaws.services.iot.model.DeleteRegistrationCodeResult`

  throws: com.amazonaws.services.iot.model.ThrottlingException - The rate exceeds the limit."
  (^com.amazonaws.services.iot.model.DeleteRegistrationCodeResult [^AWSIot this ^com.amazonaws.services.iot.model.DeleteRegistrationCodeRequest delete-registration-code-request]
    (-> this (.deleteRegistrationCode delete-registration-code-request))))

(defn delete-job
  "Deletes a job and its related job executions.


   Deleting a job may take time, depending on the number of job executions created for the job and various other
   factors. While the job is being deleted, the status of the job will be shown as \"DELETION_IN_PROGRESS\".
   Attempting to delete or cancel a job whose status is already \"DELETION_IN_PROGRESS\" will result in an error.


   Only 10 jobs may have status \"DELETION_IN_PROGRESS\" at the same time, or a LimitExceededException will occur.

  delete-job-request - `com.amazonaws.services.iot.model.DeleteJobRequest`

  returns: Result of the DeleteJob operation returned by the service. - `com.amazonaws.services.iot.model.DeleteJobResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DeleteJobResult [^AWSIot this ^com.amazonaws.services.iot.model.DeleteJobRequest delete-job-request]
    (-> this (.deleteJob delete-job-request))))

(defn list-targets-for-policy
  "List targets for the specified policy.

  list-targets-for-policy-request - `com.amazonaws.services.iot.model.ListTargetsForPolicyRequest`

  returns: Result of the ListTargetsForPolicy operation returned by the service. - `com.amazonaws.services.iot.model.ListTargetsForPolicyResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.ListTargetsForPolicyResult [^AWSIot this ^com.amazonaws.services.iot.model.ListTargetsForPolicyRequest list-targets-for-policy-request]
    (-> this (.listTargetsForPolicy list-targets-for-policy-request))))

(defn list-thing-groups-for-thing
  "List the thing groups to which the specified thing belongs.

  list-thing-groups-for-thing-request - `com.amazonaws.services.iot.model.ListThingGroupsForThingRequest`

  returns: Result of the ListThingGroupsForThing operation returned by the service. - `com.amazonaws.services.iot.model.ListThingGroupsForThingResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListThingGroupsForThingResult [^AWSIot this ^com.amazonaws.services.iot.model.ListThingGroupsForThingRequest list-thing-groups-for-thing-request]
    (-> this (.listThingGroupsForThing list-thing-groups-for-thing-request))))

(defn delete-role-alias
  "Deletes a role alias

  delete-role-alias-request - `com.amazonaws.services.iot.model.DeleteRoleAliasRequest`

  returns: Result of the DeleteRoleAlias operation returned by the service. - `com.amazonaws.services.iot.model.DeleteRoleAliasResult`

  throws: com.amazonaws.services.iot.model.DeleteConflictException - You can't delete the resource because it is attached to one or more resources."
  (^com.amazonaws.services.iot.model.DeleteRoleAliasResult [^AWSIot this ^com.amazonaws.services.iot.model.DeleteRoleAliasRequest delete-role-alias-request]
    (-> this (.deleteRoleAlias delete-role-alias-request))))

(defn set-logging-options
  "Sets the logging options.


   NOTE: use of this command is not recommended. Use SetV2LoggingOptions instead.

  set-logging-options-request - The input for the SetLoggingOptions operation. - `com.amazonaws.services.iot.model.SetLoggingOptionsRequest`

  returns: Result of the SetLoggingOptions operation returned by the service. - `com.amazonaws.services.iot.model.SetLoggingOptionsResult`

  throws: com.amazonaws.services.iot.model.InternalException - An unexpected error has occurred."
  (^com.amazonaws.services.iot.model.SetLoggingOptionsResult [^AWSIot this ^com.amazonaws.services.iot.model.SetLoggingOptionsRequest set-logging-options-request]
    (-> this (.setLoggingOptions set-logging-options-request))))

(defn list-job-executions-for-job
  "Lists the job executions for a job.

  list-job-executions-for-job-request - `com.amazonaws.services.iot.model.ListJobExecutionsForJobRequest`

  returns: Result of the ListJobExecutionsForJob operation returned by the service. - `com.amazonaws.services.iot.model.ListJobExecutionsForJobResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListJobExecutionsForJobResult [^AWSIot this ^com.amazonaws.services.iot.model.ListJobExecutionsForJobRequest list-job-executions-for-job-request]
    (-> this (.listJobExecutionsForJob list-job-executions-for-job-request))))

(defn update-thing
  "Updates the data for a thing.

  update-thing-request - The input for the UpdateThing operation. - `com.amazonaws.services.iot.model.UpdateThingRequest`

  returns: Result of the UpdateThing operation returned by the service. - `com.amazonaws.services.iot.model.UpdateThingResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.UpdateThingResult [^AWSIot this ^com.amazonaws.services.iot.model.UpdateThingRequest update-thing-request]
    (-> this (.updateThing update-thing-request))))

(defn describe-thing-type
  "Gets information about the specified thing type.

  describe-thing-type-request - The input for the DescribeThingType operation. - `com.amazonaws.services.iot.model.DescribeThingTypeRequest`

  returns: Result of the DescribeThingType operation returned by the service. - `com.amazonaws.services.iot.model.DescribeThingTypeResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.DescribeThingTypeResult [^AWSIot this ^com.amazonaws.services.iot.model.DescribeThingTypeRequest describe-thing-type-request]
    (-> this (.describeThingType describe-thing-type-request))))

(defn delete-ota-update
  "Delete an OTA update.

  delete-ota-update-request - `com.amazonaws.services.iot.model.DeleteOTAUpdateRequest`

  returns: Result of the DeleteOTAUpdate operation returned by the service. - `com.amazonaws.services.iot.model.DeleteOTAUpdateResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DeleteOTAUpdateResult [^AWSIot this ^com.amazonaws.services.iot.model.DeleteOTAUpdateRequest delete-ota-update-request]
    (-> this (.deleteOTAUpdate delete-ota-update-request))))

(defn list-things-in-billing-group
  "Lists the things you have added to the given billing group.

  list-things-in-billing-group-request - `com.amazonaws.services.iot.model.ListThingsInBillingGroupRequest`

  returns: Result of the ListThingsInBillingGroup operation returned by the service. - `com.amazonaws.services.iot.model.ListThingsInBillingGroupResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListThingsInBillingGroupResult [^AWSIot this ^com.amazonaws.services.iot.model.ListThingsInBillingGroupRequest list-things-in-billing-group-request]
    (-> this (.listThingsInBillingGroup list-things-in-billing-group-request))))

(defn update-security-profile
  "Updates a Device Defender security profile.

  update-security-profile-request - `com.amazonaws.services.iot.model.UpdateSecurityProfileRequest`

  returns: Result of the UpdateSecurityProfile operation returned by the service. - `com.amazonaws.services.iot.model.UpdateSecurityProfileResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.UpdateSecurityProfileResult [^AWSIot this ^com.amazonaws.services.iot.model.UpdateSecurityProfileRequest update-security-profile-request]
    (-> this (.updateSecurityProfile update-security-profile-request))))

(defn create-policy-version
  "Creates a new version of the specified AWS IoT policy. To update a policy, create a new policy version. A managed
   policy can have up to five versions. If the policy has five versions, you must use DeletePolicyVersion to
   delete an existing version before you create a new one.


   Optionally, you can set the new version as the policy's default version. The default version is the operative
   version (that is, the version that is in effect for the certificates to which the policy is attached).

  create-policy-version-request - The input for the CreatePolicyVersion operation. - `com.amazonaws.services.iot.model.CreatePolicyVersionRequest`

  returns: Result of the CreatePolicyVersion operation returned by the service. - `com.amazonaws.services.iot.model.CreatePolicyVersionResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.CreatePolicyVersionResult [^AWSIot this ^com.amazonaws.services.iot.model.CreatePolicyVersionRequest create-policy-version-request]
    (-> this (.createPolicyVersion create-policy-version-request))))

(defn set-default-authorizer
  "Sets the default authorizer. This will be used if a websocket connection is made without specifying an
   authorizer.

  set-default-authorizer-request - `com.amazonaws.services.iot.model.SetDefaultAuthorizerRequest`

  returns: Result of the SetDefaultAuthorizer operation returned by the service. - `com.amazonaws.services.iot.model.SetDefaultAuthorizerResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.SetDefaultAuthorizerResult [^AWSIot this ^com.amazonaws.services.iot.model.SetDefaultAuthorizerRequest set-default-authorizer-request]
    (-> this (.setDefaultAuthorizer set-default-authorizer-request))))

(defn list-principal-things
  "Lists the things associated with the specified principal. A principal can be X.509 certificates, IAM users,
   groups, and roles, Amazon Cognito identities or federated identities.

  list-principal-things-request - The input for the ListPrincipalThings operation. - `com.amazonaws.services.iot.model.ListPrincipalThingsRequest`

  returns: Result of the ListPrincipalThings operation returned by the service. - `com.amazonaws.services.iot.model.ListPrincipalThingsResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListPrincipalThingsResult [^AWSIot this ^com.amazonaws.services.iot.model.ListPrincipalThingsRequest list-principal-things-request]
    (-> this (.listPrincipalThings list-principal-things-request))))

(defn add-thing-to-billing-group
  "Adds a thing to a billing group.

  add-thing-to-billing-group-request - `com.amazonaws.services.iot.model.AddThingToBillingGroupRequest`

  returns: Result of the AddThingToBillingGroup operation returned by the service. - `com.amazonaws.services.iot.model.AddThingToBillingGroupResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.AddThingToBillingGroupResult [^AWSIot this ^com.amazonaws.services.iot.model.AddThingToBillingGroupRequest add-thing-to-billing-group-request]
    (-> this (.addThingToBillingGroup add-thing-to-billing-group-request))))

(defn list-security-profiles
  "Lists the Device Defender security profiles you have created. You can use filters to list only those security
   profiles associated with a thing group or only those associated with your account.

  list-security-profiles-request - `com.amazonaws.services.iot.model.ListSecurityProfilesRequest`

  returns: Result of the ListSecurityProfiles operation returned by the service. - `com.amazonaws.services.iot.model.ListSecurityProfilesResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListSecurityProfilesResult [^AWSIot this ^com.amazonaws.services.iot.model.ListSecurityProfilesRequest list-security-profiles-request]
    (-> this (.listSecurityProfiles list-security-profiles-request))))

(defn delete-policy-version
  "Deletes the specified version of the specified policy. You cannot delete the default version of a policy using
   this API. To delete the default version of a policy, use DeletePolicy. To find out which version of a
   policy is marked as the default version, use ListPolicyVersions.

  delete-policy-version-request - The input for the DeletePolicyVersion operation. - `com.amazonaws.services.iot.model.DeletePolicyVersionRequest`

  returns: Result of the DeletePolicyVersion operation returned by the service. - `com.amazonaws.services.iot.model.DeletePolicyVersionResult`

  throws: com.amazonaws.services.iot.model.DeleteConflictException - You can't delete the resource because it is attached to one or more resources."
  (^com.amazonaws.services.iot.model.DeletePolicyVersionResult [^AWSIot this ^com.amazonaws.services.iot.model.DeletePolicyVersionRequest delete-policy-version-request]
    (-> this (.deletePolicyVersion delete-policy-version-request))))

(defn start-on-demand-audit-task
  "Starts an on-demand Device Defender audit.

  start-on-demand-audit-task-request - `com.amazonaws.services.iot.model.StartOnDemandAuditTaskRequest`

  returns: Result of the StartOnDemandAuditTask operation returned by the service. - `com.amazonaws.services.iot.model.StartOnDemandAuditTaskResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.StartOnDemandAuditTaskResult [^AWSIot this ^com.amazonaws.services.iot.model.StartOnDemandAuditTaskRequest start-on-demand-audit-task-request]
    (-> this (.startOnDemandAuditTask start-on-demand-audit-task-request))))

(defn update-dynamic-thing-group
  "Updates a dynamic thing group.

  update-dynamic-thing-group-request - `com.amazonaws.services.iot.model.UpdateDynamicThingGroupRequest`

  returns: Result of the UpdateDynamicThingGroup operation returned by the service. - `com.amazonaws.services.iot.model.UpdateDynamicThingGroupResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.UpdateDynamicThingGroupResult [^AWSIot this ^com.amazonaws.services.iot.model.UpdateDynamicThingGroupRequest update-dynamic-thing-group-request]
    (-> this (.updateDynamicThingGroup update-dynamic-thing-group-request))))

(defn list-outgoing-certificates
  "Lists certificates that are being transferred but not yet accepted.

  list-outgoing-certificates-request - The input to the ListOutgoingCertificates operation. - `com.amazonaws.services.iot.model.ListOutgoingCertificatesRequest`

  returns: Result of the ListOutgoingCertificates operation returned by the service. - `com.amazonaws.services.iot.model.ListOutgoingCertificatesResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListOutgoingCertificatesResult [^AWSIot this ^com.amazonaws.services.iot.model.ListOutgoingCertificatesRequest list-outgoing-certificates-request]
    (-> this (.listOutgoingCertificates list-outgoing-certificates-request))))

(defn delete-policy
  "Deletes the specified policy.


   A policy cannot be deleted if it has non-default versions or it is attached to any certificate.


   To delete a policy, use the DeletePolicyVersion API to delete all non-default versions of the policy; use the
   DetachPrincipalPolicy API to detach the policy from any certificate; and then use the DeletePolicy API to delete
   the policy.


   When a policy is deleted using DeletePolicy, its default version is deleted with it.

  delete-policy-request - The input for the DeletePolicy operation. - `com.amazonaws.services.iot.model.DeletePolicyRequest`

  returns: Result of the DeletePolicy operation returned by the service. - `com.amazonaws.services.iot.model.DeletePolicyResult`

  throws: com.amazonaws.services.iot.model.DeleteConflictException - You can't delete the resource because it is attached to one or more resources."
  (^com.amazonaws.services.iot.model.DeletePolicyResult [^AWSIot this ^com.amazonaws.services.iot.model.DeletePolicyRequest delete-policy-request]
    (-> this (.deletePolicy delete-policy-request))))

(defn replace-topic-rule
  "Replaces the rule. You must specify all parameters for the new rule. Creating rules is an administrator-level
   action. Any user who has permission to create rules will be able to access data processed by the rule.

  replace-topic-rule-request - The input for the ReplaceTopicRule operation. - `com.amazonaws.services.iot.model.ReplaceTopicRuleRequest`

  returns: Result of the ReplaceTopicRule operation returned by the service. - `com.amazonaws.services.iot.model.ReplaceTopicRuleResult`

  throws: com.amazonaws.services.iot.model.SqlParseException - The Rule-SQL expression can't be parsed correctly."
  (^com.amazonaws.services.iot.model.ReplaceTopicRuleResult [^AWSIot this ^com.amazonaws.services.iot.model.ReplaceTopicRuleRequest replace-topic-rule-request]
    (-> this (.replaceTopicRule replace-topic-rule-request))))

(defn describe-audit-task
  "Gets information about a Device Defender audit.

  describe-audit-task-request - `com.amazonaws.services.iot.model.DescribeAuditTaskRequest`

  returns: Result of the DescribeAuditTask operation returned by the service. - `com.amazonaws.services.iot.model.DescribeAuditTaskResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DescribeAuditTaskResult [^AWSIot this ^com.amazonaws.services.iot.model.DescribeAuditTaskRequest describe-audit-task-request]
    (-> this (.describeAuditTask describe-audit-task-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSIot this]
    (-> this (.shutdown))))

(defn attach-policy
  "Attaches a policy to the specified target.

  attach-policy-request - `com.amazonaws.services.iot.model.AttachPolicyRequest`

  returns: Result of the AttachPolicy operation returned by the service. - `com.amazonaws.services.iot.model.AttachPolicyResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.AttachPolicyResult [^AWSIot this ^com.amazonaws.services.iot.model.AttachPolicyRequest attach-policy-request]
    (-> this (.attachPolicy attach-policy-request))))

(defn list-thing-groups
  "List the thing groups in your account.

  list-thing-groups-request - `com.amazonaws.services.iot.model.ListThingGroupsRequest`

  returns: Result of the ListThingGroups operation returned by the service. - `com.amazonaws.services.iot.model.ListThingGroupsResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListThingGroupsResult [^AWSIot this ^com.amazonaws.services.iot.model.ListThingGroupsRequest list-thing-groups-request]
    (-> this (.listThingGroups list-thing-groups-request))))

(defn stop-thing-registration-task
  "Cancels a bulk thing provisioning task.

  stop-thing-registration-task-request - `com.amazonaws.services.iot.model.StopThingRegistrationTaskRequest`

  returns: Result of the StopThingRegistrationTask operation returned by the service. - `com.amazonaws.services.iot.model.StopThingRegistrationTaskResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.StopThingRegistrationTaskResult [^AWSIot this ^com.amazonaws.services.iot.model.StopThingRegistrationTaskRequest stop-thing-registration-task-request]
    (-> this (.stopThingRegistrationTask stop-thing-registration-task-request))))

(defn validate-security-profile-behaviors
  "Validates a Device Defender security profile behaviors specification.

  validate-security-profile-behaviors-request - `com.amazonaws.services.iot.model.ValidateSecurityProfileBehaviorsRequest`

  returns: Result of the ValidateSecurityProfileBehaviors operation returned by the service. - `com.amazonaws.services.iot.model.ValidateSecurityProfileBehaviorsResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ValidateSecurityProfileBehaviorsResult [^AWSIot this ^com.amazonaws.services.iot.model.ValidateSecurityProfileBehaviorsRequest validate-security-profile-behaviors-request]
    (-> this (.validateSecurityProfileBehaviors validate-security-profile-behaviors-request))))

(defn describe-event-configurations
  "Describes event configurations.

  describe-event-configurations-request - `com.amazonaws.services.iot.model.DescribeEventConfigurationsRequest`

  returns: Result of the DescribeEventConfigurations operation returned by the service. - `com.amazonaws.services.iot.model.DescribeEventConfigurationsResult`

  throws: com.amazonaws.services.iot.model.InternalFailureException - An unexpected error has occurred."
  (^com.amazonaws.services.iot.model.DescribeEventConfigurationsResult [^AWSIot this ^com.amazonaws.services.iot.model.DescribeEventConfigurationsRequest describe-event-configurations-request]
    (-> this (.describeEventConfigurations describe-event-configurations-request))))

(defn list-streams
  "Lists all of the streams in your AWS account.

  list-streams-request - `com.amazonaws.services.iot.model.ListStreamsRequest`

  returns: Result of the ListStreams operation returned by the service. - `com.amazonaws.services.iot.model.ListStreamsResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListStreamsResult [^AWSIot this ^com.amazonaws.services.iot.model.ListStreamsRequest list-streams-request]
    (-> this (.listStreams list-streams-request))))

(defn describe-ca-certificate
  "Describes a registered CA certificate.

  describe-ca-certificate-request - The input for the DescribeCACertificate operation. - `com.amazonaws.services.iot.model.DescribeCACertificateRequest`

  returns: Result of the DescribeCACertificate operation returned by the service. - `com.amazonaws.services.iot.model.DescribeCACertificateResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DescribeCACertificateResult [^AWSIot this ^com.amazonaws.services.iot.model.DescribeCACertificateRequest describe-ca-certificate-request]
    (-> this (.describeCACertificate describe-ca-certificate-request))))

(defn test-invoke-authorizer
  "Tests a custom authorization behavior by invoking a specified custom authorizer. Use this to test and debug the
   custom authorization behavior of devices that connect to the AWS IoT device gateway.

  test-invoke-authorizer-request - `com.amazonaws.services.iot.model.TestInvokeAuthorizerRequest`

  returns: Result of the TestInvokeAuthorizer operation returned by the service. - `com.amazonaws.services.iot.model.TestInvokeAuthorizerResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.TestInvokeAuthorizerResult [^AWSIot this ^com.amazonaws.services.iot.model.TestInvokeAuthorizerRequest test-invoke-authorizer-request]
    (-> this (.testInvokeAuthorizer test-invoke-authorizer-request))))

(defn describe-certificate
  "Gets information about the specified certificate.

  describe-certificate-request - The input for the DescribeCertificate operation. - `com.amazonaws.services.iot.model.DescribeCertificateRequest`

  returns: Result of the DescribeCertificate operation returned by the service. - `com.amazonaws.services.iot.model.DescribeCertificateResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DescribeCertificateResult [^AWSIot this ^com.amazonaws.services.iot.model.DescribeCertificateRequest describe-certificate-request]
    (-> this (.describeCertificate describe-certificate-request))))

(defn delete-thing
  "Deletes the specified thing. Returns successfully with no error if the deletion is successful or you specify a
   thing that doesn't exist.

  delete-thing-request - The input for the DeleteThing operation. - `com.amazonaws.services.iot.model.DeleteThingRequest`

  returns: Result of the DeleteThing operation returned by the service. - `com.amazonaws.services.iot.model.DeleteThingResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.DeleteThingResult [^AWSIot this ^com.amazonaws.services.iot.model.DeleteThingRequest delete-thing-request]
    (-> this (.deleteThing delete-thing-request))))

(defn list-thing-principals
  "Lists the principals associated with the specified thing. A principal can be X.509 certificates, IAM users,
   groups, and roles, Amazon Cognito identities or federated identities.

  list-thing-principals-request - The input for the ListThingPrincipal operation. - `com.amazonaws.services.iot.model.ListThingPrincipalsRequest`

  returns: Result of the ListThingPrincipals operation returned by the service. - `com.amazonaws.services.iot.model.ListThingPrincipalsResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListThingPrincipalsResult [^AWSIot this ^com.amazonaws.services.iot.model.ListThingPrincipalsRequest list-thing-principals-request]
    (-> this (.listThingPrincipals list-thing-principals-request))))

(defn describe-endpoint
  "Returns a unique endpoint specific to the AWS account making the call.

  describe-endpoint-request - The input for the DescribeEndpoint operation. - `com.amazonaws.services.iot.model.DescribeEndpointRequest`

  returns: Result of the DescribeEndpoint operation returned by the service. - `com.amazonaws.services.iot.model.DescribeEndpointResult`

  throws: com.amazonaws.services.iot.model.InternalFailureException - An unexpected error has occurred."
  (^com.amazonaws.services.iot.model.DescribeEndpointResult [^AWSIot this ^com.amazonaws.services.iot.model.DescribeEndpointRequest describe-endpoint-request]
    (-> this (.describeEndpoint describe-endpoint-request))))

(defn describe-thing
  "Gets information about the specified thing.

  describe-thing-request - The input for the DescribeThing operation. - `com.amazonaws.services.iot.model.DescribeThingRequest`

  returns: Result of the DescribeThing operation returned by the service. - `com.amazonaws.services.iot.model.DescribeThingResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.DescribeThingResult [^AWSIot this ^com.amazonaws.services.iot.model.DescribeThingRequest describe-thing-request]
    (-> this (.describeThing describe-thing-request))))

(defn list-ca-certificates
  "Lists the CA certificates registered for your AWS account.


   The results are paginated with a default page size of 25. You can use the returned marker to retrieve additional
   results.

  list-ca-certificates-request - Input for the ListCACertificates operation. - `com.amazonaws.services.iot.model.ListCACertificatesRequest`

  returns: Result of the ListCACertificates operation returned by the service. - `com.amazonaws.services.iot.model.ListCACertificatesResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListCACertificatesResult [^AWSIot this ^com.amazonaws.services.iot.model.ListCACertificatesRequest list-ca-certificates-request]
    (-> this (.listCACertificates list-ca-certificates-request))))

(defn delete-dynamic-thing-group
  "Deletes a dynamic thing group.

  delete-dynamic-thing-group-request - `com.amazonaws.services.iot.model.DeleteDynamicThingGroupRequest`

  returns: Result of the DeleteDynamicThingGroup operation returned by the service. - `com.amazonaws.services.iot.model.DeleteDynamicThingGroupResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DeleteDynamicThingGroupResult [^AWSIot this ^com.amazonaws.services.iot.model.DeleteDynamicThingGroupRequest delete-dynamic-thing-group-request]
    (-> this (.deleteDynamicThingGroup delete-dynamic-thing-group-request))))

(defn list-things
  "Lists your things. Use the attributeName and attributeValue parameters to filter your things. For
   example, calling ListThings with attributeName=Color and attributeValue=Red retrieves all things in
   the registry that contain an attribute Color with the value Red.

  list-things-request - The input for the ListThings operation. - `com.amazonaws.services.iot.model.ListThingsRequest`

  returns: Result of the ListThings operation returned by the service. - `com.amazonaws.services.iot.model.ListThingsResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListThingsResult [^AWSIot this ^com.amazonaws.services.iot.model.ListThingsRequest list-things-request]
    (-> this (.listThings list-things-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"iot.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://iot.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AWSIot this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn create-role-alias
  "Creates a role alias.

  create-role-alias-request - `com.amazonaws.services.iot.model.CreateRoleAliasRequest`

  returns: Result of the CreateRoleAlias operation returned by the service. - `com.amazonaws.services.iot.model.CreateRoleAliasResult`

  throws: com.amazonaws.services.iot.model.ResourceAlreadyExistsException - The resource already exists."
  (^com.amazonaws.services.iot.model.CreateRoleAliasResult [^AWSIot this ^com.amazonaws.services.iot.model.CreateRoleAliasRequest create-role-alias-request]
    (-> this (.createRoleAlias create-role-alias-request))))

(defn cancel-job
  "Cancels a job.

  cancel-job-request - `com.amazonaws.services.iot.model.CancelJobRequest`

  returns: Result of the CancelJob operation returned by the service. - `com.amazonaws.services.iot.model.CancelJobResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.CancelJobResult [^AWSIot this ^com.amazonaws.services.iot.model.CancelJobRequest cancel-job-request]
    (-> this (.cancelJob cancel-job-request))))

(defn delete-certificate
  "Deletes the specified certificate.


   A certificate cannot be deleted if it has a policy attached to it or if its status is set to ACTIVE. To delete a
   certificate, first use the DetachPrincipalPolicy API to detach all policies. Next, use the
   UpdateCertificate API to set the certificate to the INACTIVE status.

  delete-certificate-request - The input for the DeleteCertificate operation. - `com.amazonaws.services.iot.model.DeleteCertificateRequest`

  returns: Result of the DeleteCertificate operation returned by the service. - `com.amazonaws.services.iot.model.DeleteCertificateResult`

  throws: com.amazonaws.services.iot.model.CertificateStateException - The certificate operation is not allowed."
  (^com.amazonaws.services.iot.model.DeleteCertificateResult [^AWSIot this ^com.amazonaws.services.iot.model.DeleteCertificateRequest delete-certificate-request]
    (-> this (.deleteCertificate delete-certificate-request))))

(defn register-ca-certificate
  "Registers a CA certificate with AWS IoT. This CA certificate can then be used to sign device certificates, which
   can be then registered with AWS IoT. You can register up to 10 CA certificates per AWS account that have the same
   subject field. This enables you to have up to 10 certificate authorities sign your device certificates. If you
   have more than one CA certificate registered, make sure you pass the CA certificate when you register your device
   certificates with the RegisterCertificate API.

  register-ca-certificate-request - The input to the RegisterCACertificate operation. - `com.amazonaws.services.iot.model.RegisterCACertificateRequest`

  returns: Result of the RegisterCACertificate operation returned by the service. - `com.amazonaws.services.iot.model.RegisterCACertificateResult`

  throws: com.amazonaws.services.iot.model.LimitExceededException - A limit has been exceeded."
  (^com.amazonaws.services.iot.model.RegisterCACertificateResult [^AWSIot this ^com.amazonaws.services.iot.model.RegisterCACertificateRequest register-ca-certificate-request]
    (-> this (.registerCACertificate register-ca-certificate-request))))

(defn add-thing-to-thing-group
  "Adds a thing to a thing group.

  add-thing-to-thing-group-request - `com.amazonaws.services.iot.model.AddThingToThingGroupRequest`

  returns: Result of the AddThingToThingGroup operation returned by the service. - `com.amazonaws.services.iot.model.AddThingToThingGroupResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.AddThingToThingGroupResult [^AWSIot this ^com.amazonaws.services.iot.model.AddThingToThingGroupRequest add-thing-to-thing-group-request]
    (-> this (.addThingToThingGroup add-thing-to-thing-group-request))))

(defn describe-role-alias
  "Describes a role alias.

  describe-role-alias-request - `com.amazonaws.services.iot.model.DescribeRoleAliasRequest`

  returns: Result of the DescribeRoleAlias operation returned by the service. - `com.amazonaws.services.iot.model.DescribeRoleAliasResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DescribeRoleAliasResult [^AWSIot this ^com.amazonaws.services.iot.model.DescribeRoleAliasRequest describe-role-alias-request]
    (-> this (.describeRoleAlias describe-role-alias-request))))

(defn transfer-certificate
  "Transfers the specified certificate to the specified AWS account.


   You can cancel the transfer until it is acknowledged by the recipient.


   No notification is sent to the transfer destination's account. It is up to the caller to notify the transfer
   target.


   The certificate being transferred must not be in the ACTIVE state. You can use the UpdateCertificate API to
   deactivate it.


   The certificate must not have any policies attached to it. You can use the DetachPrincipalPolicy API to detach
   them.

  transfer-certificate-request - The input for the TransferCertificate operation. - `com.amazonaws.services.iot.model.TransferCertificateRequest`

  returns: Result of the TransferCertificate operation returned by the service. - `com.amazonaws.services.iot.model.TransferCertificateResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.TransferCertificateResult [^AWSIot this ^com.amazonaws.services.iot.model.TransferCertificateRequest transfer-certificate-request]
    (-> this (.transferCertificate transfer-certificate-request))))

(defn get-statistics
  "Gets statistics about things that match the specified query.

  get-statistics-request - `com.amazonaws.services.iot.model.GetStatisticsRequest`

  returns: Result of the GetStatistics operation returned by the service. - `com.amazonaws.services.iot.model.GetStatisticsResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.GetStatisticsResult [^AWSIot this ^com.amazonaws.services.iot.model.GetStatisticsRequest get-statistics-request]
    (-> this (.getStatistics get-statistics-request))))

(defn set-v-2-logging-options
  "Sets the logging options for the V2 logging service.

  set-v-2-logging-options-request - `com.amazonaws.services.iot.model.SetV2LoggingOptionsRequest`

  returns: Result of the SetV2LoggingOptions operation returned by the service. - `com.amazonaws.services.iot.model.SetV2LoggingOptionsResult`

  throws: com.amazonaws.services.iot.model.InternalException - An unexpected error has occurred."
  (^com.amazonaws.services.iot.model.SetV2LoggingOptionsResult [^AWSIot this ^com.amazonaws.services.iot.model.SetV2LoggingOptionsRequest set-v-2-logging-options-request]
    (-> this (.setV2LoggingOptions set-v-2-logging-options-request))))

(defn get-policy
  "Gets information about the specified policy with the policy document of the default version.

  get-policy-request - The input for the GetPolicy operation. - `com.amazonaws.services.iot.model.GetPolicyRequest`

  returns: Result of the GetPolicy operation returned by the service. - `com.amazonaws.services.iot.model.GetPolicyResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.GetPolicyResult [^AWSIot this ^com.amazonaws.services.iot.model.GetPolicyRequest get-policy-request]
    (-> this (.getPolicy get-policy-request))))

(defn list-jobs
  "Lists jobs.

  list-jobs-request - `com.amazonaws.services.iot.model.ListJobsRequest`

  returns: Result of the ListJobs operation returned by the service. - `com.amazonaws.services.iot.model.ListJobsResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListJobsResult [^AWSIot this ^com.amazonaws.services.iot.model.ListJobsRequest list-jobs-request]
    (-> this (.listJobs list-jobs-request))))

(defn list-policy-versions
  "Lists the versions of the specified policy and identifies the default version.

  list-policy-versions-request - The input for the ListPolicyVersions operation. - `com.amazonaws.services.iot.model.ListPolicyVersionsRequest`

  returns: Result of the ListPolicyVersions operation returned by the service. - `com.amazonaws.services.iot.model.ListPolicyVersionsResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.ListPolicyVersionsResult [^AWSIot this ^com.amazonaws.services.iot.model.ListPolicyVersionsRequest list-policy-versions-request]
    (-> this (.listPolicyVersions list-policy-versions-request))))

(defn clear-default-authorizer
  "Clears the default authorizer.

  clear-default-authorizer-request - `com.amazonaws.services.iot.model.ClearDefaultAuthorizerRequest`

  returns: Result of the ClearDefaultAuthorizer operation returned by the service. - `com.amazonaws.services.iot.model.ClearDefaultAuthorizerResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.ClearDefaultAuthorizerResult [^AWSIot this ^com.amazonaws.services.iot.model.ClearDefaultAuthorizerRequest clear-default-authorizer-request]
    (-> this (.clearDefaultAuthorizer clear-default-authorizer-request))))

(defn get-v-2-logging-options
  "Gets the fine grained logging options.

  get-v-2-logging-options-request - `com.amazonaws.services.iot.model.GetV2LoggingOptionsRequest`

  returns: Result of the GetV2LoggingOptions operation returned by the service. - `com.amazonaws.services.iot.model.GetV2LoggingOptionsResult`

  throws: com.amazonaws.services.iot.model.InternalException - An unexpected error has occurred."
  (^com.amazonaws.services.iot.model.GetV2LoggingOptionsResult [^AWSIot this ^com.amazonaws.services.iot.model.GetV2LoggingOptionsRequest get-v-2-logging-options-request]
    (-> this (.getV2LoggingOptions get-v-2-logging-options-request))))

(defn detach-policy
  "Detaches a policy from the specified target.

  detach-policy-request - `com.amazonaws.services.iot.model.DetachPolicyRequest`

  returns: Result of the DetachPolicy operation returned by the service. - `com.amazonaws.services.iot.model.DetachPolicyResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DetachPolicyResult [^AWSIot this ^com.amazonaws.services.iot.model.DetachPolicyRequest detach-policy-request]
    (-> this (.detachPolicy detach-policy-request))))

(defn attach-thing-principal
  "Attaches the specified principal to the specified thing. A principal can be X.509 certificates, IAM users,
   groups, and roles, Amazon Cognito identities or federated identities.

  attach-thing-principal-request - The input for the AttachThingPrincipal operation. - `com.amazonaws.services.iot.model.AttachThingPrincipalRequest`

  returns: Result of the AttachThingPrincipal operation returned by the service. - `com.amazonaws.services.iot.model.AttachThingPrincipalResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.AttachThingPrincipalResult [^AWSIot this ^com.amazonaws.services.iot.model.AttachThingPrincipalRequest attach-thing-principal-request]
    (-> this (.attachThingPrincipal attach-thing-principal-request))))

(defn delete-v-2-logging-level
  "Deletes a logging level.

  delete-v-2-logging-level-request - `com.amazonaws.services.iot.model.DeleteV2LoggingLevelRequest`

  returns: Result of the DeleteV2LoggingLevel operation returned by the service. - `com.amazonaws.services.iot.model.DeleteV2LoggingLevelResult`

  throws: com.amazonaws.services.iot.model.InternalException - An unexpected error has occurred."
  (^com.amazonaws.services.iot.model.DeleteV2LoggingLevelResult [^AWSIot this ^com.amazonaws.services.iot.model.DeleteV2LoggingLevelRequest delete-v-2-logging-level-request]
    (-> this (.deleteV2LoggingLevel delete-v-2-logging-level-request))))

(defn delete-scheduled-audit
  "Deletes a scheduled audit.

  delete-scheduled-audit-request - `com.amazonaws.services.iot.model.DeleteScheduledAuditRequest`

  returns: Result of the DeleteScheduledAudit operation returned by the service. - `com.amazonaws.services.iot.model.DeleteScheduledAuditResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DeleteScheduledAuditResult [^AWSIot this ^com.amazonaws.services.iot.model.DeleteScheduledAuditRequest delete-scheduled-audit-request]
    (-> this (.deleteScheduledAudit delete-scheduled-audit-request))))

(defn delete-billing-group
  "Deletes the billing group.

  delete-billing-group-request - `com.amazonaws.services.iot.model.DeleteBillingGroupRequest`

  returns: Result of the DeleteBillingGroup operation returned by the service. - `com.amazonaws.services.iot.model.DeleteBillingGroupResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DeleteBillingGroupResult [^AWSIot this ^com.amazonaws.services.iot.model.DeleteBillingGroupRequest delete-billing-group-request]
    (-> this (.deleteBillingGroup delete-billing-group-request))))

(defn list-violation-events
  "Lists the Device Defender security profile violations discovered during the given time period. You can use
   filters to limit the results to those alerts issued for a particular security profile, behavior or thing
   (device).

  list-violation-events-request - `com.amazonaws.services.iot.model.ListViolationEventsRequest`

  returns: Result of the ListViolationEvents operation returned by the service. - `com.amazonaws.services.iot.model.ListViolationEventsResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListViolationEventsResult [^AWSIot this ^com.amazonaws.services.iot.model.ListViolationEventsRequest list-violation-events-request]
    (-> this (.listViolationEvents list-violation-events-request))))

(defn list-topic-rules
  "Lists the rules for the specific topic.

  list-topic-rules-request - The input for the ListTopicRules operation. - `com.amazonaws.services.iot.model.ListTopicRulesRequest`

  returns: Result of the ListTopicRules operation returned by the service. - `com.amazonaws.services.iot.model.ListTopicRulesResult`

  throws: com.amazonaws.services.iot.model.InternalException - An unexpected error has occurred."
  (^com.amazonaws.services.iot.model.ListTopicRulesResult [^AWSIot this ^com.amazonaws.services.iot.model.ListTopicRulesRequest list-topic-rules-request]
    (-> this (.listTopicRules list-topic-rules-request))))

(defn list-thing-registration-tasks
  "List bulk thing provisioning tasks.

  list-thing-registration-tasks-request - `com.amazonaws.services.iot.model.ListThingRegistrationTasksRequest`

  returns: Result of the ListThingRegistrationTasks operation returned by the service. - `com.amazonaws.services.iot.model.ListThingRegistrationTasksResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListThingRegistrationTasksResult [^AWSIot this ^com.amazonaws.services.iot.model.ListThingRegistrationTasksRequest list-thing-registration-tasks-request]
    (-> this (.listThingRegistrationTasks list-thing-registration-tasks-request))))

(defn update-scheduled-audit
  "Updates a scheduled audit, including what checks are performed and how often the audit takes place.

  update-scheduled-audit-request - `com.amazonaws.services.iot.model.UpdateScheduledAuditRequest`

  returns: Result of the UpdateScheduledAudit operation returned by the service. - `com.amazonaws.services.iot.model.UpdateScheduledAuditResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.UpdateScheduledAuditResult [^AWSIot this ^com.amazonaws.services.iot.model.UpdateScheduledAuditRequest update-scheduled-audit-request]
    (-> this (.updateScheduledAudit update-scheduled-audit-request))))

(defn get-indexing-configuration
  "Gets the search configuration.

  get-indexing-configuration-request - `com.amazonaws.services.iot.model.GetIndexingConfigurationRequest`

  returns: Result of the GetIndexingConfiguration operation returned by the service. - `com.amazonaws.services.iot.model.GetIndexingConfigurationResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.GetIndexingConfigurationResult [^AWSIot this ^com.amazonaws.services.iot.model.GetIndexingConfigurationRequest get-indexing-configuration-request]
    (-> this (.getIndexingConfiguration get-indexing-configuration-request))))

(defn list-billing-groups
  "Lists the billing groups you have created.

  list-billing-groups-request - `com.amazonaws.services.iot.model.ListBillingGroupsRequest`

  returns: Result of the ListBillingGroups operation returned by the service. - `com.amazonaws.services.iot.model.ListBillingGroupsResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListBillingGroupsResult [^AWSIot this ^com.amazonaws.services.iot.model.ListBillingGroupsRequest list-billing-groups-request]
    (-> this (.listBillingGroups list-billing-groups-request))))

(defn delete-thing-group
  "Deletes a thing group.

  delete-thing-group-request - `com.amazonaws.services.iot.model.DeleteThingGroupRequest`

  returns: Result of the DeleteThingGroup operation returned by the service. - `com.amazonaws.services.iot.model.DeleteThingGroupResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DeleteThingGroupResult [^AWSIot this ^com.amazonaws.services.iot.model.DeleteThingGroupRequest delete-thing-group-request]
    (-> this (.deleteThingGroup delete-thing-group-request))))

(defn update-thing-groups-for-thing
  "Updates the groups to which the thing belongs.

  update-thing-groups-for-thing-request - `com.amazonaws.services.iot.model.UpdateThingGroupsForThingRequest`

  returns: Result of the UpdateThingGroupsForThing operation returned by the service. - `com.amazonaws.services.iot.model.UpdateThingGroupsForThingResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.UpdateThingGroupsForThingResult [^AWSIot this ^com.amazonaws.services.iot.model.UpdateThingGroupsForThingRequest update-thing-groups-for-thing-request]
    (-> this (.updateThingGroupsForThing update-thing-groups-for-thing-request))))

(defn list-role-aliases
  "Lists the role aliases registered in your account.

  list-role-aliases-request - `com.amazonaws.services.iot.model.ListRoleAliasesRequest`

  returns: Result of the ListRoleAliases operation returned by the service. - `com.amazonaws.services.iot.model.ListRoleAliasesResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListRoleAliasesResult [^AWSIot this ^com.amazonaws.services.iot.model.ListRoleAliasesRequest list-role-aliases-request]
    (-> this (.listRoleAliases list-role-aliases-request))))

(defn attach-principal-policy
  "Deprecated.

  attach-principal-policy-request - The input for the AttachPrincipalPolicy operation. - `com.amazonaws.services.iot.model.AttachPrincipalPolicyRequest`

  returns: Result of the AttachPrincipalPolicy operation returned by the service. - `com.amazonaws.services.iot.model.AttachPrincipalPolicyResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.AttachPrincipalPolicyResult [^AWSIot this ^com.amazonaws.services.iot.model.AttachPrincipalPolicyRequest attach-principal-policy-request]
    (-> this (.attachPrincipalPolicy attach-principal-policy-request))))

(defn list-thing-registration-task-reports
  "Information about the thing registration tasks.

  list-thing-registration-task-reports-request - `com.amazonaws.services.iot.model.ListThingRegistrationTaskReportsRequest`

  returns: Result of the ListThingRegistrationTaskReports operation returned by the service. - `com.amazonaws.services.iot.model.ListThingRegistrationTaskReportsResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListThingRegistrationTaskReportsResult [^AWSIot this ^com.amazonaws.services.iot.model.ListThingRegistrationTaskReportsRequest list-thing-registration-task-reports-request]
    (-> this (.listThingRegistrationTaskReports list-thing-registration-task-reports-request))))

(defn update-billing-group
  "Updates information about the billing group.

  update-billing-group-request - `com.amazonaws.services.iot.model.UpdateBillingGroupRequest`

  returns: Result of the UpdateBillingGroup operation returned by the service. - `com.amazonaws.services.iot.model.UpdateBillingGroupResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.UpdateBillingGroupResult [^AWSIot this ^com.amazonaws.services.iot.model.UpdateBillingGroupRequest update-billing-group-request]
    (-> this (.updateBillingGroup update-billing-group-request))))

(defn describe-account-audit-configuration
  "Gets information about the Device Defender audit settings for this account. Settings include how audit
   notifications are sent and which audit checks are enabled or disabled.

  describe-account-audit-configuration-request - `com.amazonaws.services.iot.model.DescribeAccountAuditConfigurationRequest`

  returns: Result of the DescribeAccountAuditConfiguration operation returned by the service. - `com.amazonaws.services.iot.model.DescribeAccountAuditConfigurationResult`

  throws: com.amazonaws.services.iot.model.ThrottlingException - The rate exceeds the limit."
  (^com.amazonaws.services.iot.model.DescribeAccountAuditConfigurationResult [^AWSIot this ^com.amazonaws.services.iot.model.DescribeAccountAuditConfigurationRequest describe-account-audit-configuration-request]
    (-> this (.describeAccountAuditConfiguration describe-account-audit-configuration-request))))

(defn update-stream
  "Updates an existing stream. The stream version will be incremented by one.

  update-stream-request - `com.amazonaws.services.iot.model.UpdateStreamRequest`

  returns: Result of the UpdateStream operation returned by the service. - `com.amazonaws.services.iot.model.UpdateStreamResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.UpdateStreamResult [^AWSIot this ^com.amazonaws.services.iot.model.UpdateStreamRequest update-stream-request]
    (-> this (.updateStream update-stream-request))))

(defn list-ota-updates
  "Lists OTA updates.

  list-ota-updates-request - `com.amazonaws.services.iot.model.ListOTAUpdatesRequest`

  returns: Result of the ListOTAUpdates operation returned by the service. - `com.amazonaws.services.iot.model.ListOTAUpdatesResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListOTAUpdatesResult [^AWSIot this ^com.amazonaws.services.iot.model.ListOTAUpdatesRequest list-ota-updates-request]
    (-> this (.listOTAUpdates list-ota-updates-request))))

(defn get-topic-rule
  "Gets information about the rule.

  get-topic-rule-request - The input for the GetTopicRule operation. - `com.amazonaws.services.iot.model.GetTopicRuleRequest`

  returns: Result of the GetTopicRule operation returned by the service. - `com.amazonaws.services.iot.model.GetTopicRuleResult`

  throws: com.amazonaws.services.iot.model.InternalException - An unexpected error has occurred."
  (^com.amazonaws.services.iot.model.GetTopicRuleResult [^AWSIot this ^com.amazonaws.services.iot.model.GetTopicRuleRequest get-topic-rule-request]
    (-> this (.getTopicRule get-topic-rule-request))))

(defn create-thing-type
  "Creates a new thing type.

  create-thing-type-request - The input for the CreateThingType operation. - `com.amazonaws.services.iot.model.CreateThingTypeRequest`

  returns: Result of the CreateThingType operation returned by the service. - `com.amazonaws.services.iot.model.CreateThingTypeResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.CreateThingTypeResult [^AWSIot this ^com.amazonaws.services.iot.model.CreateThingTypeRequest create-thing-type-request]
    (-> this (.createThingType create-thing-type-request))))

(defn update-certificate
  "Updates the status of the specified certificate. This operation is idempotent.


   Moving a certificate from the ACTIVE state (including REVOKED) will not disconnect currently connected devices,
   but these devices will be unable to reconnect.


   The ACTIVE state is required to authenticate devices connecting to AWS IoT using a certificate.

  update-certificate-request - The input for the UpdateCertificate operation. - `com.amazonaws.services.iot.model.UpdateCertificateRequest`

  returns: Result of the UpdateCertificate operation returned by the service. - `com.amazonaws.services.iot.model.UpdateCertificateResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.UpdateCertificateResult [^AWSIot this ^com.amazonaws.services.iot.model.UpdateCertificateRequest update-certificate-request]
    (-> this (.updateCertificate update-certificate-request))))

(defn get-logging-options
  "Gets the logging options.


   NOTE: use of this command is not recommended. Use GetV2LoggingOptions instead.

  get-logging-options-request - The input for the GetLoggingOptions operation. - `com.amazonaws.services.iot.model.GetLoggingOptionsRequest`

  returns: Result of the GetLoggingOptions operation returned by the service. - `com.amazonaws.services.iot.model.GetLoggingOptionsResult`

  throws: com.amazonaws.services.iot.model.InternalException - An unexpected error has occurred."
  (^com.amazonaws.services.iot.model.GetLoggingOptionsResult [^AWSIot this ^com.amazonaws.services.iot.model.GetLoggingOptionsRequest get-logging-options-request]
    (-> this (.getLoggingOptions get-logging-options-request))))

(defn list-job-executions-for-thing
  "Lists the job executions for the specified thing.

  list-job-executions-for-thing-request - `com.amazonaws.services.iot.model.ListJobExecutionsForThingRequest`

  returns: Result of the ListJobExecutionsForThing operation returned by the service. - `com.amazonaws.services.iot.model.ListJobExecutionsForThingResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListJobExecutionsForThingResult [^AWSIot this ^com.amazonaws.services.iot.model.ListJobExecutionsForThingRequest list-job-executions-for-thing-request]
    (-> this (.listJobExecutionsForThing list-job-executions-for-thing-request))))

(defn create-thing-group
  "Create a thing group.



   This is a control plane operation. See Authorization for information
   about authorizing control plane actions.

  create-thing-group-request - `com.amazonaws.services.iot.model.CreateThingGroupRequest`

  returns: Result of the CreateThingGroup operation returned by the service. - `com.amazonaws.services.iot.model.CreateThingGroupResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.CreateThingGroupResult [^AWSIot this ^com.amazonaws.services.iot.model.CreateThingGroupRequest create-thing-group-request]
    (-> this (.createThingGroup create-thing-group-request))))

(defn remove-thing-from-billing-group
  "Removes the given thing from the billing group.

  remove-thing-from-billing-group-request - `com.amazonaws.services.iot.model.RemoveThingFromBillingGroupRequest`

  returns: Result of the RemoveThingFromBillingGroup operation returned by the service. - `com.amazonaws.services.iot.model.RemoveThingFromBillingGroupResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.RemoveThingFromBillingGroupResult [^AWSIot this ^com.amazonaws.services.iot.model.RemoveThingFromBillingGroupRequest remove-thing-from-billing-group-request]
    (-> this (.removeThingFromBillingGroup remove-thing-from-billing-group-request))))

(defn list-policy-principals
  "Deprecated.

  list-policy-principals-request - The input for the ListPolicyPrincipals operation. - `com.amazonaws.services.iot.model.ListPolicyPrincipalsRequest`

  returns: Result of the ListPolicyPrincipals operation returned by the service. - `com.amazonaws.services.iot.model.ListPolicyPrincipalsResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.ListPolicyPrincipalsResult [^AWSIot this ^com.amazonaws.services.iot.model.ListPolicyPrincipalsRequest list-policy-principals-request]
    (-> this (.listPolicyPrincipals list-policy-principals-request))))

(defn create-policy
  "Creates an AWS IoT policy.


   The created policy is the default version for the policy. This operation creates a policy version with a version
   identifier of 1 and sets 1 as the policy's default version.

  create-policy-request - The input for the CreatePolicy operation. - `com.amazonaws.services.iot.model.CreatePolicyRequest`

  returns: Result of the CreatePolicy operation returned by the service. - `com.amazonaws.services.iot.model.CreatePolicyResult`

  throws: com.amazonaws.services.iot.model.ResourceAlreadyExistsException - The resource already exists."
  (^com.amazonaws.services.iot.model.CreatePolicyResult [^AWSIot this ^com.amazonaws.services.iot.model.CreatePolicyRequest create-policy-request]
    (-> this (.createPolicy create-policy-request))))

(defn create-authorizer
  "Creates an authorizer.

  create-authorizer-request - `com.amazonaws.services.iot.model.CreateAuthorizerRequest`

  returns: Result of the CreateAuthorizer operation returned by the service. - `com.amazonaws.services.iot.model.CreateAuthorizerResult`

  throws: com.amazonaws.services.iot.model.ResourceAlreadyExistsException - The resource already exists."
  (^com.amazonaws.services.iot.model.CreateAuthorizerResult [^AWSIot this ^com.amazonaws.services.iot.model.CreateAuthorizerRequest create-authorizer-request]
    (-> this (.createAuthorizer create-authorizer-request))))

(defn get-effective-policies
  "Gets a list of the policies that have an effect on the authorization behavior of the specified device when it
   connects to the AWS IoT device gateway.

  get-effective-policies-request - `com.amazonaws.services.iot.model.GetEffectivePoliciesRequest`

  returns: Result of the GetEffectivePolicies operation returned by the service. - `com.amazonaws.services.iot.model.GetEffectivePoliciesResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.GetEffectivePoliciesResult [^AWSIot this ^com.amazonaws.services.iot.model.GetEffectivePoliciesRequest get-effective-policies-request]
    (-> this (.getEffectivePolicies get-effective-policies-request))))

(defn describe-job-execution
  "Describes a job execution.

  describe-job-execution-request - `com.amazonaws.services.iot.model.DescribeJobExecutionRequest`

  returns: Result of the DescribeJobExecution operation returned by the service. - `com.amazonaws.services.iot.model.DescribeJobExecutionResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DescribeJobExecutionResult [^AWSIot this ^com.amazonaws.services.iot.model.DescribeJobExecutionRequest describe-job-execution-request]
    (-> this (.describeJobExecution describe-job-execution-request))))

(defn describe-scheduled-audit
  "Gets information about a scheduled audit.

  describe-scheduled-audit-request - `com.amazonaws.services.iot.model.DescribeScheduledAuditRequest`

  returns: Result of the DescribeScheduledAudit operation returned by the service. - `com.amazonaws.services.iot.model.DescribeScheduledAuditResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DescribeScheduledAuditResult [^AWSIot this ^com.amazonaws.services.iot.model.DescribeScheduledAuditRequest describe-scheduled-audit-request]
    (-> this (.describeScheduledAudit describe-scheduled-audit-request))))

(defn list-policies
  "Lists your policies.

  list-policies-request - The input for the ListPolicies operation. - `com.amazonaws.services.iot.model.ListPoliciesRequest`

  returns: Result of the ListPolicies operation returned by the service. - `com.amazonaws.services.iot.model.ListPoliciesResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListPoliciesResult [^AWSIot this ^com.amazonaws.services.iot.model.ListPoliciesRequest list-policies-request]
    (-> this (.listPolicies list-policies-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSIot this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-indices
  "Lists the search indices.

  list-indices-request - `com.amazonaws.services.iot.model.ListIndicesRequest`

  returns: Result of the ListIndices operation returned by the service. - `com.amazonaws.services.iot.model.ListIndicesResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListIndicesResult [^AWSIot this ^com.amazonaws.services.iot.model.ListIndicesRequest list-indices-request]
    (-> this (.listIndices list-indices-request))))

(defn delete-security-profile
  "Deletes a Device Defender security profile.

  delete-security-profile-request - `com.amazonaws.services.iot.model.DeleteSecurityProfileRequest`

  returns: Result of the DeleteSecurityProfile operation returned by the service. - `com.amazonaws.services.iot.model.DeleteSecurityProfileResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DeleteSecurityProfileResult [^AWSIot this ^com.amazonaws.services.iot.model.DeleteSecurityProfileRequest delete-security-profile-request]
    (-> this (.deleteSecurityProfile delete-security-profile-request))))

(defn get-policy-version
  "Gets information about the specified policy version.

  get-policy-version-request - The input for the GetPolicyVersion operation. - `com.amazonaws.services.iot.model.GetPolicyVersionRequest`

  returns: Result of the GetPolicyVersion operation returned by the service. - `com.amazonaws.services.iot.model.GetPolicyVersionResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.GetPolicyVersionResult [^AWSIot this ^com.amazonaws.services.iot.model.GetPolicyVersionRequest get-policy-version-request]
    (-> this (.getPolicyVersion get-policy-version-request))))

(defn list-authorizers
  "Lists the authorizers registered in your account.

  list-authorizers-request - `com.amazonaws.services.iot.model.ListAuthorizersRequest`

  returns: Result of the ListAuthorizers operation returned by the service. - `com.amazonaws.services.iot.model.ListAuthorizersResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListAuthorizersResult [^AWSIot this ^com.amazonaws.services.iot.model.ListAuthorizersRequest list-authorizers-request]
    (-> this (.listAuthorizers list-authorizers-request))))

(defn describe-security-profile
  "Gets information about a Device Defender security profile.

  describe-security-profile-request - `com.amazonaws.services.iot.model.DescribeSecurityProfileRequest`

  returns: Result of the DescribeSecurityProfile operation returned by the service. - `com.amazonaws.services.iot.model.DescribeSecurityProfileResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DescribeSecurityProfileResult [^AWSIot this ^com.amazonaws.services.iot.model.DescribeSecurityProfileRequest describe-security-profile-request]
    (-> this (.describeSecurityProfile describe-security-profile-request))))

(defn create-job
  "Creates a job.

  create-job-request - `com.amazonaws.services.iot.model.CreateJobRequest`

  returns: Result of the CreateJob operation returned by the service. - `com.amazonaws.services.iot.model.CreateJobResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.CreateJobResult [^AWSIot this ^com.amazonaws.services.iot.model.CreateJobRequest create-job-request]
    (-> this (.createJob create-job-request))))

(defn delete-topic-rule
  "Deletes the rule.

  delete-topic-rule-request - The input for the DeleteTopicRule operation. - `com.amazonaws.services.iot.model.DeleteTopicRuleRequest`

  returns: Result of the DeleteTopicRule operation returned by the service. - `com.amazonaws.services.iot.model.DeleteTopicRuleResult`

  throws: com.amazonaws.services.iot.model.InternalException - An unexpected error has occurred."
  (^com.amazonaws.services.iot.model.DeleteTopicRuleResult [^AWSIot this ^com.amazonaws.services.iot.model.DeleteTopicRuleRequest delete-topic-rule-request]
    (-> this (.deleteTopicRule delete-topic-rule-request))))

(defn detach-security-profile
  "Disassociates a Device Defender security profile from a thing group or from this account.

  detach-security-profile-request - `com.amazonaws.services.iot.model.DetachSecurityProfileRequest`

  returns: Result of the DetachSecurityProfile operation returned by the service. - `com.amazonaws.services.iot.model.DetachSecurityProfileResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DetachSecurityProfileResult [^AWSIot this ^com.amazonaws.services.iot.model.DetachSecurityProfileRequest detach-security-profile-request]
    (-> this (.detachSecurityProfile detach-security-profile-request))))

(defn cancel-job-execution
  "Cancels the execution of a job for a given thing.

  cancel-job-execution-request - `com.amazonaws.services.iot.model.CancelJobExecutionRequest`

  returns: Result of the CancelJobExecution operation returned by the service. - `com.amazonaws.services.iot.model.CancelJobExecutionResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.CancelJobExecutionResult [^AWSIot this ^com.amazonaws.services.iot.model.CancelJobExecutionRequest cancel-job-execution-request]
    (-> this (.cancelJobExecution cancel-job-execution-request))))

(defn start-thing-registration-task
  "Creates a bulk thing provisioning task.

  start-thing-registration-task-request - `com.amazonaws.services.iot.model.StartThingRegistrationTaskRequest`

  returns: Result of the StartThingRegistrationTask operation returned by the service. - `com.amazonaws.services.iot.model.StartThingRegistrationTaskResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.StartThingRegistrationTaskResult [^AWSIot this ^com.amazonaws.services.iot.model.StartThingRegistrationTaskRequest start-thing-registration-task-request]
    (-> this (.startThingRegistrationTask start-thing-registration-task-request))))

(defn describe-index
  "Describes a search index.

  describe-index-request - `com.amazonaws.services.iot.model.DescribeIndexRequest`

  returns: Result of the DescribeIndex operation returned by the service. - `com.amazonaws.services.iot.model.DescribeIndexResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DescribeIndexResult [^AWSIot this ^com.amazonaws.services.iot.model.DescribeIndexRequest describe-index-request]
    (-> this (.describeIndex describe-index-request))))

(defn list-audit-findings
  "Lists the findings (results) of a Device Defender audit or of the audits performed during a specified time
   period. (Findings are retained for 180 days.)

  list-audit-findings-request - `com.amazonaws.services.iot.model.ListAuditFindingsRequest`

  returns: Result of the ListAuditFindings operation returned by the service. - `com.amazonaws.services.iot.model.ListAuditFindingsResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListAuditFindingsResult [^AWSIot this ^com.amazonaws.services.iot.model.ListAuditFindingsRequest list-audit-findings-request]
    (-> this (.listAuditFindings list-audit-findings-request))))

(defn attach-security-profile
  "Associates a Device Defender security profile with a thing group or with this account. Each thing group or
   account can have up to five security profiles associated with it.

  attach-security-profile-request - `com.amazonaws.services.iot.model.AttachSecurityProfileRequest`

  returns: Result of the AttachSecurityProfile operation returned by the service. - `com.amazonaws.services.iot.model.AttachSecurityProfileResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.AttachSecurityProfileResult [^AWSIot this ^com.amazonaws.services.iot.model.AttachSecurityProfileRequest attach-security-profile-request]
    (-> this (.attachSecurityProfile attach-security-profile-request))))

(defn tag-resource
  "Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource.

  tag-resource-request - `com.amazonaws.services.iot.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.iot.model.TagResourceResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.TagResourceResult [^AWSIot this ^com.amazonaws.services.iot.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResource tag-resource-request))))

(defn delete-authorizer
  "Deletes an authorizer.

  delete-authorizer-request - `com.amazonaws.services.iot.model.DeleteAuthorizerRequest`

  returns: Result of the DeleteAuthorizer operation returned by the service. - `com.amazonaws.services.iot.model.DeleteAuthorizerResult`

  throws: com.amazonaws.services.iot.model.DeleteConflictException - You can't delete the resource because it is attached to one or more resources."
  (^com.amazonaws.services.iot.model.DeleteAuthorizerResult [^AWSIot this ^com.amazonaws.services.iot.model.DeleteAuthorizerRequest delete-authorizer-request]
    (-> this (.deleteAuthorizer delete-authorizer-request))))

(defn remove-thing-from-thing-group
  "Remove the specified thing from the specified group.

  remove-thing-from-thing-group-request - `com.amazonaws.services.iot.model.RemoveThingFromThingGroupRequest`

  returns: Result of the RemoveThingFromThingGroup operation returned by the service. - `com.amazonaws.services.iot.model.RemoveThingFromThingGroupResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.RemoveThingFromThingGroupResult [^AWSIot this ^com.amazonaws.services.iot.model.RemoveThingFromThingGroupRequest remove-thing-from-thing-group-request]
    (-> this (.removeThingFromThingGroup remove-thing-from-thing-group-request))))

(defn create-stream
  "Creates a stream for delivering one or more large files in chunks over MQTT. A stream transports data bytes in
   chunks or blocks packaged as MQTT messages from a source like S3. You can have one or more files associated with
   a stream. The total size of a file associated with the stream cannot exceed more than 2 MB. The stream will be
   created with version 0. If a stream is created with the same streamID as a stream that existed and was deleted
   within last 90 days, we will resurrect that old stream by incrementing the version by 1.

  create-stream-request - `com.amazonaws.services.iot.model.CreateStreamRequest`

  returns: Result of the CreateStream operation returned by the service. - `com.amazonaws.services.iot.model.CreateStreamResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.CreateStreamResult [^AWSIot this ^com.amazonaws.services.iot.model.CreateStreamRequest create-stream-request]
    (-> this (.createStream create-stream-request))))

(defn list-scheduled-audits
  "Lists all of your scheduled audits.

  list-scheduled-audits-request - `com.amazonaws.services.iot.model.ListScheduledAuditsRequest`

  returns: Result of the ListScheduledAudits operation returned by the service. - `com.amazonaws.services.iot.model.ListScheduledAuditsResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListScheduledAuditsResult [^AWSIot this ^com.amazonaws.services.iot.model.ListScheduledAuditsRequest list-scheduled-audits-request]
    (-> this (.listScheduledAudits list-scheduled-audits-request))))

(defn list-things-in-thing-group
  "Lists the things in the specified group.

  list-things-in-thing-group-request - `com.amazonaws.services.iot.model.ListThingsInThingGroupRequest`

  returns: Result of the ListThingsInThingGroup operation returned by the service. - `com.amazonaws.services.iot.model.ListThingsInThingGroupResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListThingsInThingGroupResult [^AWSIot this ^com.amazonaws.services.iot.model.ListThingsInThingGroupRequest list-things-in-thing-group-request]
    (-> this (.listThingsInThingGroup list-things-in-thing-group-request))))

(defn enable-topic-rule
  "Enables the rule.

  enable-topic-rule-request - The input for the EnableTopicRuleRequest operation. - `com.amazonaws.services.iot.model.EnableTopicRuleRequest`

  returns: Result of the EnableTopicRule operation returned by the service. - `com.amazonaws.services.iot.model.EnableTopicRuleResult`

  throws: com.amazonaws.services.iot.model.InternalException - An unexpected error has occurred."
  (^com.amazonaws.services.iot.model.EnableTopicRuleResult [^AWSIot this ^com.amazonaws.services.iot.model.EnableTopicRuleRequest enable-topic-rule-request]
    (-> this (.enableTopicRule enable-topic-rule-request))))

(defn accept-certificate-transfer
  "Accepts a pending certificate transfer. The default state of the certificate is INACTIVE.


   To check for pending certificate transfers, call ListCertificates to enumerate your certificates.

  accept-certificate-transfer-request - The input for the AcceptCertificateTransfer operation. - `com.amazonaws.services.iot.model.AcceptCertificateTransferRequest`

  returns: Result of the AcceptCertificateTransfer operation returned by the service. - `com.amazonaws.services.iot.model.AcceptCertificateTransferResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.AcceptCertificateTransferResult [^AWSIot this ^com.amazonaws.services.iot.model.AcceptCertificateTransferRequest accept-certificate-transfer-request]
    (-> this (.acceptCertificateTransfer accept-certificate-transfer-request))))

(defn list-targets-for-security-profile
  "Lists the targets (thing groups) associated with a given Device Defender security profile.

  list-targets-for-security-profile-request - `com.amazonaws.services.iot.model.ListTargetsForSecurityProfileRequest`

  returns: Result of the ListTargetsForSecurityProfile operation returned by the service. - `com.amazonaws.services.iot.model.ListTargetsForSecurityProfileResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListTargetsForSecurityProfileResult [^AWSIot this ^com.amazonaws.services.iot.model.ListTargetsForSecurityProfileRequest list-targets-for-security-profile-request]
    (-> this (.listTargetsForSecurityProfile list-targets-for-security-profile-request))))

(defn describe-billing-group
  "Returns information about a billing group.

  describe-billing-group-request - `com.amazonaws.services.iot.model.DescribeBillingGroupRequest`

  returns: Result of the DescribeBillingGroup operation returned by the service. - `com.amazonaws.services.iot.model.DescribeBillingGroupResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DescribeBillingGroupResult [^AWSIot this ^com.amazonaws.services.iot.model.DescribeBillingGroupRequest describe-billing-group-request]
    (-> this (.describeBillingGroup describe-billing-group-request))))

(defn get-job-document
  "Gets a job document.

  get-job-document-request - `com.amazonaws.services.iot.model.GetJobDocumentRequest`

  returns: Result of the GetJobDocument operation returned by the service. - `com.amazonaws.services.iot.model.GetJobDocumentResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.GetJobDocumentResult [^AWSIot this ^com.amazonaws.services.iot.model.GetJobDocumentRequest get-job-document-request]
    (-> this (.getJobDocument get-job-document-request))))

(defn associate-targets-with-job
  "Associates a group with a continuous job. The following criteria must be met:




   The job must have been created with the targetSelection field set to \"CONTINUOUS\".




   The job status must currently be \"IN_PROGRESS\".




   The total number of targets associated with a job must not exceed 100.

  associate-targets-with-job-request - `com.amazonaws.services.iot.model.AssociateTargetsWithJobRequest`

  returns: Result of the AssociateTargetsWithJob operation returned by the service. - `com.amazonaws.services.iot.model.AssociateTargetsWithJobResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.AssociateTargetsWithJobResult [^AWSIot this ^com.amazonaws.services.iot.model.AssociateTargetsWithJobRequest associate-targets-with-job-request]
    (-> this (.associateTargetsWithJob associate-targets-with-job-request))))

(defn detach-thing-principal
  "Detaches the specified principal from the specified thing. A principal can be X.509 certificates, IAM users,
   groups, and roles, Amazon Cognito identities or federated identities.



   This call is asynchronous. It might take several seconds for the detachment to propagate.

  detach-thing-principal-request - The input for the DetachThingPrincipal operation. - `com.amazonaws.services.iot.model.DetachThingPrincipalRequest`

  returns: Result of the DetachThingPrincipal operation returned by the service. - `com.amazonaws.services.iot.model.DetachThingPrincipalResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.DetachThingPrincipalResult [^AWSIot this ^com.amazonaws.services.iot.model.DetachThingPrincipalRequest detach-thing-principal-request]
    (-> this (.detachThingPrincipal detach-thing-principal-request))))

(defn create-thing
  "Creates a thing record in the registry. If this call is made multiple times using the same thing name and
   configuration, the call will succeed. If this call is made with the same thing name but different configuration a
   ResourceAlreadyExistsException is thrown.



   This is a control plane operation. See Authorization for information
   about authorizing control plane actions.

  create-thing-request - The input for the CreateThing operation. - `com.amazonaws.services.iot.model.CreateThingRequest`

  returns: Result of the CreateThing operation returned by the service. - `com.amazonaws.services.iot.model.CreateThingResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.CreateThingResult [^AWSIot this ^com.amazonaws.services.iot.model.CreateThingRequest create-thing-request]
    (-> this (.createThing create-thing-request))))

(defn list-principal-policies
  "Deprecated.

  list-principal-policies-request - The input for the ListPrincipalPolicies operation. - `com.amazonaws.services.iot.model.ListPrincipalPoliciesRequest`

  returns: Result of the ListPrincipalPolicies operation returned by the service. - `com.amazonaws.services.iot.model.ListPrincipalPoliciesResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.ListPrincipalPoliciesResult [^AWSIot this ^com.amazonaws.services.iot.model.ListPrincipalPoliciesRequest list-principal-policies-request]
    (-> this (.listPrincipalPolicies list-principal-policies-request))))

(defn describe-thing-group
  "Describe a thing group.

  describe-thing-group-request - `com.amazonaws.services.iot.model.DescribeThingGroupRequest`

  returns: Result of the DescribeThingGroup operation returned by the service. - `com.amazonaws.services.iot.model.DescribeThingGroupResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DescribeThingGroupResult [^AWSIot this ^com.amazonaws.services.iot.model.DescribeThingGroupRequest describe-thing-group-request]
    (-> this (.describeThingGroup describe-thing-group-request))))

(defn get-registration-code
  "Gets a registration code used to register a CA certificate with AWS IoT.

  get-registration-code-request - The input to the GetRegistrationCode operation. - `com.amazonaws.services.iot.model.GetRegistrationCodeRequest`

  returns: Result of the GetRegistrationCode operation returned by the service. - `com.amazonaws.services.iot.model.GetRegistrationCodeResult`

  throws: com.amazonaws.services.iot.model.ThrottlingException - The rate exceeds the limit."
  (^com.amazonaws.services.iot.model.GetRegistrationCodeResult [^AWSIot this ^com.amazonaws.services.iot.model.GetRegistrationCodeRequest get-registration-code-request]
    (-> this (.getRegistrationCode get-registration-code-request))))

(defn delete-account-audit-configuration
  "Restores the default settings for Device Defender audits for this account. Any configuration data you entered is
   deleted and all audit checks are reset to disabled.

  delete-account-audit-configuration-request - `com.amazonaws.services.iot.model.DeleteAccountAuditConfigurationRequest`

  returns: Result of the DeleteAccountAuditConfiguration operation returned by the service. - `com.amazonaws.services.iot.model.DeleteAccountAuditConfigurationResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DeleteAccountAuditConfigurationResult [^AWSIot this ^com.amazonaws.services.iot.model.DeleteAccountAuditConfigurationRequest delete-account-audit-configuration-request]
    (-> this (.deleteAccountAuditConfiguration delete-account-audit-configuration-request))))

