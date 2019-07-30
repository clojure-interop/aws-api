(ns com.amazonaws.services.iot.AWSIotClient
  "Client for accessing AWS IoT. All service calls made using this client are blocking, and will not return until the
  service call completes.

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
  (:import [com.amazonaws.services.iot AWSIotClient]))

(defn ->aws-iot-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to AWS IoT (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AWSIotClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AWSIotClient aws-credentials-provider client-configuration request-metric-collector))
  (^AWSIotClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSIotClient aws-credentials client-configuration))
  (^AWSIotClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSIotClient client-configuration))
  (^AWSIotClient []
    (new AWSIotClient )))

(defn *builder
  "returns: `com.amazonaws.services.iot.AWSIotClientBuilder`"
  (^com.amazonaws.services.iot.AWSIotClientBuilder []
    (AWSIotClient/builder )))

(defn update-thing-group
  "Update a thing group.

  request - `com.amazonaws.services.iot.model.UpdateThingGroupRequest`

  returns: Result of the UpdateThingGroup operation returned by the service. - `com.amazonaws.services.iot.model.UpdateThingGroupResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.UpdateThingGroupResult [^AWSIotClient this ^com.amazonaws.services.iot.model.UpdateThingGroupRequest request]
    (-> this (.updateThingGroup request))))

(defn reject-certificate-transfer
  "Rejects a pending certificate transfer. After AWS IoT rejects a certificate transfer, the certificate status
   changes from PENDING_TRANSFER to INACTIVE.


   To check for pending certificate transfers, call ListCertificates to enumerate your certificates.


   This operation can only be called by the transfer destination. After it is called, the certificate will be
   returned to the source's account in the INACTIVE state.

  request - `com.amazonaws.services.iot.model.RejectCertificateTransferRequest`

  returns: Result of the RejectCertificateTransfer operation returned by the service. - `com.amazonaws.services.iot.model.RejectCertificateTransferResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.RejectCertificateTransferResult [^AWSIotClient this ^com.amazonaws.services.iot.model.RejectCertificateTransferRequest request]
    (-> this (.rejectCertificateTransfer request))))

(defn update-ca-certificate
  "Updates a registered CA certificate.

  request - `com.amazonaws.services.iot.model.UpdateCACertificateRequest`

  returns: Result of the UpdateCACertificate operation returned by the service. - `com.amazonaws.services.iot.model.UpdateCACertificateResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.UpdateCACertificateResult [^AWSIotClient this ^com.amazonaws.services.iot.model.UpdateCACertificateRequest request]
    (-> this (.updateCACertificate request))))

(defn create-billing-group
  "Creates a billing group.

  request - `com.amazonaws.services.iot.model.CreateBillingGroupRequest`

  returns: Result of the CreateBillingGroup operation returned by the service. - `com.amazonaws.services.iot.model.CreateBillingGroupResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.CreateBillingGroupResult [^AWSIotClient this ^com.amazonaws.services.iot.model.CreateBillingGroupRequest request]
    (-> this (.createBillingGroup request))))

(defn search-index
  "The query search index.

  request - `com.amazonaws.services.iot.model.SearchIndexRequest`

  returns: Result of the SearchIndex operation returned by the service. - `com.amazonaws.services.iot.model.SearchIndexResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.SearchIndexResult [^AWSIotClient this ^com.amazonaws.services.iot.model.SearchIndexRequest request]
    (-> this (.searchIndex request))))

(defn delete-thing-type
  "Deletes the specified thing type. You cannot delete a thing type if it has things associated with it. To delete a
   thing type, first mark it as deprecated by calling DeprecateThingType, then remove any associated things
   by calling UpdateThing to change the thing type on any associated thing, and finally use
   DeleteThingType to delete the thing type.

  request - `com.amazonaws.services.iot.model.DeleteThingTypeRequest`

  returns: Result of the DeleteThingType operation returned by the service. - `com.amazonaws.services.iot.model.DeleteThingTypeResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.DeleteThingTypeResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DeleteThingTypeRequest request]
    (-> this (.deleteThingType request))))

(defn describe-stream
  "Gets information about a stream.

  request - `com.amazonaws.services.iot.model.DescribeStreamRequest`

  returns: Result of the DescribeStream operation returned by the service. - `com.amazonaws.services.iot.model.DescribeStreamResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DescribeStreamResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DescribeStreamRequest request]
    (-> this (.describeStream request))))

(defn list-tags-for-resource
  "Lists the tags (metadata) you have assigned to the resource.

  request - `com.amazonaws.services.iot.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.iot.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListTagsForResourceResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn register-certificate
  "Registers a device certificate with AWS IoT. If you have more than one CA certificate that has the same subject
   field, you must specify the CA certificate that was used to sign the device certificate being registered.

  request - `com.amazonaws.services.iot.model.RegisterCertificateRequest`

  returns: Result of the RegisterCertificate operation returned by the service. - `com.amazonaws.services.iot.model.RegisterCertificateResult`

  throws: com.amazonaws.services.iot.model.CertificateValidationException - The certificate is invalid."
  (^com.amazonaws.services.iot.model.RegisterCertificateResult [^AWSIotClient this ^com.amazonaws.services.iot.model.RegisterCertificateRequest request]
    (-> this (.registerCertificate request))))

(defn describe-authorizer
  "Describes an authorizer.

  request - `com.amazonaws.services.iot.model.DescribeAuthorizerRequest`

  returns: Result of the DescribeAuthorizer operation returned by the service. - `com.amazonaws.services.iot.model.DescribeAuthorizerResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.DescribeAuthorizerResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DescribeAuthorizerRequest request]
    (-> this (.describeAuthorizer request))))

(defn list-security-profiles-for-target
  "Lists the Device Defender security profiles attached to a target (thing group).

  request - `com.amazonaws.services.iot.model.ListSecurityProfilesForTargetRequest`

  returns: Result of the ListSecurityProfilesForTarget operation returned by the service. - `com.amazonaws.services.iot.model.ListSecurityProfilesForTargetResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListSecurityProfilesForTargetResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListSecurityProfilesForTargetRequest request]
    (-> this (.listSecurityProfilesForTarget request))))

(defn delete-stream
  "Deletes a stream.

  request - `com.amazonaws.services.iot.model.DeleteStreamRequest`

  returns: Result of the DeleteStream operation returned by the service. - `com.amazonaws.services.iot.model.DeleteStreamResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.DeleteStreamResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DeleteStreamRequest request]
    (-> this (.deleteStream request))))

(defn test-authorization
  "Tests if a specified principal is authorized to perform an AWS IoT action on a specified resource. Use this to
   test and debug the authorization behavior of devices that connect to the AWS IoT device gateway.

  request - `com.amazonaws.services.iot.model.TestAuthorizationRequest`

  returns: Result of the TestAuthorization operation returned by the service. - `com.amazonaws.services.iot.model.TestAuthorizationResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.TestAuthorizationResult [^AWSIotClient this ^com.amazonaws.services.iot.model.TestAuthorizationRequest request]
    (-> this (.testAuthorization request))))

(defn create-ota-update
  "Creates an AWS IoT OTAUpdate on a target group of things or groups.

  request - `com.amazonaws.services.iot.model.CreateOTAUpdateRequest`

  returns: Result of the CreateOTAUpdate operation returned by the service. - `com.amazonaws.services.iot.model.CreateOTAUpdateResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.CreateOTAUpdateResult [^AWSIotClient this ^com.amazonaws.services.iot.model.CreateOTAUpdateRequest request]
    (-> this (.createOTAUpdate request))))

(defn detach-principal-policy
  "Deprecated.

  request - `com.amazonaws.services.iot.model.DetachPrincipalPolicyRequest`

  returns: Result of the DetachPrincipalPolicy operation returned by the service. - `com.amazonaws.services.iot.model.DetachPrincipalPolicyResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.DetachPrincipalPolicyResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DetachPrincipalPolicyRequest request]
    (-> this (.detachPrincipalPolicy request))))

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

  request - `com.amazonaws.services.iot.model.CreateCertificateFromCsrRequest`

  returns: Result of the CreateCertificateFromCsr operation returned by the service. - `com.amazonaws.services.iot.model.CreateCertificateFromCsrResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.CreateCertificateFromCsrResult [^AWSIotClient this ^com.amazonaws.services.iot.model.CreateCertificateFromCsrRequest request]
    (-> this (.createCertificateFromCsr request))))

(defn list-audit-tasks
  "Lists the Device Defender audits that have been performed during a given time period.

  request - `com.amazonaws.services.iot.model.ListAuditTasksRequest`

  returns: Result of the ListAuditTasks operation returned by the service. - `com.amazonaws.services.iot.model.ListAuditTasksResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListAuditTasksResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListAuditTasksRequest request]
    (-> this (.listAuditTasks request))))

(defn describe-thing-registration-task
  "Describes a bulk thing provisioning task.

  request - `com.amazonaws.services.iot.model.DescribeThingRegistrationTaskRequest`

  returns: Result of the DescribeThingRegistrationTask operation returned by the service. - `com.amazonaws.services.iot.model.DescribeThingRegistrationTaskResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DescribeThingRegistrationTaskResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DescribeThingRegistrationTaskRequest request]
    (-> this (.describeThingRegistrationTask request))))

(defn list-thing-types
  "Lists the existing thing types.

  request - `com.amazonaws.services.iot.model.ListThingTypesRequest`

  returns: Result of the ListThingTypes operation returned by the service. - `com.amazonaws.services.iot.model.ListThingTypesResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListThingTypesResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListThingTypesRequest request]
    (-> this (.listThingTypes request))))

(defn get-ota-update
  "Gets an OTA update.

  request - `com.amazonaws.services.iot.model.GetOTAUpdateRequest`

  returns: Result of the GetOTAUpdate operation returned by the service. - `com.amazonaws.services.iot.model.GetOTAUpdateResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.GetOTAUpdateResult [^AWSIotClient this ^com.amazonaws.services.iot.model.GetOTAUpdateRequest request]
    (-> this (.getOTAUpdate request))))

(defn update-account-audit-configuration
  "Configures or reconfigures the Device Defender audit settings for this account. Settings include how audit
   notifications are sent and which audit checks are enabled or disabled.

  request - `com.amazonaws.services.iot.model.UpdateAccountAuditConfigurationRequest`

  returns: Result of the UpdateAccountAuditConfiguration operation returned by the service. - `com.amazonaws.services.iot.model.UpdateAccountAuditConfigurationResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.UpdateAccountAuditConfigurationResult [^AWSIotClient this ^com.amazonaws.services.iot.model.UpdateAccountAuditConfigurationRequest request]
    (-> this (.updateAccountAuditConfiguration request))))

