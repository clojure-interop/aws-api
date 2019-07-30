(ns com.amazonaws.services.cloudhsm.AWSCloudHSMClient
  "Client for accessing CloudHSM. All service calls made using this client are blocking, and will not return until the
  service call completes.

  AWS CloudHSM Service

  This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


  For information about the current version of AWS CloudHSM, see AWS
  CloudHSM, the AWS CloudHSM User Guide, and
  the AWS CloudHSM API Reference."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudhsm AWSCloudHSMClient]))

(defn ->aws-cloud-hsm-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to CloudHSM (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AWSCloudHSMClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AWSCloudHSMClient aws-credentials-provider client-configuration request-metric-collector))
  (^AWSCloudHSMClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSCloudHSMClient aws-credentials client-configuration))
  (^AWSCloudHSMClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSCloudHSMClient client-configuration))
  (^AWSCloudHSMClient []
    (new AWSCloudHSMClient )))

(defn *builder
  "returns: `com.amazonaws.services.cloudhsm.AWSCloudHSMClientBuilder`"
  (^com.amazonaws.services.cloudhsm.AWSCloudHSMClientBuilder []
    (AWSCloudHSMClient/builder )))

(defn delete-hapg
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Deletes a high-availability partition group.

  request - `com.amazonaws.services.cloudhsm.model.DeleteHapgRequest`

  returns: Result of the DeleteHapg operation returned by the service. - `com.amazonaws.services.cloudhsm.model.DeleteHapgResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.DeleteHapgResult [^AWSCloudHSMClient this ^com.amazonaws.services.cloudhsm.model.DeleteHapgRequest request]
    (-> this (.deleteHapg request))))

(defn create-hapg
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Creates a high-availability partition group. A high-availability partition group is a group of partitions that
   spans multiple physical HSMs.

  request - `com.amazonaws.services.cloudhsm.model.CreateHapgRequest`

  returns: Result of the CreateHapg operation returned by the service. - `com.amazonaws.services.cloudhsm.model.CreateHapgResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.CreateHapgResult [^AWSCloudHSMClient this ^com.amazonaws.services.cloudhsm.model.CreateHapgRequest request]
    (-> this (.createHapg request))))

(defn list-tags-for-resource
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Returns a list of all tags for the specified AWS CloudHSM resource.

  request - `com.amazonaws.services.cloudhsm.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.cloudhsm.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.ListTagsForResourceResult [^AWSCloudHSMClient this ^com.amazonaws.services.cloudhsm.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn describe-hapg
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Retrieves information about a high-availability partition group.

  request - `com.amazonaws.services.cloudhsm.model.DescribeHapgRequest`

  returns: Result of the DescribeHapg operation returned by the service. - `com.amazonaws.services.cloudhsm.model.DescribeHapgResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.DescribeHapgResult [^AWSCloudHSMClient this ^com.amazonaws.services.cloudhsm.model.DescribeHapgRequest request]
    (-> this (.describeHapg request))))

(defn delete-luna-client
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Deletes a client.

  request - `com.amazonaws.services.cloudhsm.model.DeleteLunaClientRequest`

  returns: Result of the DeleteLunaClient operation returned by the service. - `com.amazonaws.services.cloudhsm.model.DeleteLunaClientResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.DeleteLunaClientResult [^AWSCloudHSMClient this ^com.amazonaws.services.cloudhsm.model.DeleteLunaClientRequest request]
    (-> this (.deleteLunaClient request))))

(defn modify-hapg
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Modifies an existing high-availability partition group.

  request - `com.amazonaws.services.cloudhsm.model.ModifyHapgRequest`

  returns: Result of the ModifyHapg operation returned by the service. - `com.amazonaws.services.cloudhsm.model.ModifyHapgResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.ModifyHapgResult [^AWSCloudHSMClient this ^com.amazonaws.services.cloudhsm.model.ModifyHapgRequest request]
    (-> this (.modifyHapg request))))

