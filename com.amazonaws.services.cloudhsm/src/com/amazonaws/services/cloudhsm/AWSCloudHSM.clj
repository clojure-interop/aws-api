(ns com.amazonaws.services.cloudhsm.AWSCloudHSM
  "Interface for accessing CloudHSM.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSCloudHSM instead.


  AWS CloudHSM Service

  This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


  For information about the current version of AWS CloudHSM, see AWS
  CloudHSM, the AWS CloudHSM User Guide, and
  the AWS CloudHSM API Reference."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudhsm AWSCloudHSM]))

(defn delete-hapg
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Deletes a high-availability partition group.

  delete-hapg-request - Contains the inputs for the DeleteHapg action. - `com.amazonaws.services.cloudhsm.model.DeleteHapgRequest`

  returns: Result of the DeleteHapg operation returned by the service. - `com.amazonaws.services.cloudhsm.model.DeleteHapgResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.DeleteHapgResult [^AWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.DeleteHapgRequest delete-hapg-request]
    (-> this (.deleteHapg delete-hapg-request))))

(defn create-hapg
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Creates a high-availability partition group. A high-availability partition group is a group of partitions that
   spans multiple physical HSMs.

  create-hapg-request - Contains the inputs for the CreateHapgRequest action. - `com.amazonaws.services.cloudhsm.model.CreateHapgRequest`

  returns: Result of the CreateHapg operation returned by the service. - `com.amazonaws.services.cloudhsm.model.CreateHapgResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.CreateHapgResult [^AWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.CreateHapgRequest create-hapg-request]
    (-> this (.createHapg create-hapg-request))))

(defn list-tags-for-resource
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Returns a list of all tags for the specified AWS CloudHSM resource.

  list-tags-for-resource-request - `com.amazonaws.services.cloudhsm.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.cloudhsm.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.ListTagsForResourceResult [^AWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AWSCloudHSM this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn describe-hapg
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Retrieves information about a high-availability partition group.

  describe-hapg-request - Contains the inputs for the DescribeHapg action. - `com.amazonaws.services.cloudhsm.model.DescribeHapgRequest`

  returns: Result of the DescribeHapg operation returned by the service. - `com.amazonaws.services.cloudhsm.model.DescribeHapgResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.DescribeHapgResult [^AWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.DescribeHapgRequest describe-hapg-request]
    (-> this (.describeHapg describe-hapg-request))))

(defn delete-luna-client
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Deletes a client.

  delete-luna-client-request - `com.amazonaws.services.cloudhsm.model.DeleteLunaClientRequest`

  returns: Result of the DeleteLunaClient operation returned by the service. - `com.amazonaws.services.cloudhsm.model.DeleteLunaClientResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.DeleteLunaClientResult [^AWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.DeleteLunaClientRequest delete-luna-client-request]
    (-> this (.deleteLunaClient delete-luna-client-request))))

(defn modify-hapg
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Modifies an existing high-availability partition group.

  modify-hapg-request - `com.amazonaws.services.cloudhsm.model.ModifyHapgRequest`

  returns: Result of the ModifyHapg operation returned by the service. - `com.amazonaws.services.cloudhsm.model.ModifyHapgResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.ModifyHapgResult [^AWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.ModifyHapgRequest modify-hapg-request]
    (-> this (.modifyHapg modify-hapg-request))))

(defn modify-hsm
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Modifies an HSM.



   This operation can result in the HSM being offline for up to 15 minutes while the AWS CloudHSM service is
   reconfigured. If you are modifying a production HSM, you should ensure that your AWS CloudHSM service is
   configured for high availability, and consider executing this operation during a maintenance window.

  modify-hsm-request - Contains the inputs for the ModifyHsm operation. - `com.amazonaws.services.cloudhsm.model.ModifyHsmRequest`

  returns: Result of the ModifyHsm operation returned by the service. - `com.amazonaws.services.cloudhsm.model.ModifyHsmResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.ModifyHsmResult [^AWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.ModifyHsmRequest modify-hsm-request]
    (-> this (.modifyHsm modify-hsm-request))))

(defn describe-luna-client
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Retrieves information about an HSM client.

  describe-luna-client-request - `com.amazonaws.services.cloudhsm.model.DescribeLunaClientRequest`

  returns: Result of the DescribeLunaClient operation returned by the service. - `com.amazonaws.services.cloudhsm.model.DescribeLunaClientResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.DescribeLunaClientResult [^AWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.DescribeLunaClientRequest describe-luna-client-request]
    (-> this (.describeLunaClient describe-luna-client-request)))
  (^com.amazonaws.services.cloudhsm.model.DescribeLunaClientResult [^AWSCloudHSM this]
    (-> this (.describeLunaClient))))