(defn list-v-2-logging-levels
  "Lists logging levels.

  request - `com.amazonaws.services.iot.model.ListV2LoggingLevelsRequest`

  returns: Result of the ListV2LoggingLevels operation returned by the service. - `com.amazonaws.services.iot.model.ListV2LoggingLevelsResult`

  throws: com.amazonaws.services.iot.model.InternalException - An unexpected error has occurred."
  (^com.amazonaws.services.iot.model.ListV2LoggingLevelsResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListV2LoggingLevelsRequest request]
    (-> this (.listV2LoggingLevels request))))

(defn update-indexing-configuration
  "Updates the search configuration.

  request - `com.amazonaws.services.iot.model.UpdateIndexingConfigurationRequest`

  returns: Result of the UpdateIndexingConfiguration operation returned by the service. - `com.amazonaws.services.iot.model.UpdateIndexingConfigurationResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.UpdateIndexingConfigurationResult [^AWSIotClient this ^com.amazonaws.services.iot.model.UpdateIndexingConfigurationRequest request]
    (-> this (.updateIndexingConfiguration request))))

(defn disable-topic-rule
  "Disables the rule.

  request - `com.amazonaws.services.iot.model.DisableTopicRuleRequest`

  returns: Result of the DisableTopicRule operation returned by the service. - `com.amazonaws.services.iot.model.DisableTopicRuleResult`

  throws: com.amazonaws.services.iot.model.InternalException - An unexpected error has occurred."
  (^com.amazonaws.services.iot.model.DisableTopicRuleResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DisableTopicRuleRequest request]
    (-> this (.disableTopicRule request))))

(defn list-active-violations
  "Lists the active violations for a given Device Defender security profile.

  request - `com.amazonaws.services.iot.model.ListActiveViolationsRequest`

  returns: Result of the ListActiveViolations operation returned by the service. - `com.amazonaws.services.iot.model.ListActiveViolationsResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListActiveViolationsResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListActiveViolationsRequest request]
    (-> this (.listActiveViolations request))))

(defn describe-job
  "Describes a job.

  request - `com.amazonaws.services.iot.model.DescribeJobRequest`

  returns: Result of the DescribeJob operation returned by the service. - `com.amazonaws.services.iot.model.DescribeJobResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DescribeJobResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DescribeJobRequest request]
    (-> this (.describeJob request))))

(defn list-certificates
  "Lists the certificates registered in your AWS account.


   The results are paginated with a default page size of 25. You can use the returned marker to retrieve additional
   results.

  request - `com.amazonaws.services.iot.model.ListCertificatesRequest`

  returns: Result of the ListCertificates operation returned by the service. - `com.amazonaws.services.iot.model.ListCertificatesResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListCertificatesResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListCertificatesRequest request]
    (-> this (.listCertificates request))))

(defn set-v-2-logging-level
  "Sets the logging level.

  request - `com.amazonaws.services.iot.model.SetV2LoggingLevelRequest`

  returns: Result of the SetV2LoggingLevel operation returned by the service. - `com.amazonaws.services.iot.model.SetV2LoggingLevelResult`

  throws: com.amazonaws.services.iot.model.InternalException - An unexpected error has occurred."
  (^com.amazonaws.services.iot.model.SetV2LoggingLevelResult [^AWSIotClient this ^com.amazonaws.services.iot.model.SetV2LoggingLevelRequest request]
    (-> this (.setV2LoggingLevel request))))

(defn register-thing
  "Provisions a thing.

  request - `com.amazonaws.services.iot.model.RegisterThingRequest`

  returns: Result of the RegisterThing operation returned by the service. - `com.amazonaws.services.iot.model.RegisterThingResult`

  throws: com.amazonaws.services.iot.model.InternalFailureException - An unexpected error has occurred."
  (^com.amazonaws.services.iot.model.RegisterThingResult [^AWSIotClient this ^com.amazonaws.services.iot.model.RegisterThingRequest request]
    (-> this (.registerThing request))))

(defn list-certificates-by-ca
  "List the device certificates signed by the specified CA certificate.

  request - `com.amazonaws.services.iot.model.ListCertificatesByCARequest`

  returns: Result of the ListCertificatesByCA operation returned by the service. - `com.amazonaws.services.iot.model.ListCertificatesByCAResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListCertificatesByCAResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListCertificatesByCARequest request]
    (-> this (.listCertificatesByCA request))))

(defn set-default-policy-version
  "Sets the specified version of the specified policy as the policy's default (operative) version. This action
   affects all certificates to which the policy is attached. To list the principals the policy is attached to, use
   the ListPrincipalPolicy API.

  request - `com.amazonaws.services.iot.model.SetDefaultPolicyVersionRequest`

  returns: Result of the SetDefaultPolicyVersion operation returned by the service. - `com.amazonaws.services.iot.model.SetDefaultPolicyVersionResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.SetDefaultPolicyVersionResult [^AWSIotClient this ^com.amazonaws.services.iot.model.SetDefaultPolicyVersionRequest request]
    (-> this (.setDefaultPolicyVersion request))))

(defn create-security-profile
  "Creates a Device Defender security profile.

  request - `com.amazonaws.services.iot.model.CreateSecurityProfileRequest`

  returns: Result of the CreateSecurityProfile operation returned by the service. - `com.amazonaws.services.iot.model.CreateSecurityProfileResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.CreateSecurityProfileResult [^AWSIotClient this ^com.amazonaws.services.iot.model.CreateSecurityProfileRequest request]
    (-> this (.createSecurityProfile request))))

(defn create-topic-rule
  "Creates a rule. Creating rules is an administrator-level action. Any user who has permission to create rules will
   be able to access data processed by the rule.

  request - `com.amazonaws.services.iot.model.CreateTopicRuleRequest`

  returns: Result of the CreateTopicRule operation returned by the service. - `com.amazonaws.services.iot.model.CreateTopicRuleResult`

  throws: com.amazonaws.services.iot.model.SqlParseException - The Rule-SQL expression can't be parsed correctly."
  (^com.amazonaws.services.iot.model.CreateTopicRuleResult [^AWSIotClient this ^com.amazonaws.services.iot.model.CreateTopicRuleRequest request]
    (-> this (.createTopicRule request))))

(defn untag-resource
  "Removes the given tags (metadata) from the resource.

  request - `com.amazonaws.services.iot.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.iot.model.UntagResourceResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.UntagResourceResult [^AWSIotClient this ^com.amazonaws.services.iot.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn list-attached-policies
  "Lists the policies attached to the specified thing group.

  request - `com.amazonaws.services.iot.model.ListAttachedPoliciesRequest`

  returns: Result of the ListAttachedPolicies operation returned by the service. - `com.amazonaws.services.iot.model.ListAttachedPoliciesResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.ListAttachedPoliciesResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListAttachedPoliciesRequest request]
    (-> this (.listAttachedPolicies request))))

(defn update-authorizer
  "Updates an authorizer.

  request - `com.amazonaws.services.iot.model.UpdateAuthorizerRequest`

  returns: Result of the UpdateAuthorizer operation returned by the service. - `com.amazonaws.services.iot.model.UpdateAuthorizerResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.UpdateAuthorizerResult [^AWSIotClient this ^com.amazonaws.services.iot.model.UpdateAuthorizerRequest request]
    (-> this (.updateAuthorizer request))))

(defn delete-ca-certificate
  "Deletes a registered CA certificate.

  request - `com.amazonaws.services.iot.model.DeleteCACertificateRequest`

  returns: Result of the DeleteCACertificate operation returned by the service. - `com.amazonaws.services.iot.model.DeleteCACertificateResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DeleteCACertificateResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DeleteCACertificateRequest request]
    (-> this (.deleteCACertificate request))))

(defn create-keys-and-certificate
  "Creates a 2048-bit RSA key pair and issues an X.509 certificate using the issued public key.


   Note This is the only time AWS IoT issues the private key for this certificate, so it is important to keep
   it in a secure location.

  request - `com.amazonaws.services.iot.model.CreateKeysAndCertificateRequest`

  returns: Result of the CreateKeysAndCertificate operation returned by the service. - `com.amazonaws.services.iot.model.CreateKeysAndCertificateResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.CreateKeysAndCertificateResult [^AWSIotClient this ^com.amazonaws.services.iot.model.CreateKeysAndCertificateRequest request]
    (-> this (.createKeysAndCertificate request))))

(defn cancel-certificate-transfer
  "Cancels a pending transfer for the specified certificate.


   Note Only the transfer source account can use this operation to cancel a transfer. (Transfer destinations
   can use RejectCertificateTransfer instead.) After transfer, AWS IoT returns the certificate to the source
   account in the INACTIVE state. After the destination account has accepted the transfer, the transfer cannot be
   cancelled.


   After a certificate transfer is cancelled, the status of the certificate changes from PENDING_TRANSFER to
   INACTIVE.

  request - `com.amazonaws.services.iot.model.CancelCertificateTransferRequest`

  returns: Result of the CancelCertificateTransfer operation returned by the service. - `com.amazonaws.services.iot.model.CancelCertificateTransferResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.CancelCertificateTransferResult [^AWSIotClient this ^com.amazonaws.services.iot.model.CancelCertificateTransferRequest request]
    (-> this (.cancelCertificateTransfer request))))

(defn create-dynamic-thing-group
  "Creates a dynamic thing group.

  request - `com.amazonaws.services.iot.model.CreateDynamicThingGroupRequest`

  returns: Result of the CreateDynamicThingGroup operation returned by the service. - `com.amazonaws.services.iot.model.CreateDynamicThingGroupResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.CreateDynamicThingGroupResult [^AWSIotClient this ^com.amazonaws.services.iot.model.CreateDynamicThingGroupRequest request]
    (-> this (.createDynamicThingGroup request))))

(defn delete-job-execution
  "Deletes a job execution.

  request - `com.amazonaws.services.iot.model.DeleteJobExecutionRequest`

  returns: Result of the DeleteJobExecution operation returned by the service. - `com.amazonaws.services.iot.model.DeleteJobExecutionResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DeleteJobExecutionResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DeleteJobExecutionRequest request]
    (-> this (.deleteJobExecution request))))

(defn update-event-configurations
  "Updates the event configurations.

  request - `com.amazonaws.services.iot.model.UpdateEventConfigurationsRequest`

  returns: Result of the UpdateEventConfigurations operation returned by the service. - `com.amazonaws.services.iot.model.UpdateEventConfigurationsResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.UpdateEventConfigurationsResult [^AWSIotClient this ^com.amazonaws.services.iot.model.UpdateEventConfigurationsRequest request]
    (-> this (.updateEventConfigurations request))))