(defn modify-hsm
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Modifies an HSM.



   This operation can result in the HSM being offline for up to 15 minutes while the AWS CloudHSM service is
   reconfigured. If you are modifying a production HSM, you should ensure that your AWS CloudHSM service is
   configured for high availability, and consider executing this operation during a maintenance window.

  request - `com.amazonaws.services.cloudhsm.model.ModifyHsmRequest`

  returns: Result of the ModifyHsm operation returned by the service. - `com.amazonaws.services.cloudhsm.model.ModifyHsmResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.ModifyHsmResult [^AWSCloudHSMClient this ^com.amazonaws.services.cloudhsm.model.ModifyHsmRequest request]
    (-> this (.modifyHsm request))))

(defn describe-luna-client
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Retrieves information about an HSM client.

  request - `com.amazonaws.services.cloudhsm.model.DescribeLunaClientRequest`

  returns: Result of the DescribeLunaClient operation returned by the service. - `com.amazonaws.services.cloudhsm.model.DescribeLunaClientResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.DescribeLunaClientResult [^AWSCloudHSMClient this ^com.amazonaws.services.cloudhsm.model.DescribeLunaClientRequest request]
    (-> this (.describeLunaClient request)))
  (^com.amazonaws.services.cloudhsm.model.DescribeLunaClientResult [^AWSCloudHSMClient this]
    (-> this (.describeLunaClient))))

(defn list-hapgs
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Lists the high-availability partition groups for the account.


   This operation supports pagination with the use of the NextToken member. If more results are
   available, the NextToken member of the response contains a token that you pass in the next call to
   ListHapgs to retrieve the next set of items.

  request - `com.amazonaws.services.cloudhsm.model.ListHapgsRequest`

  returns: Result of the ListHapgs operation returned by the service. - `com.amazonaws.services.cloudhsm.model.ListHapgsResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.ListHapgsResult [^AWSCloudHSMClient this ^com.amazonaws.services.cloudhsm.model.ListHapgsRequest request]
    (-> this (.listHapgs request)))
  (^com.amazonaws.services.cloudhsm.model.ListHapgsResult [^AWSCloudHSMClient this]
    (-> this (.listHapgs))))

(defn create-luna-client
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Creates an HSM client.

  request - `com.amazonaws.services.cloudhsm.model.CreateLunaClientRequest`

  returns: Result of the CreateLunaClient operation returned by the service. - `com.amazonaws.services.cloudhsm.model.CreateLunaClientResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.CreateLunaClientResult [^AWSCloudHSMClient this ^com.amazonaws.services.cloudhsm.model.CreateLunaClientRequest request]
    (-> this (.createLunaClient request))))

(defn create-hsm
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Creates an uninitialized HSM instance.


   There is an upfront fee charged for each HSM instance that you create with the CreateHsm operation.
   If you accidentally provision an HSM and want to request a refund, delete the instance using the DeleteHsm
   operation, go to the AWS Support Center, create a new
   case, and select Account and Billing Support.



   It can take up to 20 minutes to create and provision an HSM. You can monitor the status of the HSM with the
   DescribeHsm operation. The HSM is ready to be initialized when the status changes to RUNNING.

  request - `com.amazonaws.services.cloudhsm.model.CreateHsmRequest`

  returns: Result of the CreateHsm operation returned by the service. - `com.amazonaws.services.cloudhsm.model.CreateHsmResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.CreateHsmResult [^AWSCloudHSMClient this ^com.amazonaws.services.cloudhsm.model.CreateHsmRequest request]
    (-> this (.createHsm request))))

(defn delete-hsm
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Deletes an HSM. After completion, this operation cannot be undone and your key material cannot be recovered.

  request - `com.amazonaws.services.cloudhsm.model.DeleteHsmRequest`

  returns: Result of the DeleteHsm operation returned by the service. - `com.amazonaws.services.cloudhsm.model.DeleteHsmResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.DeleteHsmResult [^AWSCloudHSMClient this ^com.amazonaws.services.cloudhsm.model.DeleteHsmRequest request]
    (-> this (.deleteHsm request))))

(defn describe-hsm
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Retrieves information about an HSM. You can identify the HSM by its ARN or its serial number.

  request - `com.amazonaws.services.cloudhsm.model.DescribeHsmRequest`

  returns: Result of the DescribeHsm operation returned by the service. - `com.amazonaws.services.cloudhsm.model.DescribeHsmResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.DescribeHsmResult [^AWSCloudHSMClient this ^com.amazonaws.services.cloudhsm.model.DescribeHsmRequest request]
    (-> this (.describeHsm request)))
  (^com.amazonaws.services.cloudhsm.model.DescribeHsmResult [^AWSCloudHSMClient this]
    (-> this (.describeHsm))))

(defn remove-tags-from-resource
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Removes one or more tags from the specified AWS CloudHSM resource.


   To remove a tag, specify only the tag key to remove (not the value). To overwrite the value for an existing tag,
   use AddTagsToResource.

  request - `com.amazonaws.services.cloudhsm.model.RemoveTagsFromResourceRequest`

  returns: Result of the RemoveTagsFromResource operation returned by the service. - `com.amazonaws.services.cloudhsm.model.RemoveTagsFromResourceResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.RemoveTagsFromResourceResult [^AWSCloudHSMClient this ^com.amazonaws.services.cloudhsm.model.RemoveTagsFromResourceRequest request]
    (-> this (.removeTagsFromResource request))))