(defn list-hapgs
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Lists the high-availability partition groups for the account.


   This operation supports pagination with the use of the NextToken member. If more results are
   available, the NextToken member of the response contains a token that you pass in the next call to
   ListHapgs to retrieve the next set of items.

  list-hapgs-request - `com.amazonaws.services.cloudhsm.model.ListHapgsRequest`

  returns: Result of the ListHapgs operation returned by the service. - `com.amazonaws.services.cloudhsm.model.ListHapgsResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.ListHapgsResult [^AWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.ListHapgsRequest list-hapgs-request]
    (-> this (.listHapgs list-hapgs-request)))
  (^com.amazonaws.services.cloudhsm.model.ListHapgsResult [^AWSCloudHSM this]
    (-> this (.listHapgs))))

(defn create-luna-client
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Creates an HSM client.

  create-luna-client-request - Contains the inputs for the CreateLunaClient action. - `com.amazonaws.services.cloudhsm.model.CreateLunaClientRequest`

  returns: Result of the CreateLunaClient operation returned by the service. - `com.amazonaws.services.cloudhsm.model.CreateLunaClientResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.CreateLunaClientResult [^AWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.CreateLunaClientRequest create-luna-client-request]
    (-> this (.createLunaClient create-luna-client-request))))

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

  create-hsm-request - Contains the inputs for the CreateHsm operation. - `com.amazonaws.services.cloudhsm.model.CreateHsmRequest`

  returns: Result of the CreateHsm operation returned by the service. - `com.amazonaws.services.cloudhsm.model.CreateHsmResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.CreateHsmResult [^AWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.CreateHsmRequest create-hsm-request]
    (-> this (.createHsm create-hsm-request))))

(defn delete-hsm
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Deletes an HSM. After completion, this operation cannot be undone and your key material cannot be recovered.

  delete-hsm-request - Contains the inputs for the DeleteHsm operation. - `com.amazonaws.services.cloudhsm.model.DeleteHsmRequest`

  returns: Result of the DeleteHsm operation returned by the service. - `com.amazonaws.services.cloudhsm.model.DeleteHsmResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.DeleteHsmResult [^AWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.DeleteHsmRequest delete-hsm-request]
    (-> this (.deleteHsm delete-hsm-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSCloudHSM this]
    (-> this (.shutdown))))

(defn describe-hsm
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Retrieves information about an HSM. You can identify the HSM by its ARN or its serial number.

  describe-hsm-request - Contains the inputs for the DescribeHsm operation. - `com.amazonaws.services.cloudhsm.model.DescribeHsmRequest`

  returns: Result of the DescribeHsm operation returned by the service. - `com.amazonaws.services.cloudhsm.model.DescribeHsmResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.DescribeHsmResult [^AWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.DescribeHsmRequest describe-hsm-request]
    (-> this (.describeHsm describe-hsm-request)))
  (^com.amazonaws.services.cloudhsm.model.DescribeHsmResult [^AWSCloudHSM this]
    (-> this (.describeHsm))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"cloudhsm.us-east-1.amazonaws.com/\") or a full URL, including the protocol (ex: \"https://cloudhsm.us-east-1.amazonaws.com/\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AWSCloudHSM this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn remove-tags-from-resource
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Removes one or more tags from the specified AWS CloudHSM resource.


   To remove a tag, specify only the tag key to remove (not the value). To overwrite the value for an existing tag,
   use AddTagsToResource.

  remove-tags-from-resource-request - `com.amazonaws.services.cloudhsm.model.RemoveTagsFromResourceRequest`

  returns: Result of the RemoveTagsFromResource operation returned by the service. - `com.amazonaws.services.cloudhsm.model.RemoveTagsFromResourceResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.RemoveTagsFromResourceResult [^AWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.RemoveTagsFromResourceRequest remove-tags-from-resource-request]
    (-> this (.removeTagsFromResource remove-tags-from-resource-request))))