(defn update-job
  "Updates supported fields of the specified job.

  request - `com.amazonaws.services.iot.model.UpdateJobRequest`

  returns: Result of the UpdateJob operation returned by the service. - `com.amazonaws.services.iot.model.UpdateJobResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.UpdateJobResult [^AWSIotClient this ^com.amazonaws.services.iot.model.UpdateJobRequest request]
    (-> this (.updateJob request))))

(defn cancel-audit-task
  "Cancels an audit that is in progress. The audit can be either scheduled or on-demand. If the audit is not in
   progress, an \"InvalidRequestException\" occurs.

  request - `com.amazonaws.services.iot.model.CancelAuditTaskRequest`

  returns: Result of the CancelAuditTask operation returned by the service. - `com.amazonaws.services.iot.model.CancelAuditTaskResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.CancelAuditTaskResult [^AWSIotClient this ^com.amazonaws.services.iot.model.CancelAuditTaskRequest request]
    (-> this (.cancelAuditTask request))))

(defn update-role-alias
  "Updates a role alias.

  request - `com.amazonaws.services.iot.model.UpdateRoleAliasRequest`

  returns: Result of the UpdateRoleAlias operation returned by the service. - `com.amazonaws.services.iot.model.UpdateRoleAliasResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.UpdateRoleAliasResult [^AWSIotClient this ^com.amazonaws.services.iot.model.UpdateRoleAliasRequest request]
    (-> this (.updateRoleAlias request))))

(defn create-scheduled-audit
  "Creates a scheduled audit that is run at a specified time interval.

  request - `com.amazonaws.services.iot.model.CreateScheduledAuditRequest`

  returns: Result of the CreateScheduledAudit operation returned by the service. - `com.amazonaws.services.iot.model.CreateScheduledAuditResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.CreateScheduledAuditResult [^AWSIotClient this ^com.amazonaws.services.iot.model.CreateScheduledAuditRequest request]
    (-> this (.createScheduledAudit request))))

(defn deprecate-thing-type
  "Deprecates a thing type. You can not associate new things with deprecated thing type.

  request - `com.amazonaws.services.iot.model.DeprecateThingTypeRequest`

  returns: Result of the DeprecateThingType operation returned by the service. - `com.amazonaws.services.iot.model.DeprecateThingTypeResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.DeprecateThingTypeResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DeprecateThingTypeRequest request]
    (-> this (.deprecateThingType request))))

(defn describe-default-authorizer
  "Describes the default authorizer.

  request - `com.amazonaws.services.iot.model.DescribeDefaultAuthorizerRequest`

  returns: Result of the DescribeDefaultAuthorizer operation returned by the service. - `com.amazonaws.services.iot.model.DescribeDefaultAuthorizerResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.DescribeDefaultAuthorizerResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DescribeDefaultAuthorizerRequest request]
    (-> this (.describeDefaultAuthorizer request))))

(defn delete-registration-code
  "Deletes a CA certificate registration code.

  request - `com.amazonaws.services.iot.model.DeleteRegistrationCodeRequest`

  returns: Result of the DeleteRegistrationCode operation returned by the service. - `com.amazonaws.services.iot.model.DeleteRegistrationCodeResult`

  throws: com.amazonaws.services.iot.model.ThrottlingException - The rate exceeds the limit."
  (^com.amazonaws.services.iot.model.DeleteRegistrationCodeResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DeleteRegistrationCodeRequest request]
    (-> this (.deleteRegistrationCode request))))

(defn delete-job
  "Deletes a job and its related job executions.


   Deleting a job may take time, depending on the number of job executions created for the job and various other
   factors. While the job is being deleted, the status of the job will be shown as \"DELETION_IN_PROGRESS\".
   Attempting to delete or cancel a job whose status is already \"DELETION_IN_PROGRESS\" will result in an error.


   Only 10 jobs may have status \"DELETION_IN_PROGRESS\" at the same time, or a LimitExceededException will occur.

  request - `com.amazonaws.services.iot.model.DeleteJobRequest`

  returns: Result of the DeleteJob operation returned by the service. - `com.amazonaws.services.iot.model.DeleteJobResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DeleteJobResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DeleteJobRequest request]
    (-> this (.deleteJob request))))

(defn list-targets-for-policy
  "List targets for the specified policy.

  request - `com.amazonaws.services.iot.model.ListTargetsForPolicyRequest`

  returns: Result of the ListTargetsForPolicy operation returned by the service. - `com.amazonaws.services.iot.model.ListTargetsForPolicyResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.ListTargetsForPolicyResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListTargetsForPolicyRequest request]
    (-> this (.listTargetsForPolicy request))))

(defn list-thing-groups-for-thing
  "List the thing groups to which the specified thing belongs.

  request - `com.amazonaws.services.iot.model.ListThingGroupsForThingRequest`

  returns: Result of the ListThingGroupsForThing operation returned by the service. - `com.amazonaws.services.iot.model.ListThingGroupsForThingResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListThingGroupsForThingResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListThingGroupsForThingRequest request]
    (-> this (.listThingGroupsForThing request))))

(defn delete-role-alias
  "Deletes a role alias

  request - `com.amazonaws.services.iot.model.DeleteRoleAliasRequest`

  returns: Result of the DeleteRoleAlias operation returned by the service. - `com.amazonaws.services.iot.model.DeleteRoleAliasResult`

  throws: com.amazonaws.services.iot.model.DeleteConflictException - You can't delete the resource because it is attached to one or more resources."
  (^com.amazonaws.services.iot.model.DeleteRoleAliasResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DeleteRoleAliasRequest request]
    (-> this (.deleteRoleAlias request))))

(defn set-logging-options
  "Sets the logging options.


   NOTE: use of this command is not recommended. Use SetV2LoggingOptions instead.

  request - `com.amazonaws.services.iot.model.SetLoggingOptionsRequest`

  returns: Result of the SetLoggingOptions operation returned by the service. - `com.amazonaws.services.iot.model.SetLoggingOptionsResult`

  throws: com.amazonaws.services.iot.model.InternalException - An unexpected error has occurred."
  (^com.amazonaws.services.iot.model.SetLoggingOptionsResult [^AWSIotClient this ^com.amazonaws.services.iot.model.SetLoggingOptionsRequest request]
    (-> this (.setLoggingOptions request))))

(defn list-job-executions-for-job
  "Lists the job executions for a job.

  request - `com.amazonaws.services.iot.model.ListJobExecutionsForJobRequest`

  returns: Result of the ListJobExecutionsForJob operation returned by the service. - `com.amazonaws.services.iot.model.ListJobExecutionsForJobResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListJobExecutionsForJobResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListJobExecutionsForJobRequest request]
    (-> this (.listJobExecutionsForJob request))))

(defn update-thing
  "Updates the data for a thing.

  request - `com.amazonaws.services.iot.model.UpdateThingRequest`

  returns: Result of the UpdateThing operation returned by the service. - `com.amazonaws.services.iot.model.UpdateThingResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.UpdateThingResult [^AWSIotClient this ^com.amazonaws.services.iot.model.UpdateThingRequest request]
    (-> this (.updateThing request))))

(defn describe-thing-type
  "Gets information about the specified thing type.

  request - `com.amazonaws.services.iot.model.DescribeThingTypeRequest`

  returns: Result of the DescribeThingType operation returned by the service. - `com.amazonaws.services.iot.model.DescribeThingTypeResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.DescribeThingTypeResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DescribeThingTypeRequest request]
    (-> this (.describeThingType request))))

(defn delete-ota-update
  "Delete an OTA update.

  request - `com.amazonaws.services.iot.model.DeleteOTAUpdateRequest`

  returns: Result of the DeleteOTAUpdate operation returned by the service. - `com.amazonaws.services.iot.model.DeleteOTAUpdateResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DeleteOTAUpdateResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DeleteOTAUpdateRequest request]
    (-> this (.deleteOTAUpdate request))))

(defn list-things-in-billing-group
  "Lists the things you have added to the given billing group.

  request - `com.amazonaws.services.iot.model.ListThingsInBillingGroupRequest`

  returns: Result of the ListThingsInBillingGroup operation returned by the service. - `com.amazonaws.services.iot.model.ListThingsInBillingGroupResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListThingsInBillingGroupResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListThingsInBillingGroupRequest request]
    (-> this (.listThingsInBillingGroup request))))

(defn update-security-profile
  "Updates a Device Defender security profile.

  request - `com.amazonaws.services.iot.model.UpdateSecurityProfileRequest`

  returns: Result of the UpdateSecurityProfile operation returned by the service. - `com.amazonaws.services.iot.model.UpdateSecurityProfileResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.UpdateSecurityProfileResult [^AWSIotClient this ^com.amazonaws.services.iot.model.UpdateSecurityProfileRequest request]
    (-> this (.updateSecurityProfile request))))

(defn create-policy-version
  "Creates a new version of the specified AWS IoT policy. To update a policy, create a new policy version. A managed
   policy can have up to five versions. If the policy has five versions, you must use DeletePolicyVersion to
   delete an existing version before you create a new one.


   Optionally, you can set the new version as the policy's default version. The default version is the operative
   version (that is, the version that is in effect for the certificates to which the policy is attached).

  request - `com.amazonaws.services.iot.model.CreatePolicyVersionRequest`

  returns: Result of the CreatePolicyVersion operation returned by the service. - `com.amazonaws.services.iot.model.CreatePolicyVersionResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.CreatePolicyVersionResult [^AWSIotClient this ^com.amazonaws.services.iot.model.CreatePolicyVersionRequest request]
    (-> this (.createPolicyVersion request))))

(defn set-default-authorizer
  "Sets the default authorizer. This will be used if a websocket connection is made without specifying an
   authorizer.

  request - `com.amazonaws.services.iot.model.SetDefaultAuthorizerRequest`

  returns: Result of the SetDefaultAuthorizer operation returned by the service. - `com.amazonaws.services.iot.model.SetDefaultAuthorizerResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.SetDefaultAuthorizerResult [^AWSIotClient this ^com.amazonaws.services.iot.model.SetDefaultAuthorizerRequest request]
    (-> this (.setDefaultAuthorizer request))))

(defn list-principal-things
  "Lists the things associated with the specified principal. A principal can be X.509 certificates, IAM users,
   groups, and roles, Amazon Cognito identities or federated identities.

  request - `com.amazonaws.services.iot.model.ListPrincipalThingsRequest`

  returns: Result of the ListPrincipalThings operation returned by the service. - `com.amazonaws.services.iot.model.ListPrincipalThingsResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListPrincipalThingsResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListPrincipalThingsRequest request]
    (-> this (.listPrincipalThings request))))