(defn list-hsms
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Retrieves the identifiers of all of the HSMs provisioned for the current customer.


   This operation supports pagination with the use of the NextToken member. If more results are
   available, the NextToken member of the response contains a token that you pass in the next call to
   ListHsms to retrieve the next set of items.

  request - `com.amazonaws.services.cloudhsm.model.ListHsmsRequest`

  returns: Result of the ListHsms operation returned by the service. - `com.amazonaws.services.cloudhsm.model.ListHsmsResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.ListHsmsResult [^AWSCloudHSMClient this ^com.amazonaws.services.cloudhsm.model.ListHsmsRequest request]
    (-> this (.listHsms request)))
  (^com.amazonaws.services.cloudhsm.model.ListHsmsResult [^AWSCloudHSMClient this]
    (-> this (.listHsms))))

(defn modify-luna-client
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Modifies the certificate used by the client.


   This action can potentially start a workflow to install the new certificate on the client's HSMs.

  request - `com.amazonaws.services.cloudhsm.model.ModifyLunaClientRequest`

  returns: Result of the ModifyLunaClient operation returned by the service. - `com.amazonaws.services.cloudhsm.model.ModifyLunaClientResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.ModifyLunaClientResult [^AWSCloudHSMClient this ^com.amazonaws.services.cloudhsm.model.ModifyLunaClientRequest request]
    (-> this (.modifyLunaClient request))))

(defn add-tags-to-resource
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Adds or overwrites one or more tags for the specified AWS CloudHSM resource.


   Each tag consists of a key and a value. Tag keys must be unique to each resource.

  request - `com.amazonaws.services.cloudhsm.model.AddTagsToResourceRequest`

  returns: Result of the AddTagsToResource operation returned by the service. - `com.amazonaws.services.cloudhsm.model.AddTagsToResourceResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.AddTagsToResourceResult [^AWSCloudHSMClient this ^com.amazonaws.services.cloudhsm.model.AddTagsToResourceRequest request]
    (-> this (.addTagsToResource request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSCloudHSMClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-config
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Gets the configuration files necessary to connect to all high availability partition groups the client is
   associated with.

  request - `com.amazonaws.services.cloudhsm.model.GetConfigRequest`

  returns: Result of the GetConfig operation returned by the service. - `com.amazonaws.services.cloudhsm.model.GetConfigResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.GetConfigResult [^AWSCloudHSMClient this ^com.amazonaws.services.cloudhsm.model.GetConfigRequest request]
    (-> this (.getConfig request))))

(defn list-luna-clients
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Lists all of the clients.


   This operation supports pagination with the use of the NextToken member. If more results are
   available, the NextToken member of the response contains a token that you pass in the next call to
   ListLunaClients to retrieve the next set of items.

  request - `com.amazonaws.services.cloudhsm.model.ListLunaClientsRequest`

  returns: Result of the ListLunaClients operation returned by the service. - `com.amazonaws.services.cloudhsm.model.ListLunaClientsResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.ListLunaClientsResult [^AWSCloudHSMClient this ^com.amazonaws.services.cloudhsm.model.ListLunaClientsRequest request]
    (-> this (.listLunaClients request)))
  (^com.amazonaws.services.cloudhsm.model.ListLunaClientsResult [^AWSCloudHSMClient this]
    (-> this (.listLunaClients))))

(defn list-available-zones
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Lists the Availability Zones that have available AWS CloudHSM capacity.

  request - `com.amazonaws.services.cloudhsm.model.ListAvailableZonesRequest`

  returns: Result of the ListAvailableZones operation returned by the service. - `com.amazonaws.services.cloudhsm.model.ListAvailableZonesResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.ListAvailableZonesResult [^AWSCloudHSMClient this ^com.amazonaws.services.cloudhsm.model.ListAvailableZonesRequest request]
    (-> this (.listAvailableZones request)))
  (^com.amazonaws.services.cloudhsm.model.ListAvailableZonesResult [^AWSCloudHSMClient this]
    (-> this (.listAvailableZones))))