(defn list-hsms
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Retrieves the identifiers of all of the HSMs provisioned for the current customer.


   This operation supports pagination with the use of the NextToken member. If more results are
   available, the NextToken member of the response contains a token that you pass in the next call to
   ListHsms to retrieve the next set of items.

  list-hsms-request - `com.amazonaws.services.cloudhsm.model.ListHsmsRequest`

  returns: Result of the ListHsms operation returned by the service. - `com.amazonaws.services.cloudhsm.model.ListHsmsResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.ListHsmsResult [^AWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.ListHsmsRequest list-hsms-request]
    (-> this (.listHsms list-hsms-request)))
  (^com.amazonaws.services.cloudhsm.model.ListHsmsResult [^AWSCloudHSM this]
    (-> this (.listHsms))))

(defn modify-luna-client
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Modifies the certificate used by the client.


   This action can potentially start a workflow to install the new certificate on the client's HSMs.

  modify-luna-client-request - `com.amazonaws.services.cloudhsm.model.ModifyLunaClientRequest`

  returns: Result of the ModifyLunaClient operation returned by the service. - `com.amazonaws.services.cloudhsm.model.ModifyLunaClientResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.ModifyLunaClientResult [^AWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.ModifyLunaClientRequest modify-luna-client-request]
    (-> this (.modifyLunaClient modify-luna-client-request))))

(defn add-tags-to-resource
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Adds or overwrites one or more tags for the specified AWS CloudHSM resource.


   Each tag consists of a key and a value. Tag keys must be unique to each resource.

  add-tags-to-resource-request - `com.amazonaws.services.cloudhsm.model.AddTagsToResourceRequest`

  returns: Result of the AddTagsToResource operation returned by the service. - `com.amazonaws.services.cloudhsm.model.AddTagsToResourceResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.AddTagsToResourceResult [^AWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.AddTagsToResourceRequest add-tags-to-resource-request]
    (-> this (.addTagsToResource add-tags-to-resource-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSCloudHSM this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-config
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Gets the configuration files necessary to connect to all high availability partition groups the client is
   associated with.

  get-config-request - `com.amazonaws.services.cloudhsm.model.GetConfigRequest`

  returns: Result of the GetConfig operation returned by the service. - `com.amazonaws.services.cloudhsm.model.GetConfigResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.GetConfigResult [^AWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.GetConfigRequest get-config-request]
    (-> this (.getConfig get-config-request))))

(defn list-luna-clients
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Lists all of the clients.


   This operation supports pagination with the use of the NextToken member. If more results are
   available, the NextToken member of the response contains a token that you pass in the next call to
   ListLunaClients to retrieve the next set of items.

  list-luna-clients-request - `com.amazonaws.services.cloudhsm.model.ListLunaClientsRequest`

  returns: Result of the ListLunaClients operation returned by the service. - `com.amazonaws.services.cloudhsm.model.ListLunaClientsResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.ListLunaClientsResult [^AWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.ListLunaClientsRequest list-luna-clients-request]
    (-> this (.listLunaClients list-luna-clients-request)))
  (^com.amazonaws.services.cloudhsm.model.ListLunaClientsResult [^AWSCloudHSM this]
    (-> this (.listLunaClients))))

(defn list-available-zones
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Lists the Availability Zones that have available AWS CloudHSM capacity.

  list-available-zones-request - Contains the inputs for the ListAvailableZones action. - `com.amazonaws.services.cloudhsm.model.ListAvailableZonesRequest`

  returns: Result of the ListAvailableZones operation returned by the service. - `com.amazonaws.services.cloudhsm.model.ListAvailableZonesResult`

  throws: com.amazonaws.services.cloudhsm.model.CloudHsmServiceException - Indicates that an exception occurred in the AWS CloudHSM service."
  (^com.amazonaws.services.cloudhsm.model.ListAvailableZonesResult [^AWSCloudHSM this ^com.amazonaws.services.cloudhsm.model.ListAvailableZonesRequest list-available-zones-request]
    (-> this (.listAvailableZones list-available-zones-request)))
  (^com.amazonaws.services.cloudhsm.model.ListAvailableZonesResult [^AWSCloudHSM this]
    (-> this (.listAvailableZones))))