(defn add-thing-to-billing-group
  "Adds a thing to a billing group.

  request - `com.amazonaws.services.iot.model.AddThingToBillingGroupRequest`

  returns: Result of the AddThingToBillingGroup operation returned by the service. - `com.amazonaws.services.iot.model.AddThingToBillingGroupResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.AddThingToBillingGroupResult [^AWSIotClient this ^com.amazonaws.services.iot.model.AddThingToBillingGroupRequest request]
    (-> this (.addThingToBillingGroup request))))

(defn list-security-profiles
  "Lists the Device Defender security profiles you have created. You can use filters to list only those security
   profiles associated with a thing group or only those associated with your account.

  request - `com.amazonaws.services.iot.model.ListSecurityProfilesRequest`

  returns: Result of the ListSecurityProfiles operation returned by the service. - `com.amazonaws.services.iot.model.ListSecurityProfilesResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListSecurityProfilesResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListSecurityProfilesRequest request]
    (-> this (.listSecurityProfiles request))))

(defn delete-policy-version
  "Deletes the specified version of the specified policy. You cannot delete the default version of a policy using
   this API. To delete the default version of a policy, use DeletePolicy. To find out which version of a
   policy is marked as the default version, use ListPolicyVersions.

  request - `com.amazonaws.services.iot.model.DeletePolicyVersionRequest`

  returns: Result of the DeletePolicyVersion operation returned by the service. - `com.amazonaws.services.iot.model.DeletePolicyVersionResult`

  throws: com.amazonaws.services.iot.model.DeleteConflictException - You can't delete the resource because it is attached to one or more resources."
  (^com.amazonaws.services.iot.model.DeletePolicyVersionResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DeletePolicyVersionRequest request]
    (-> this (.deletePolicyVersion request))))

(defn start-on-demand-audit-task
  "Starts an on-demand Device Defender audit.

  request - `com.amazonaws.services.iot.model.StartOnDemandAuditTaskRequest`

  returns: Result of the StartOnDemandAuditTask operation returned by the service. - `com.amazonaws.services.iot.model.StartOnDemandAuditTaskResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.StartOnDemandAuditTaskResult [^AWSIotClient this ^com.amazonaws.services.iot.model.StartOnDemandAuditTaskRequest request]
    (-> this (.startOnDemandAuditTask request))))

(defn update-dynamic-thing-group
  "Updates a dynamic thing group.

  request - `com.amazonaws.services.iot.model.UpdateDynamicThingGroupRequest`

  returns: Result of the UpdateDynamicThingGroup operation returned by the service. - `com.amazonaws.services.iot.model.UpdateDynamicThingGroupResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.UpdateDynamicThingGroupResult [^AWSIotClient this ^com.amazonaws.services.iot.model.UpdateDynamicThingGroupRequest request]
    (-> this (.updateDynamicThingGroup request))))

(defn list-outgoing-certificates
  "Lists certificates that are being transferred but not yet accepted.

  request - `com.amazonaws.services.iot.model.ListOutgoingCertificatesRequest`

  returns: Result of the ListOutgoingCertificates operation returned by the service. - `com.amazonaws.services.iot.model.ListOutgoingCertificatesResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListOutgoingCertificatesResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListOutgoingCertificatesRequest request]
    (-> this (.listOutgoingCertificates request))))

(defn delete-policy
  "Deletes the specified policy.


   A policy cannot be deleted if it has non-default versions or it is attached to any certificate.


   To delete a policy, use the DeletePolicyVersion API to delete all non-default versions of the policy; use the
   DetachPrincipalPolicy API to detach the policy from any certificate; and then use the DeletePolicy API to delete
   the policy.


   When a policy is deleted using DeletePolicy, its default version is deleted with it.

  request - `com.amazonaws.services.iot.model.DeletePolicyRequest`

  returns: Result of the DeletePolicy operation returned by the service. - `com.amazonaws.services.iot.model.DeletePolicyResult`

  throws: com.amazonaws.services.iot.model.DeleteConflictException - You can't delete the resource because it is attached to one or more resources."
  (^com.amazonaws.services.iot.model.DeletePolicyResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DeletePolicyRequest request]
    (-> this (.deletePolicy request))))

(defn replace-topic-rule
  "Replaces the rule. You must specify all parameters for the new rule. Creating rules is an administrator-level
   action. Any user who has permission to create rules will be able to access data processed by the rule.

  request - `com.amazonaws.services.iot.model.ReplaceTopicRuleRequest`

  returns: Result of the ReplaceTopicRule operation returned by the service. - `com.amazonaws.services.iot.model.ReplaceTopicRuleResult`

  throws: com.amazonaws.services.iot.model.SqlParseException - The Rule-SQL expression can't be parsed correctly."
  (^com.amazonaws.services.iot.model.ReplaceTopicRuleResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ReplaceTopicRuleRequest request]
    (-> this (.replaceTopicRule request))))

(defn describe-audit-task
  "Gets information about a Device Defender audit.

  request - `com.amazonaws.services.iot.model.DescribeAuditTaskRequest`

  returns: Result of the DescribeAuditTask operation returned by the service. - `com.amazonaws.services.iot.model.DescribeAuditTaskResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DescribeAuditTaskResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DescribeAuditTaskRequest request]
    (-> this (.describeAuditTask request))))

(defn attach-policy
  "Attaches a policy to the specified target.

  request - `com.amazonaws.services.iot.model.AttachPolicyRequest`

  returns: Result of the AttachPolicy operation returned by the service. - `com.amazonaws.services.iot.model.AttachPolicyResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.AttachPolicyResult [^AWSIotClient this ^com.amazonaws.services.iot.model.AttachPolicyRequest request]
    (-> this (.attachPolicy request))))

(defn list-thing-groups
  "List the thing groups in your account.

  request - `com.amazonaws.services.iot.model.ListThingGroupsRequest`

  returns: Result of the ListThingGroups operation returned by the service. - `com.amazonaws.services.iot.model.ListThingGroupsResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListThingGroupsResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListThingGroupsRequest request]
    (-> this (.listThingGroups request))))

(defn stop-thing-registration-task
  "Cancels a bulk thing provisioning task.

  request - `com.amazonaws.services.iot.model.StopThingRegistrationTaskRequest`

  returns: Result of the StopThingRegistrationTask operation returned by the service. - `com.amazonaws.services.iot.model.StopThingRegistrationTaskResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.StopThingRegistrationTaskResult [^AWSIotClient this ^com.amazonaws.services.iot.model.StopThingRegistrationTaskRequest request]
    (-> this (.stopThingRegistrationTask request))))

(defn validate-security-profile-behaviors
  "Validates a Device Defender security profile behaviors specification.

  request - `com.amazonaws.services.iot.model.ValidateSecurityProfileBehaviorsRequest`

  returns: Result of the ValidateSecurityProfileBehaviors operation returned by the service. - `com.amazonaws.services.iot.model.ValidateSecurityProfileBehaviorsResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ValidateSecurityProfileBehaviorsResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ValidateSecurityProfileBehaviorsRequest request]
    (-> this (.validateSecurityProfileBehaviors request))))

(defn describe-event-configurations
  "Describes event configurations.

  request - `com.amazonaws.services.iot.model.DescribeEventConfigurationsRequest`

  returns: Result of the DescribeEventConfigurations operation returned by the service. - `com.amazonaws.services.iot.model.DescribeEventConfigurationsResult`

  throws: com.amazonaws.services.iot.model.InternalFailureException - An unexpected error has occurred."
  (^com.amazonaws.services.iot.model.DescribeEventConfigurationsResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DescribeEventConfigurationsRequest request]
    (-> this (.describeEventConfigurations request))))

(defn list-streams
  "Lists all of the streams in your AWS account.

  request - `com.amazonaws.services.iot.model.ListStreamsRequest`

  returns: Result of the ListStreams operation returned by the service. - `com.amazonaws.services.iot.model.ListStreamsResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListStreamsResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListStreamsRequest request]
    (-> this (.listStreams request))))

(defn describe-ca-certificate
  "Describes a registered CA certificate.

  request - `com.amazonaws.services.iot.model.DescribeCACertificateRequest`

  returns: Result of the DescribeCACertificate operation returned by the service. - `com.amazonaws.services.iot.model.DescribeCACertificateResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DescribeCACertificateResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DescribeCACertificateRequest request]
    (-> this (.describeCACertificate request))))

(defn test-invoke-authorizer
  "Tests a custom authorization behavior by invoking a specified custom authorizer. Use this to test and debug the
   custom authorization behavior of devices that connect to the AWS IoT device gateway.

  request - `com.amazonaws.services.iot.model.TestInvokeAuthorizerRequest`

  returns: Result of the TestInvokeAuthorizer operation returned by the service. - `com.amazonaws.services.iot.model.TestInvokeAuthorizerResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.TestInvokeAuthorizerResult [^AWSIotClient this ^com.amazonaws.services.iot.model.TestInvokeAuthorizerRequest request]
    (-> this (.testInvokeAuthorizer request))))

(defn describe-certificate
  "Gets information about the specified certificate.

  request - `com.amazonaws.services.iot.model.DescribeCertificateRequest`

  returns: Result of the DescribeCertificate operation returned by the service. - `com.amazonaws.services.iot.model.DescribeCertificateResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DescribeCertificateResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DescribeCertificateRequest request]
    (-> this (.describeCertificate request))))

(defn delete-thing
  "Deletes the specified thing. Returns successfully with no error if the deletion is successful or you specify a
   thing that doesn't exist.

  request - `com.amazonaws.services.iot.model.DeleteThingRequest`

  returns: Result of the DeleteThing operation returned by the service. - `com.amazonaws.services.iot.model.DeleteThingResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.DeleteThingResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DeleteThingRequest request]
    (-> this (.deleteThing request))))

(defn list-thing-principals
  "Lists the principals associated with the specified thing. A principal can be X.509 certificates, IAM users,
   groups, and roles, Amazon Cognito identities or federated identities.

  request - `com.amazonaws.services.iot.model.ListThingPrincipalsRequest`

  returns: Result of the ListThingPrincipals operation returned by the service. - `com.amazonaws.services.iot.model.ListThingPrincipalsResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListThingPrincipalsResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListThingPrincipalsRequest request]
    (-> this (.listThingPrincipals request))))

(defn describe-endpoint
  "Returns a unique endpoint specific to the AWS account making the call.

  request - `com.amazonaws.services.iot.model.DescribeEndpointRequest`

  returns: Result of the DescribeEndpoint operation returned by the service. - `com.amazonaws.services.iot.model.DescribeEndpointResult`

  throws: com.amazonaws.services.iot.model.InternalFailureException - An unexpected error has occurred."
  (^com.amazonaws.services.iot.model.DescribeEndpointResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DescribeEndpointRequest request]
    (-> this (.describeEndpoint request))))

(defn describe-thing
  "Gets information about the specified thing.

  request - `com.amazonaws.services.iot.model.DescribeThingRequest`

  returns: Result of the DescribeThing operation returned by the service. - `com.amazonaws.services.iot.model.DescribeThingResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.DescribeThingResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DescribeThingRequest request]
    (-> this (.describeThing request))))

(defn list-ca-certificates
  "Lists the CA certificates registered for your AWS account.


   The results are paginated with a default page size of 25. You can use the returned marker to retrieve additional
   results.

  request - `com.amazonaws.services.iot.model.ListCACertificatesRequest`

  returns: Result of the ListCACertificates operation returned by the service. - `com.amazonaws.services.iot.model.ListCACertificatesResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListCACertificatesResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListCACertificatesRequest request]
    (-> this (.listCACertificates request))))

(defn delete-dynamic-thing-group
  "Deletes a dynamic thing group.

  request - `com.amazonaws.services.iot.model.DeleteDynamicThingGroupRequest`

  returns: Result of the DeleteDynamicThingGroup operation returned by the service. - `com.amazonaws.services.iot.model.DeleteDynamicThingGroupResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DeleteDynamicThingGroupResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DeleteDynamicThingGroupRequest request]
    (-> this (.deleteDynamicThingGroup request))))

(defn list-things
  "Lists your things. Use the attributeName and attributeValue parameters to filter your things. For
   example, calling ListThings with attributeName=Color and attributeValue=Red retrieves all things in
   the registry that contain an attribute Color with the value Red.

  request - `com.amazonaws.services.iot.model.ListThingsRequest`

  returns: Result of the ListThings operation returned by the service. - `com.amazonaws.services.iot.model.ListThingsResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListThingsResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListThingsRequest request]
    (-> this (.listThings request))))

(defn create-role-alias
  "Creates a role alias.

  request - `com.amazonaws.services.iot.model.CreateRoleAliasRequest`

  returns: Result of the CreateRoleAlias operation returned by the service. - `com.amazonaws.services.iot.model.CreateRoleAliasResult`

  throws: com.amazonaws.services.iot.model.ResourceAlreadyExistsException - The resource already exists."
  (^com.amazonaws.services.iot.model.CreateRoleAliasResult [^AWSIotClient this ^com.amazonaws.services.iot.model.CreateRoleAliasRequest request]
    (-> this (.createRoleAlias request))))

(defn cancel-job
  "Cancels a job.

  request - `com.amazonaws.services.iot.model.CancelJobRequest`

  returns: Result of the CancelJob operation returned by the service. - `com.amazonaws.services.iot.model.CancelJobResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.CancelJobResult [^AWSIotClient this ^com.amazonaws.services.iot.model.CancelJobRequest request]
    (-> this (.cancelJob request))))

(defn delete-certificate
  "Deletes the specified certificate.


   A certificate cannot be deleted if it has a policy attached to it or if its status is set to ACTIVE. To delete a
   certificate, first use the DetachPrincipalPolicy API to detach all policies. Next, use the
   UpdateCertificate API to set the certificate to the INACTIVE status.

  request - `com.amazonaws.services.iot.model.DeleteCertificateRequest`

  returns: Result of the DeleteCertificate operation returned by the service. - `com.amazonaws.services.iot.model.DeleteCertificateResult`

  throws: com.amazonaws.services.iot.model.CertificateStateException - The certificate operation is not allowed."
  (^com.amazonaws.services.iot.model.DeleteCertificateResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DeleteCertificateRequest request]
    (-> this (.deleteCertificate request))))

(defn register-ca-certificate
  "Registers a CA certificate with AWS IoT. This CA certificate can then be used to sign device certificates, which
   can be then registered with AWS IoT. You can register up to 10 CA certificates per AWS account that have the same
   subject field. This enables you to have up to 10 certificate authorities sign your device certificates. If you
   have more than one CA certificate registered, make sure you pass the CA certificate when you register your device
   certificates with the RegisterCertificate API.

  request - `com.amazonaws.services.iot.model.RegisterCACertificateRequest`

  returns: Result of the RegisterCACertificate operation returned by the service. - `com.amazonaws.services.iot.model.RegisterCACertificateResult`

  throws: com.amazonaws.services.iot.model.LimitExceededException - A limit has been exceeded."
  (^com.amazonaws.services.iot.model.RegisterCACertificateResult [^AWSIotClient this ^com.amazonaws.services.iot.model.RegisterCACertificateRequest request]
    (-> this (.registerCACertificate request))))

(defn add-thing-to-thing-group
  "Adds a thing to a thing group.

  request - `com.amazonaws.services.iot.model.AddThingToThingGroupRequest`

  returns: Result of the AddThingToThingGroup operation returned by the service. - `com.amazonaws.services.iot.model.AddThingToThingGroupResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.AddThingToThingGroupResult [^AWSIotClient this ^com.amazonaws.services.iot.model.AddThingToThingGroupRequest request]
    (-> this (.addThingToThingGroup request))))

(defn describe-role-alias
  "Describes a role alias.

  request - `com.amazonaws.services.iot.model.DescribeRoleAliasRequest`

  returns: Result of the DescribeRoleAlias operation returned by the service. - `com.amazonaws.services.iot.model.DescribeRoleAliasResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DescribeRoleAliasResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DescribeRoleAliasRequest request]
    (-> this (.describeRoleAlias request))))

(defn transfer-certificate
  "Transfers the specified certificate to the specified AWS account.


   You can cancel the transfer until it is acknowledged by the recipient.


   No notification is sent to the transfer destination's account. It is up to the caller to notify the transfer
   target.


   The certificate being transferred must not be in the ACTIVE state. You can use the UpdateCertificate API to
   deactivate it.


   The certificate must not have any policies attached to it. You can use the DetachPrincipalPolicy API to detach
   them.

  request - `com.amazonaws.services.iot.model.TransferCertificateRequest`

  returns: Result of the TransferCertificate operation returned by the service. - `com.amazonaws.services.iot.model.TransferCertificateResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.TransferCertificateResult [^AWSIotClient this ^com.amazonaws.services.iot.model.TransferCertificateRequest request]
    (-> this (.transferCertificate request))))

(defn get-statistics
  "Gets statistics about things that match the specified query.

  request - `com.amazonaws.services.iot.model.GetStatisticsRequest`

  returns: Result of the GetStatistics operation returned by the service. - `com.amazonaws.services.iot.model.GetStatisticsResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.GetStatisticsResult [^AWSIotClient this ^com.amazonaws.services.iot.model.GetStatisticsRequest request]
    (-> this (.getStatistics request))))

(defn set-v-2-logging-options
  "Sets the logging options for the V2 logging service.

  request - `com.amazonaws.services.iot.model.SetV2LoggingOptionsRequest`

  returns: Result of the SetV2LoggingOptions operation returned by the service. - `com.amazonaws.services.iot.model.SetV2LoggingOptionsResult`

  throws: com.amazonaws.services.iot.model.InternalException - An unexpected error has occurred."
  (^com.amazonaws.services.iot.model.SetV2LoggingOptionsResult [^AWSIotClient this ^com.amazonaws.services.iot.model.SetV2LoggingOptionsRequest request]
    (-> this (.setV2LoggingOptions request))))

(defn get-policy
  "Gets information about the specified policy with the policy document of the default version.

  request - `com.amazonaws.services.iot.model.GetPolicyRequest`

  returns: Result of the GetPolicy operation returned by the service. - `com.amazonaws.services.iot.model.GetPolicyResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.GetPolicyResult [^AWSIotClient this ^com.amazonaws.services.iot.model.GetPolicyRequest request]
    (-> this (.getPolicy request))))

(defn list-jobs
  "Lists jobs.

  request - `com.amazonaws.services.iot.model.ListJobsRequest`

  returns: Result of the ListJobs operation returned by the service. - `com.amazonaws.services.iot.model.ListJobsResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListJobsResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListJobsRequest request]
    (-> this (.listJobs request))))

(defn list-policy-versions
  "Lists the versions of the specified policy and identifies the default version.

  request - `com.amazonaws.services.iot.model.ListPolicyVersionsRequest`

  returns: Result of the ListPolicyVersions operation returned by the service. - `com.amazonaws.services.iot.model.ListPolicyVersionsResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.ListPolicyVersionsResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListPolicyVersionsRequest request]
    (-> this (.listPolicyVersions request))))

(defn clear-default-authorizer
  "Clears the default authorizer.

  request - `com.amazonaws.services.iot.model.ClearDefaultAuthorizerRequest`

  returns: Result of the ClearDefaultAuthorizer operation returned by the service. - `com.amazonaws.services.iot.model.ClearDefaultAuthorizerResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.ClearDefaultAuthorizerResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ClearDefaultAuthorizerRequest request]
    (-> this (.clearDefaultAuthorizer request))))

(defn get-v-2-logging-options
  "Gets the fine grained logging options.

  request - `com.amazonaws.services.iot.model.GetV2LoggingOptionsRequest`

  returns: Result of the GetV2LoggingOptions operation returned by the service. - `com.amazonaws.services.iot.model.GetV2LoggingOptionsResult`

  throws: com.amazonaws.services.iot.model.InternalException - An unexpected error has occurred."
  (^com.amazonaws.services.iot.model.GetV2LoggingOptionsResult [^AWSIotClient this ^com.amazonaws.services.iot.model.GetV2LoggingOptionsRequest request]
    (-> this (.getV2LoggingOptions request))))

(defn detach-policy
  "Detaches a policy from the specified target.

  request - `com.amazonaws.services.iot.model.DetachPolicyRequest`

  returns: Result of the DetachPolicy operation returned by the service. - `com.amazonaws.services.iot.model.DetachPolicyResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DetachPolicyResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DetachPolicyRequest request]
    (-> this (.detachPolicy request))))

(defn attach-thing-principal
  "Attaches the specified principal to the specified thing. A principal can be X.509 certificates, IAM users,
   groups, and roles, Amazon Cognito identities or federated identities.

  request - `com.amazonaws.services.iot.model.AttachThingPrincipalRequest`

  returns: Result of the AttachThingPrincipal operation returned by the service. - `com.amazonaws.services.iot.model.AttachThingPrincipalResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.AttachThingPrincipalResult [^AWSIotClient this ^com.amazonaws.services.iot.model.AttachThingPrincipalRequest request]
    (-> this (.attachThingPrincipal request))))

(defn delete-v-2-logging-level
  "Deletes a logging level.

  request - `com.amazonaws.services.iot.model.DeleteV2LoggingLevelRequest`

  returns: Result of the DeleteV2LoggingLevel operation returned by the service. - `com.amazonaws.services.iot.model.DeleteV2LoggingLevelResult`

  throws: com.amazonaws.services.iot.model.InternalException - An unexpected error has occurred."
  (^com.amazonaws.services.iot.model.DeleteV2LoggingLevelResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DeleteV2LoggingLevelRequest request]
    (-> this (.deleteV2LoggingLevel request))))

(defn delete-scheduled-audit
  "Deletes a scheduled audit.

  request - `com.amazonaws.services.iot.model.DeleteScheduledAuditRequest`

  returns: Result of the DeleteScheduledAudit operation returned by the service. - `com.amazonaws.services.iot.model.DeleteScheduledAuditResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DeleteScheduledAuditResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DeleteScheduledAuditRequest request]
    (-> this (.deleteScheduledAudit request))))

(defn delete-billing-group
  "Deletes the billing group.

  request - `com.amazonaws.services.iot.model.DeleteBillingGroupRequest`

  returns: Result of the DeleteBillingGroup operation returned by the service. - `com.amazonaws.services.iot.model.DeleteBillingGroupResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DeleteBillingGroupResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DeleteBillingGroupRequest request]
    (-> this (.deleteBillingGroup request))))

(defn list-violation-events
  "Lists the Device Defender security profile violations discovered during the given time period. You can use
   filters to limit the results to those alerts issued for a particular security profile, behavior or thing
   (device).

  request - `com.amazonaws.services.iot.model.ListViolationEventsRequest`

  returns: Result of the ListViolationEvents operation returned by the service. - `com.amazonaws.services.iot.model.ListViolationEventsResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListViolationEventsResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListViolationEventsRequest request]
    (-> this (.listViolationEvents request))))

(defn list-topic-rules
  "Lists the rules for the specific topic.

  request - `com.amazonaws.services.iot.model.ListTopicRulesRequest`

  returns: Result of the ListTopicRules operation returned by the service. - `com.amazonaws.services.iot.model.ListTopicRulesResult`

  throws: com.amazonaws.services.iot.model.InternalException - An unexpected error has occurred."
  (^com.amazonaws.services.iot.model.ListTopicRulesResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListTopicRulesRequest request]
    (-> this (.listTopicRules request))))

(defn list-thing-registration-tasks
  "List bulk thing provisioning tasks.

  request - `com.amazonaws.services.iot.model.ListThingRegistrationTasksRequest`

  returns: Result of the ListThingRegistrationTasks operation returned by the service. - `com.amazonaws.services.iot.model.ListThingRegistrationTasksResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListThingRegistrationTasksResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListThingRegistrationTasksRequest request]
    (-> this (.listThingRegistrationTasks request))))

(defn update-scheduled-audit
  "Updates a scheduled audit, including what checks are performed and how often the audit takes place.

  request - `com.amazonaws.services.iot.model.UpdateScheduledAuditRequest`

  returns: Result of the UpdateScheduledAudit operation returned by the service. - `com.amazonaws.services.iot.model.UpdateScheduledAuditResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.UpdateScheduledAuditResult [^AWSIotClient this ^com.amazonaws.services.iot.model.UpdateScheduledAuditRequest request]
    (-> this (.updateScheduledAudit request))))

(defn get-indexing-configuration
  "Gets the search configuration.

  request - `com.amazonaws.services.iot.model.GetIndexingConfigurationRequest`

  returns: Result of the GetIndexingConfiguration operation returned by the service. - `com.amazonaws.services.iot.model.GetIndexingConfigurationResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.GetIndexingConfigurationResult [^AWSIotClient this ^com.amazonaws.services.iot.model.GetIndexingConfigurationRequest request]
    (-> this (.getIndexingConfiguration request))))

(defn list-billing-groups
  "Lists the billing groups you have created.

  request - `com.amazonaws.services.iot.model.ListBillingGroupsRequest`

  returns: Result of the ListBillingGroups operation returned by the service. - `com.amazonaws.services.iot.model.ListBillingGroupsResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListBillingGroupsResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListBillingGroupsRequest request]
    (-> this (.listBillingGroups request))))

(defn delete-thing-group
  "Deletes a thing group.

  request - `com.amazonaws.services.iot.model.DeleteThingGroupRequest`

  returns: Result of the DeleteThingGroup operation returned by the service. - `com.amazonaws.services.iot.model.DeleteThingGroupResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DeleteThingGroupResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DeleteThingGroupRequest request]
    (-> this (.deleteThingGroup request))))

(defn update-thing-groups-for-thing
  "Updates the groups to which the thing belongs.

  request - `com.amazonaws.services.iot.model.UpdateThingGroupsForThingRequest`

  returns: Result of the UpdateThingGroupsForThing operation returned by the service. - `com.amazonaws.services.iot.model.UpdateThingGroupsForThingResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.UpdateThingGroupsForThingResult [^AWSIotClient this ^com.amazonaws.services.iot.model.UpdateThingGroupsForThingRequest request]
    (-> this (.updateThingGroupsForThing request))))

(defn list-role-aliases
  "Lists the role aliases registered in your account.

  request - `com.amazonaws.services.iot.model.ListRoleAliasesRequest`

  returns: Result of the ListRoleAliases operation returned by the service. - `com.amazonaws.services.iot.model.ListRoleAliasesResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListRoleAliasesResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListRoleAliasesRequest request]
    (-> this (.listRoleAliases request))))

(defn attach-principal-policy
  "Deprecated.

  request - `com.amazonaws.services.iot.model.AttachPrincipalPolicyRequest`

  returns: Result of the AttachPrincipalPolicy operation returned by the service. - `com.amazonaws.services.iot.model.AttachPrincipalPolicyResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.AttachPrincipalPolicyResult [^AWSIotClient this ^com.amazonaws.services.iot.model.AttachPrincipalPolicyRequest request]
    (-> this (.attachPrincipalPolicy request))))

(defn list-thing-registration-task-reports
  "Information about the thing registration tasks.

  request - `com.amazonaws.services.iot.model.ListThingRegistrationTaskReportsRequest`

  returns: Result of the ListThingRegistrationTaskReports operation returned by the service. - `com.amazonaws.services.iot.model.ListThingRegistrationTaskReportsResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListThingRegistrationTaskReportsResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListThingRegistrationTaskReportsRequest request]
    (-> this (.listThingRegistrationTaskReports request))))

(defn update-billing-group
  "Updates information about the billing group.

  request - `com.amazonaws.services.iot.model.UpdateBillingGroupRequest`

  returns: Result of the UpdateBillingGroup operation returned by the service. - `com.amazonaws.services.iot.model.UpdateBillingGroupResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.UpdateBillingGroupResult [^AWSIotClient this ^com.amazonaws.services.iot.model.UpdateBillingGroupRequest request]
    (-> this (.updateBillingGroup request))))

(defn describe-account-audit-configuration
  "Gets information about the Device Defender audit settings for this account. Settings include how audit
   notifications are sent and which audit checks are enabled or disabled.

  request - `com.amazonaws.services.iot.model.DescribeAccountAuditConfigurationRequest`

  returns: Result of the DescribeAccountAuditConfiguration operation returned by the service. - `com.amazonaws.services.iot.model.DescribeAccountAuditConfigurationResult`

  throws: com.amazonaws.services.iot.model.ThrottlingException - The rate exceeds the limit."
  (^com.amazonaws.services.iot.model.DescribeAccountAuditConfigurationResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DescribeAccountAuditConfigurationRequest request]
    (-> this (.describeAccountAuditConfiguration request))))

(defn update-stream
  "Updates an existing stream. The stream version will be incremented by one.

  request - `com.amazonaws.services.iot.model.UpdateStreamRequest`

  returns: Result of the UpdateStream operation returned by the service. - `com.amazonaws.services.iot.model.UpdateStreamResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.UpdateStreamResult [^AWSIotClient this ^com.amazonaws.services.iot.model.UpdateStreamRequest request]
    (-> this (.updateStream request))))

(defn list-ota-updates
  "Lists OTA updates.

  request - `com.amazonaws.services.iot.model.ListOTAUpdatesRequest`

  returns: Result of the ListOTAUpdates operation returned by the service. - `com.amazonaws.services.iot.model.ListOTAUpdatesResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListOTAUpdatesResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListOTAUpdatesRequest request]
    (-> this (.listOTAUpdates request))))

(defn get-topic-rule
  "Gets information about the rule.

  request - `com.amazonaws.services.iot.model.GetTopicRuleRequest`

  returns: Result of the GetTopicRule operation returned by the service. - `com.amazonaws.services.iot.model.GetTopicRuleResult`

  throws: com.amazonaws.services.iot.model.InternalException - An unexpected error has occurred."
  (^com.amazonaws.services.iot.model.GetTopicRuleResult [^AWSIotClient this ^com.amazonaws.services.iot.model.GetTopicRuleRequest request]
    (-> this (.getTopicRule request))))

(defn create-thing-type
  "Creates a new thing type.

  request - `com.amazonaws.services.iot.model.CreateThingTypeRequest`

  returns: Result of the CreateThingType operation returned by the service. - `com.amazonaws.services.iot.model.CreateThingTypeResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.CreateThingTypeResult [^AWSIotClient this ^com.amazonaws.services.iot.model.CreateThingTypeRequest request]
    (-> this (.createThingType request))))

(defn update-certificate
  "Updates the status of the specified certificate. This operation is idempotent.


   Moving a certificate from the ACTIVE state (including REVOKED) will not disconnect currently connected devices,
   but these devices will be unable to reconnect.


   The ACTIVE state is required to authenticate devices connecting to AWS IoT using a certificate.

  request - `com.amazonaws.services.iot.model.UpdateCertificateRequest`

  returns: Result of the UpdateCertificate operation returned by the service. - `com.amazonaws.services.iot.model.UpdateCertificateResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.UpdateCertificateResult [^AWSIotClient this ^com.amazonaws.services.iot.model.UpdateCertificateRequest request]
    (-> this (.updateCertificate request))))

(defn get-logging-options
  "Gets the logging options.


   NOTE: use of this command is not recommended. Use GetV2LoggingOptions instead.

  request - `com.amazonaws.services.iot.model.GetLoggingOptionsRequest`

  returns: Result of the GetLoggingOptions operation returned by the service. - `com.amazonaws.services.iot.model.GetLoggingOptionsResult`

  throws: com.amazonaws.services.iot.model.InternalException - An unexpected error has occurred."
  (^com.amazonaws.services.iot.model.GetLoggingOptionsResult [^AWSIotClient this ^com.amazonaws.services.iot.model.GetLoggingOptionsRequest request]
    (-> this (.getLoggingOptions request))))

(defn list-job-executions-for-thing
  "Lists the job executions for the specified thing.

  request - `com.amazonaws.services.iot.model.ListJobExecutionsForThingRequest`

  returns: Result of the ListJobExecutionsForThing operation returned by the service. - `com.amazonaws.services.iot.model.ListJobExecutionsForThingResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListJobExecutionsForThingResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListJobExecutionsForThingRequest request]
    (-> this (.listJobExecutionsForThing request))))

(defn create-thing-group
  "Create a thing group.



   This is a control plane operation. See Authorization for information
   about authorizing control plane actions.

  request - `com.amazonaws.services.iot.model.CreateThingGroupRequest`

  returns: Result of the CreateThingGroup operation returned by the service. - `com.amazonaws.services.iot.model.CreateThingGroupResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.CreateThingGroupResult [^AWSIotClient this ^com.amazonaws.services.iot.model.CreateThingGroupRequest request]
    (-> this (.createThingGroup request))))

(defn remove-thing-from-billing-group
  "Removes the given thing from the billing group.

  request - `com.amazonaws.services.iot.model.RemoveThingFromBillingGroupRequest`

  returns: Result of the RemoveThingFromBillingGroup operation returned by the service. - `com.amazonaws.services.iot.model.RemoveThingFromBillingGroupResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.RemoveThingFromBillingGroupResult [^AWSIotClient this ^com.amazonaws.services.iot.model.RemoveThingFromBillingGroupRequest request]
    (-> this (.removeThingFromBillingGroup request))))

(defn list-policy-principals
  "Deprecated.

  request - `com.amazonaws.services.iot.model.ListPolicyPrincipalsRequest`

  returns: Result of the ListPolicyPrincipals operation returned by the service. - `com.amazonaws.services.iot.model.ListPolicyPrincipalsResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.ListPolicyPrincipalsResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListPolicyPrincipalsRequest request]
    (-> this (.listPolicyPrincipals request))))

(defn create-policy
  "Creates an AWS IoT policy.


   The created policy is the default version for the policy. This operation creates a policy version with a version
   identifier of 1 and sets 1 as the policy's default version.

  request - `com.amazonaws.services.iot.model.CreatePolicyRequest`

  returns: Result of the CreatePolicy operation returned by the service. - `com.amazonaws.services.iot.model.CreatePolicyResult`

  throws: com.amazonaws.services.iot.model.ResourceAlreadyExistsException - The resource already exists."
  (^com.amazonaws.services.iot.model.CreatePolicyResult [^AWSIotClient this ^com.amazonaws.services.iot.model.CreatePolicyRequest request]
    (-> this (.createPolicy request))))

(defn create-authorizer
  "Creates an authorizer.

  request - `com.amazonaws.services.iot.model.CreateAuthorizerRequest`

  returns: Result of the CreateAuthorizer operation returned by the service. - `com.amazonaws.services.iot.model.CreateAuthorizerResult`

  throws: com.amazonaws.services.iot.model.ResourceAlreadyExistsException - The resource already exists."
  (^com.amazonaws.services.iot.model.CreateAuthorizerResult [^AWSIotClient this ^com.amazonaws.services.iot.model.CreateAuthorizerRequest request]
    (-> this (.createAuthorizer request))))

(defn get-effective-policies
  "Gets a list of the policies that have an effect on the authorization behavior of the specified device when it
   connects to the AWS IoT device gateway.

  request - `com.amazonaws.services.iot.model.GetEffectivePoliciesRequest`

  returns: Result of the GetEffectivePolicies operation returned by the service. - `com.amazonaws.services.iot.model.GetEffectivePoliciesResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.GetEffectivePoliciesResult [^AWSIotClient this ^com.amazonaws.services.iot.model.GetEffectivePoliciesRequest request]
    (-> this (.getEffectivePolicies request))))

(defn describe-job-execution
  "Describes a job execution.

  request - `com.amazonaws.services.iot.model.DescribeJobExecutionRequest`

  returns: Result of the DescribeJobExecution operation returned by the service. - `com.amazonaws.services.iot.model.DescribeJobExecutionResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DescribeJobExecutionResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DescribeJobExecutionRequest request]
    (-> this (.describeJobExecution request))))

(defn describe-scheduled-audit
  "Gets information about a scheduled audit.

  request - `com.amazonaws.services.iot.model.DescribeScheduledAuditRequest`

  returns: Result of the DescribeScheduledAudit operation returned by the service. - `com.amazonaws.services.iot.model.DescribeScheduledAuditResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DescribeScheduledAuditResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DescribeScheduledAuditRequest request]
    (-> this (.describeScheduledAudit request))))

(defn list-policies
  "Lists your policies.

  request - `com.amazonaws.services.iot.model.ListPoliciesRequest`

  returns: Result of the ListPolicies operation returned by the service. - `com.amazonaws.services.iot.model.ListPoliciesResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListPoliciesResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListPoliciesRequest request]
    (-> this (.listPolicies request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSIotClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-indices
  "Lists the search indices.

  request - `com.amazonaws.services.iot.model.ListIndicesRequest`

  returns: Result of the ListIndices operation returned by the service. - `com.amazonaws.services.iot.model.ListIndicesResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListIndicesResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListIndicesRequest request]
    (-> this (.listIndices request))))

(defn delete-security-profile
  "Deletes a Device Defender security profile.

  request - `com.amazonaws.services.iot.model.DeleteSecurityProfileRequest`

  returns: Result of the DeleteSecurityProfile operation returned by the service. - `com.amazonaws.services.iot.model.DeleteSecurityProfileResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DeleteSecurityProfileResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DeleteSecurityProfileRequest request]
    (-> this (.deleteSecurityProfile request))))

(defn get-policy-version
  "Gets information about the specified policy version.

  request - `com.amazonaws.services.iot.model.GetPolicyVersionRequest`

  returns: Result of the GetPolicyVersion operation returned by the service. - `com.amazonaws.services.iot.model.GetPolicyVersionResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.GetPolicyVersionResult [^AWSIotClient this ^com.amazonaws.services.iot.model.GetPolicyVersionRequest request]
    (-> this (.getPolicyVersion request))))

(defn list-authorizers
  "Lists the authorizers registered in your account.

  request - `com.amazonaws.services.iot.model.ListAuthorizersRequest`

  returns: Result of the ListAuthorizers operation returned by the service. - `com.amazonaws.services.iot.model.ListAuthorizersResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListAuthorizersResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListAuthorizersRequest request]
    (-> this (.listAuthorizers request))))

(defn describe-security-profile
  "Gets information about a Device Defender security profile.

  request - `com.amazonaws.services.iot.model.DescribeSecurityProfileRequest`

  returns: Result of the DescribeSecurityProfile operation returned by the service. - `com.amazonaws.services.iot.model.DescribeSecurityProfileResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DescribeSecurityProfileResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DescribeSecurityProfileRequest request]
    (-> this (.describeSecurityProfile request))))

(defn create-job
  "Creates a job.

  request - `com.amazonaws.services.iot.model.CreateJobRequest`

  returns: Result of the CreateJob operation returned by the service. - `com.amazonaws.services.iot.model.CreateJobResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.CreateJobResult [^AWSIotClient this ^com.amazonaws.services.iot.model.CreateJobRequest request]
    (-> this (.createJob request))))

(defn delete-topic-rule
  "Deletes the rule.

  request - `com.amazonaws.services.iot.model.DeleteTopicRuleRequest`

  returns: Result of the DeleteTopicRule operation returned by the service. - `com.amazonaws.services.iot.model.DeleteTopicRuleResult`

  throws: com.amazonaws.services.iot.model.InternalException - An unexpected error has occurred."
  (^com.amazonaws.services.iot.model.DeleteTopicRuleResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DeleteTopicRuleRequest request]
    (-> this (.deleteTopicRule request))))

(defn detach-security-profile
  "Disassociates a Device Defender security profile from a thing group or from this account.

  request - `com.amazonaws.services.iot.model.DetachSecurityProfileRequest`

  returns: Result of the DetachSecurityProfile operation returned by the service. - `com.amazonaws.services.iot.model.DetachSecurityProfileResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DetachSecurityProfileResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DetachSecurityProfileRequest request]
    (-> this (.detachSecurityProfile request))))

(defn cancel-job-execution
  "Cancels the execution of a job for a given thing.

  request - `com.amazonaws.services.iot.model.CancelJobExecutionRequest`

  returns: Result of the CancelJobExecution operation returned by the service. - `com.amazonaws.services.iot.model.CancelJobExecutionResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.CancelJobExecutionResult [^AWSIotClient this ^com.amazonaws.services.iot.model.CancelJobExecutionRequest request]
    (-> this (.cancelJobExecution request))))

(defn start-thing-registration-task
  "Creates a bulk thing provisioning task.

  request - `com.amazonaws.services.iot.model.StartThingRegistrationTaskRequest`

  returns: Result of the StartThingRegistrationTask operation returned by the service. - `com.amazonaws.services.iot.model.StartThingRegistrationTaskResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.StartThingRegistrationTaskResult [^AWSIotClient this ^com.amazonaws.services.iot.model.StartThingRegistrationTaskRequest request]
    (-> this (.startThingRegistrationTask request))))

(defn describe-index
  "Describes a search index.

  request - `com.amazonaws.services.iot.model.DescribeIndexRequest`

  returns: Result of the DescribeIndex operation returned by the service. - `com.amazonaws.services.iot.model.DescribeIndexResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DescribeIndexResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DescribeIndexRequest request]
    (-> this (.describeIndex request))))

(defn list-audit-findings
  "Lists the findings (results) of a Device Defender audit or of the audits performed during a specified time
   period. (Findings are retained for 180 days.)

  request - `com.amazonaws.services.iot.model.ListAuditFindingsRequest`

  returns: Result of the ListAuditFindings operation returned by the service. - `com.amazonaws.services.iot.model.ListAuditFindingsResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListAuditFindingsResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListAuditFindingsRequest request]
    (-> this (.listAuditFindings request))))

(defn attach-security-profile
  "Associates a Device Defender security profile with a thing group or with this account. Each thing group or
   account can have up to five security profiles associated with it.

  request - `com.amazonaws.services.iot.model.AttachSecurityProfileRequest`

  returns: Result of the AttachSecurityProfile operation returned by the service. - `com.amazonaws.services.iot.model.AttachSecurityProfileResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.AttachSecurityProfileResult [^AWSIotClient this ^com.amazonaws.services.iot.model.AttachSecurityProfileRequest request]
    (-> this (.attachSecurityProfile request))))

(defn tag-resource
  "Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource.

  request - `com.amazonaws.services.iot.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.iot.model.TagResourceResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.TagResourceResult [^AWSIotClient this ^com.amazonaws.services.iot.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn delete-authorizer
  "Deletes an authorizer.

  request - `com.amazonaws.services.iot.model.DeleteAuthorizerRequest`

  returns: Result of the DeleteAuthorizer operation returned by the service. - `com.amazonaws.services.iot.model.DeleteAuthorizerResult`

  throws: com.amazonaws.services.iot.model.DeleteConflictException - You can't delete the resource because it is attached to one or more resources."
  (^com.amazonaws.services.iot.model.DeleteAuthorizerResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DeleteAuthorizerRequest request]
    (-> this (.deleteAuthorizer request))))

(defn remove-thing-from-thing-group
  "Remove the specified thing from the specified group.

  request - `com.amazonaws.services.iot.model.RemoveThingFromThingGroupRequest`

  returns: Result of the RemoveThingFromThingGroup operation returned by the service. - `com.amazonaws.services.iot.model.RemoveThingFromThingGroupResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.RemoveThingFromThingGroupResult [^AWSIotClient this ^com.amazonaws.services.iot.model.RemoveThingFromThingGroupRequest request]
    (-> this (.removeThingFromThingGroup request))))

(defn create-stream
  "Creates a stream for delivering one or more large files in chunks over MQTT. A stream transports data bytes in
   chunks or blocks packaged as MQTT messages from a source like S3. You can have one or more files associated with
   a stream. The total size of a file associated with the stream cannot exceed more than 2 MB. The stream will be
   created with version 0. If a stream is created with the same streamID as a stream that existed and was deleted
   within last 90 days, we will resurrect that old stream by incrementing the version by 1.

  request - `com.amazonaws.services.iot.model.CreateStreamRequest`

  returns: Result of the CreateStream operation returned by the service. - `com.amazonaws.services.iot.model.CreateStreamResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.CreateStreamResult [^AWSIotClient this ^com.amazonaws.services.iot.model.CreateStreamRequest request]
    (-> this (.createStream request))))

(defn list-scheduled-audits
  "Lists all of your scheduled audits.

  request - `com.amazonaws.services.iot.model.ListScheduledAuditsRequest`

  returns: Result of the ListScheduledAudits operation returned by the service. - `com.amazonaws.services.iot.model.ListScheduledAuditsResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListScheduledAuditsResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListScheduledAuditsRequest request]
    (-> this (.listScheduledAudits request))))

(defn list-things-in-thing-group
  "Lists the things in the specified group.

  request - `com.amazonaws.services.iot.model.ListThingsInThingGroupRequest`

  returns: Result of the ListThingsInThingGroup operation returned by the service. - `com.amazonaws.services.iot.model.ListThingsInThingGroupResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListThingsInThingGroupResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListThingsInThingGroupRequest request]
    (-> this (.listThingsInThingGroup request))))

(defn enable-topic-rule
  "Enables the rule.

  request - `com.amazonaws.services.iot.model.EnableTopicRuleRequest`

  returns: Result of the EnableTopicRule operation returned by the service. - `com.amazonaws.services.iot.model.EnableTopicRuleResult`

  throws: com.amazonaws.services.iot.model.InternalException - An unexpected error has occurred."
  (^com.amazonaws.services.iot.model.EnableTopicRuleResult [^AWSIotClient this ^com.amazonaws.services.iot.model.EnableTopicRuleRequest request]
    (-> this (.enableTopicRule request))))

(defn accept-certificate-transfer
  "Accepts a pending certificate transfer. The default state of the certificate is INACTIVE.


   To check for pending certificate transfers, call ListCertificates to enumerate your certificates.

  request - `com.amazonaws.services.iot.model.AcceptCertificateTransferRequest`

  returns: Result of the AcceptCertificateTransfer operation returned by the service. - `com.amazonaws.services.iot.model.AcceptCertificateTransferResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.AcceptCertificateTransferResult [^AWSIotClient this ^com.amazonaws.services.iot.model.AcceptCertificateTransferRequest request]
    (-> this (.acceptCertificateTransfer request))))

(defn list-targets-for-security-profile
  "Lists the targets (thing groups) associated with a given Device Defender security profile.

  request - `com.amazonaws.services.iot.model.ListTargetsForSecurityProfileRequest`

  returns: Result of the ListTargetsForSecurityProfile operation returned by the service. - `com.amazonaws.services.iot.model.ListTargetsForSecurityProfileResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.ListTargetsForSecurityProfileResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListTargetsForSecurityProfileRequest request]
    (-> this (.listTargetsForSecurityProfile request))))

(defn describe-billing-group
  "Returns information about a billing group.

  request - `com.amazonaws.services.iot.model.DescribeBillingGroupRequest`

  returns: Result of the DescribeBillingGroup operation returned by the service. - `com.amazonaws.services.iot.model.DescribeBillingGroupResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DescribeBillingGroupResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DescribeBillingGroupRequest request]
    (-> this (.describeBillingGroup request))))

(defn get-job-document
  "Gets a job document.

  request - `com.amazonaws.services.iot.model.GetJobDocumentRequest`

  returns: Result of the GetJobDocument operation returned by the service. - `com.amazonaws.services.iot.model.GetJobDocumentResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.GetJobDocumentResult [^AWSIotClient this ^com.amazonaws.services.iot.model.GetJobDocumentRequest request]
    (-> this (.getJobDocument request))))

(defn associate-targets-with-job
  "Associates a group with a continuous job. The following criteria must be met:




   The job must have been created with the targetSelection field set to \"CONTINUOUS\".




   The job status must currently be \"IN_PROGRESS\".




   The total number of targets associated with a job must not exceed 100.

  request - `com.amazonaws.services.iot.model.AssociateTargetsWithJobRequest`

  returns: Result of the AssociateTargetsWithJob operation returned by the service. - `com.amazonaws.services.iot.model.AssociateTargetsWithJobResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.AssociateTargetsWithJobResult [^AWSIotClient this ^com.amazonaws.services.iot.model.AssociateTargetsWithJobRequest request]
    (-> this (.associateTargetsWithJob request))))

(defn detach-thing-principal
  "Detaches the specified principal from the specified thing. A principal can be X.509 certificates, IAM users,
   groups, and roles, Amazon Cognito identities or federated identities.



   This call is asynchronous. It might take several seconds for the detachment to propagate.

  request - `com.amazonaws.services.iot.model.DetachThingPrincipalRequest`

  returns: Result of the DetachThingPrincipal operation returned by the service. - `com.amazonaws.services.iot.model.DetachThingPrincipalResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.DetachThingPrincipalResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DetachThingPrincipalRequest request]
    (-> this (.detachThingPrincipal request))))

(defn create-thing
  "Creates a thing record in the registry. If this call is made multiple times using the same thing name and
   configuration, the call will succeed. If this call is made with the same thing name but different configuration a
   ResourceAlreadyExistsException is thrown.



   This is a control plane operation. See Authorization for information
   about authorizing control plane actions.

  request - `com.amazonaws.services.iot.model.CreateThingRequest`

  returns: Result of the CreateThing operation returned by the service. - `com.amazonaws.services.iot.model.CreateThingResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.CreateThingResult [^AWSIotClient this ^com.amazonaws.services.iot.model.CreateThingRequest request]
    (-> this (.createThing request))))

(defn list-principal-policies
  "Deprecated.

  request - `com.amazonaws.services.iot.model.ListPrincipalPoliciesRequest`

  returns: Result of the ListPrincipalPolicies operation returned by the service. - `com.amazonaws.services.iot.model.ListPrincipalPoliciesResult`

  throws: com.amazonaws.services.iot.model.ResourceNotFoundException - The specified resource does not exist."
  (^com.amazonaws.services.iot.model.ListPrincipalPoliciesResult [^AWSIotClient this ^com.amazonaws.services.iot.model.ListPrincipalPoliciesRequest request]
    (-> this (.listPrincipalPolicies request))))

(defn describe-thing-group
  "Describe a thing group.

  request - `com.amazonaws.services.iot.model.DescribeThingGroupRequest`

  returns: Result of the DescribeThingGroup operation returned by the service. - `com.amazonaws.services.iot.model.DescribeThingGroupResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DescribeThingGroupResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DescribeThingGroupRequest request]
    (-> this (.describeThingGroup request))))

(defn get-registration-code
  "Gets a registration code used to register a CA certificate with AWS IoT.

  request - `com.amazonaws.services.iot.model.GetRegistrationCodeRequest`

  returns: Result of the GetRegistrationCode operation returned by the service. - `com.amazonaws.services.iot.model.GetRegistrationCodeResult`

  throws: com.amazonaws.services.iot.model.ThrottlingException - The rate exceeds the limit."
  (^com.amazonaws.services.iot.model.GetRegistrationCodeResult [^AWSIotClient this ^com.amazonaws.services.iot.model.GetRegistrationCodeRequest request]
    (-> this (.getRegistrationCode request))))

(defn delete-account-audit-configuration
  "Restores the default settings for Device Defender audits for this account. Any configuration data you entered is
   deleted and all audit checks are reset to disabled.

  request - `com.amazonaws.services.iot.model.DeleteAccountAuditConfigurationRequest`

  returns: Result of the DeleteAccountAuditConfiguration operation returned by the service. - `com.amazonaws.services.iot.model.DeleteAccountAuditConfigurationResult`

  throws: com.amazonaws.services.iot.model.InvalidRequestException - The request is not valid."
  (^com.amazonaws.services.iot.model.DeleteAccountAuditConfigurationResult [^AWSIotClient this ^com.amazonaws.services.iot.model.DeleteAccountAuditConfigurationRequest request]
    (-> this (.deleteAccountAuditConfiguration request))))

