(ns com.amazonaws.services.elasticsearch.AWSElasticsearch
  "Interface for accessing Amazon Elasticsearch Service.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSElasticsearch instead.


  Amazon Elasticsearch Configuration Service

  Use the Amazon Elasticsearch configuration API to create, configure, and manage Elasticsearch domains.


  The endpoint for configuration service requests is region-specific: es.region.amazonaws.com. For example,
  es.us-east-1.amazonaws.com. For a current list of supported regions and endpoints, see Regions
  and Endpoints."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.elasticsearch AWSElasticsearch]))

(defn get-upgrade-status
  "Retrieves the latest status of the last upgrade or upgrade eligibility check that was performed on the domain.

  get-upgrade-status-request - Container for request parameters to GetUpgradeStatus operation. - `com.amazonaws.services.elasticsearch.model.GetUpgradeStatusRequest`

  returns: Result of the GetUpgradeStatus operation returned by the service. - `com.amazonaws.services.elasticsearch.model.GetUpgradeStatusResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.GetUpgradeStatusResult [^AWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.GetUpgradeStatusRequest get-upgrade-status-request]
    (-> this (.getUpgradeStatus get-upgrade-status-request))))

(defn add-tags
  "Attaches tags to an existing Elasticsearch domain. Tags are a set of case-sensitive key value pairs. An
   Elasticsearch domain may have up to 10 tags. See  Tagging Amazon Elasticsearch Service Domains for more information.

  add-tags-request - Container for the parameters to the AddTags operation. Specify the tags that you want to attach to the Elasticsearch domain. - `com.amazonaws.services.elasticsearch.model.AddTagsRequest`

  returns: Result of the AddTags operation returned by the service. - `com.amazonaws.services.elasticsearch.model.AddTagsResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.AddTagsResult [^AWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.AddTagsRequest add-tags-request]
    (-> this (.addTags add-tags-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AWSElasticsearch this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn describe-reserved-elasticsearch-instance-offerings
  "Lists available reserved Elasticsearch instance offerings.

  describe-reserved-elasticsearch-instance-offerings-request - Container for parameters to DescribeReservedElasticsearchInstanceOfferings - `com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstanceOfferingsRequest`

  returns: Result of the DescribeReservedElasticsearchInstanceOfferings operation returned by the service. - `com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstanceOfferingsResult`

  throws: com.amazonaws.services.elasticsearch.model.ResourceNotFoundException - An exception for accessing or deleting a resource that does not exist. Gives http status code of 400."
  (^com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstanceOfferingsResult [^AWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstanceOfferingsRequest describe-reserved-elasticsearch-instance-offerings-request]
    (-> this (.describeReservedElasticsearchInstanceOfferings describe-reserved-elasticsearch-instance-offerings-request))))

(defn describe-elasticsearch-domain-config
  "Provides cluster configuration information about the specified Elasticsearch domain, such as the state, creation
   date, update version, and update date for cluster options.

  describe-elasticsearch-domain-config-request - Container for the parameters to the DescribeElasticsearchDomainConfig operation. Specifies the domain name for which you want configuration information. - `com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainConfigRequest`

  returns: Result of the DescribeElasticsearchDomainConfig operation returned by the service. - `com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainConfigResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainConfigResult [^AWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainConfigRequest describe-elasticsearch-domain-config-request]
    (-> this (.describeElasticsearchDomainConfig describe-elasticsearch-domain-config-request))))

(defn purchase-reserved-elasticsearch-instance-offering
  "Allows you to purchase reserved Elasticsearch instances.

  purchase-reserved-elasticsearch-instance-offering-request - Container for parameters to PurchaseReservedElasticsearchInstanceOffering - `com.amazonaws.services.elasticsearch.model.PurchaseReservedElasticsearchInstanceOfferingRequest`

  returns: Result of the PurchaseReservedElasticsearchInstanceOffering operation returned by the service. - `com.amazonaws.services.elasticsearch.model.PurchaseReservedElasticsearchInstanceOfferingResult`

  throws: com.amazonaws.services.elasticsearch.model.ResourceNotFoundException - An exception for accessing or deleting a resource that does not exist. Gives http status code of 400."
  (^com.amazonaws.services.elasticsearch.model.PurchaseReservedElasticsearchInstanceOfferingResult [^AWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.PurchaseReservedElasticsearchInstanceOfferingRequest purchase-reserved-elasticsearch-instance-offering-request]
    (-> this (.purchaseReservedElasticsearchInstanceOffering purchase-reserved-elasticsearch-instance-offering-request))))

(defn list-tags
  "Returns all tags for the given Elasticsearch domain.

  list-tags-request - Container for the parameters to the ListTags operation. Specify the ARN for the Elasticsearch domain to which the tags are attached that you want to view are attached. - `com.amazonaws.services.elasticsearch.model.ListTagsRequest`

  returns: Result of the ListTags operation returned by the service. - `com.amazonaws.services.elasticsearch.model.ListTagsResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.ListTagsResult [^AWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.ListTagsRequest list-tags-request]
    (-> this (.listTags list-tags-request))))

(defn list-elasticsearch-versions
  "List all supported Elasticsearch versions

  list-elasticsearch-versions-request - Container for the parameters to the ListElasticsearchVersions operation. Use MaxResults to control the maximum number of results to retrieve in a single call. Use NextToken in response to retrieve more results. If the received response does not contain a NextToken, then there are no more results to retrieve. - `com.amazonaws.services.elasticsearch.model.ListElasticsearchVersionsRequest`

  returns: Result of the ListElasticsearchVersions operation returned by the service. - `com.amazonaws.services.elasticsearch.model.ListElasticsearchVersionsResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.ListElasticsearchVersionsResult [^AWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.ListElasticsearchVersionsRequest list-elasticsearch-versions-request]
    (-> this (.listElasticsearchVersions list-elasticsearch-versions-request))))

(defn remove-tags
  "Removes the specified set of tags from the specified Elasticsearch domain.

  remove-tags-request - Container for the parameters to the RemoveTags operation. Specify the ARN for the Elasticsearch domain from which you want to remove the specified TagKey. - `com.amazonaws.services.elasticsearch.model.RemoveTagsRequest`

  returns: Result of the RemoveTags operation returned by the service. - `com.amazonaws.services.elasticsearch.model.RemoveTagsResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.RemoveTagsResult [^AWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.RemoveTagsRequest remove-tags-request]
    (-> this (.removeTags remove-tags-request))))

(defn create-elasticsearch-domain
  "Creates a new Elasticsearch domain. For more information, see Creating Elasticsearch Domains in the Amazon Elasticsearch Service Developer Guide.

  create-elasticsearch-domain-request - `com.amazonaws.services.elasticsearch.model.CreateElasticsearchDomainRequest`

  returns: Result of the CreateElasticsearchDomain operation returned by the service. - `com.amazonaws.services.elasticsearch.model.CreateElasticsearchDomainResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.CreateElasticsearchDomainResult [^AWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.CreateElasticsearchDomainRequest create-elasticsearch-domain-request]
    (-> this (.createElasticsearchDomain create-elasticsearch-domain-request))))

(defn upgrade-elasticsearch-domain
  "Allows you to either upgrade your domain or perform an Upgrade eligibility check to a compatible Elasticsearch
   version.

  upgrade-elasticsearch-domain-request - Container for request parameters to UpgradeElasticsearchDomain operation. - `com.amazonaws.services.elasticsearch.model.UpgradeElasticsearchDomainRequest`

  returns: Result of the UpgradeElasticsearchDomain operation returned by the service. - `com.amazonaws.services.elasticsearch.model.UpgradeElasticsearchDomainResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.UpgradeElasticsearchDomainResult [^AWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.UpgradeElasticsearchDomainRequest upgrade-elasticsearch-domain-request]
    (-> this (.upgradeElasticsearchDomain upgrade-elasticsearch-domain-request))))

(defn delete-elasticsearch-service-role
  "Deletes the service-linked role that Elasticsearch Service uses to manage and maintain VPC domains. Role deletion
   will fail if any existing VPC domains use the role. You must delete any such Elasticsearch domains before
   deleting the role. See Deleting Elasticsearch Service Role in VPC Endpoints for Amazon Elasticsearch Service
   Domains.

  delete-elasticsearch-service-role-request - `com.amazonaws.services.elasticsearch.model.DeleteElasticsearchServiceRoleRequest`

  returns: Result of the DeleteElasticsearchServiceRole operation returned by the service. - `com.amazonaws.services.elasticsearch.model.DeleteElasticsearchServiceRoleResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.DeleteElasticsearchServiceRoleResult [^AWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.DeleteElasticsearchServiceRoleRequest delete-elasticsearch-service-role-request]
    (-> this (.deleteElasticsearchServiceRole delete-elasticsearch-service-role-request))))

(defn describe-elasticsearch-domain
  "Returns domain configuration information about the specified Elasticsearch domain, including the domain ID,
   domain endpoint, and domain ARN.

  describe-elasticsearch-domain-request - Container for the parameters to the DescribeElasticsearchDomain operation. - `com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainRequest`

  returns: Result of the DescribeElasticsearchDomain operation returned by the service. - `com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainResult [^AWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainRequest describe-elasticsearch-domain-request]
    (-> this (.describeElasticsearchDomain describe-elasticsearch-domain-request))))

(defn list-elasticsearch-instance-types
  "List all Elasticsearch instance types that are supported for given ElasticsearchVersion

  list-elasticsearch-instance-types-request - Container for the parameters to the ListElasticsearchInstanceTypes operation. - `com.amazonaws.services.elasticsearch.model.ListElasticsearchInstanceTypesRequest`

  returns: Result of the ListElasticsearchInstanceTypes operation returned by the service. - `com.amazonaws.services.elasticsearch.model.ListElasticsearchInstanceTypesResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.ListElasticsearchInstanceTypesResult [^AWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.ListElasticsearchInstanceTypesRequest list-elasticsearch-instance-types-request]
    (-> this (.listElasticsearchInstanceTypes list-elasticsearch-instance-types-request))))

(defn delete-elasticsearch-domain
  "Permanently deletes the specified Elasticsearch domain and all of its data. Once a domain is deleted, it cannot
   be recovered.

  delete-elasticsearch-domain-request - Container for the parameters to the DeleteElasticsearchDomain operation. Specifies the name of the Elasticsearch domain that you want to delete. - `com.amazonaws.services.elasticsearch.model.DeleteElasticsearchDomainRequest`

  returns: Result of the DeleteElasticsearchDomain operation returned by the service. - `com.amazonaws.services.elasticsearch.model.DeleteElasticsearchDomainResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.DeleteElasticsearchDomainResult [^AWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.DeleteElasticsearchDomainRequest delete-elasticsearch-domain-request]
    (-> this (.deleteElasticsearchDomain delete-elasticsearch-domain-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSElasticsearch this]
    (-> this (.shutdown))))

(defn get-compatible-elasticsearch-versions
  "Returns a list of upgrade compatible Elastisearch versions. You can optionally pass a
    DomainName  to get all upgrade compatible Elasticsearch versions for that specific domain.

  get-compatible-elasticsearch-versions-request - Container for request parameters to GetCompatibleElasticsearchVersions operation. - `com.amazonaws.services.elasticsearch.model.GetCompatibleElasticsearchVersionsRequest`

  returns: Result of the GetCompatibleElasticsearchVersions operation returned by the service. - `com.amazonaws.services.elasticsearch.model.GetCompatibleElasticsearchVersionsResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.GetCompatibleElasticsearchVersionsResult [^AWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.GetCompatibleElasticsearchVersionsRequest get-compatible-elasticsearch-versions-request]
    (-> this (.getCompatibleElasticsearchVersions get-compatible-elasticsearch-versions-request))))

(defn describe-elasticsearch-instance-type-limits
  "Describe Elasticsearch Limits for a given InstanceType and ElasticsearchVersion. When modifying existing Domain,
   specify the  DomainName  to know what Limits are supported for modifying.

  describe-elasticsearch-instance-type-limits-request - Container for the parameters to DescribeElasticsearchInstanceTypeLimits operation. - `com.amazonaws.services.elasticsearch.model.DescribeElasticsearchInstanceTypeLimitsRequest`

  returns: Result of the DescribeElasticsearchInstanceTypeLimits operation returned by the service. - `com.amazonaws.services.elasticsearch.model.DescribeElasticsearchInstanceTypeLimitsResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchInstanceTypeLimitsResult [^AWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchInstanceTypeLimitsRequest describe-elasticsearch-instance-type-limits-request]
    (-> this (.describeElasticsearchInstanceTypeLimits describe-elasticsearch-instance-type-limits-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"es.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://es.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AWSElasticsearch this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn update-elasticsearch-domain-config
  "Modifies the cluster configuration of the specified Elasticsearch domain, setting as setting the instance type
   and the number of instances.

  update-elasticsearch-domain-config-request - Container for the parameters to the UpdateElasticsearchDomain operation. Specifies the type and number of instances in the domain cluster. - `com.amazonaws.services.elasticsearch.model.UpdateElasticsearchDomainConfigRequest`

  returns: Result of the UpdateElasticsearchDomainConfig operation returned by the service. - `com.amazonaws.services.elasticsearch.model.UpdateElasticsearchDomainConfigResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.UpdateElasticsearchDomainConfigResult [^AWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.UpdateElasticsearchDomainConfigRequest update-elasticsearch-domain-config-request]
    (-> this (.updateElasticsearchDomainConfig update-elasticsearch-domain-config-request))))

(defn start-elasticsearch-service-software-update
  "Schedules a service software update for an Amazon ES domain.

  start-elasticsearch-service-software-update-request - Container for the parameters to the StartElasticsearchServiceSoftwareUpdate operation. Specifies the name of the Elasticsearch domain that you wish to schedule a service software update on. - `com.amazonaws.services.elasticsearch.model.StartElasticsearchServiceSoftwareUpdateRequest`

  returns: Result of the StartElasticsearchServiceSoftwareUpdate operation returned by the service. - `com.amazonaws.services.elasticsearch.model.StartElasticsearchServiceSoftwareUpdateResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.StartElasticsearchServiceSoftwareUpdateResult [^AWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.StartElasticsearchServiceSoftwareUpdateRequest start-elasticsearch-service-software-update-request]
    (-> this (.startElasticsearchServiceSoftwareUpdate start-elasticsearch-service-software-update-request))))

(defn list-domain-names
  "Returns the name of all Elasticsearch domains owned by the current user's account.

  list-domain-names-request - `com.amazonaws.services.elasticsearch.model.ListDomainNamesRequest`

  returns: Result of the ListDomainNames operation returned by the service. - `com.amazonaws.services.elasticsearch.model.ListDomainNamesResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.ListDomainNamesResult [^AWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.ListDomainNamesRequest list-domain-names-request]
    (-> this (.listDomainNames list-domain-names-request))))

(defn describe-reserved-elasticsearch-instances
  "Returns information about reserved Elasticsearch instances for this account.

  describe-reserved-elasticsearch-instances-request - Container for parameters to DescribeReservedElasticsearchInstances - `com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstancesRequest`

  returns: Result of the DescribeReservedElasticsearchInstances operation returned by the service. - `com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstancesResult`

  throws: com.amazonaws.services.elasticsearch.model.ResourceNotFoundException - An exception for accessing or deleting a resource that does not exist. Gives http status code of 400."
  (^com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstancesResult [^AWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstancesRequest describe-reserved-elasticsearch-instances-request]
    (-> this (.describeReservedElasticsearchInstances describe-reserved-elasticsearch-instances-request))))

(defn get-upgrade-history
  "Retrieves the complete history of the last 10 upgrades that were performed on the domain.

  get-upgrade-history-request - Container for request parameters to GetUpgradeHistory operation. - `com.amazonaws.services.elasticsearch.model.GetUpgradeHistoryRequest`

  returns: Result of the GetUpgradeHistory operation returned by the service. - `com.amazonaws.services.elasticsearch.model.GetUpgradeHistoryResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.GetUpgradeHistoryResult [^AWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.GetUpgradeHistoryRequest get-upgrade-history-request]
    (-> this (.getUpgradeHistory get-upgrade-history-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSElasticsearch this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn describe-elasticsearch-domains
  "Returns domain configuration information about the specified Elasticsearch domains, including the domain ID,
   domain endpoint, and domain ARN.

  describe-elasticsearch-domains-request - Container for the parameters to the DescribeElasticsearchDomains operation. By default, the API returns the status of all Elasticsearch domains. - `com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainsRequest`

  returns: Result of the DescribeElasticsearchDomains operation returned by the service. - `com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainsResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainsResult [^AWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainsRequest describe-elasticsearch-domains-request]
    (-> this (.describeElasticsearchDomains describe-elasticsearch-domains-request))))

(defn cancel-elasticsearch-service-software-update
  "Cancels a scheduled service software update for an Amazon ES domain. You can only perform this operation before
   the AutomatedUpdateDate and when the UpdateStatus is in the PENDING_UPDATE
   state.

  cancel-elasticsearch-service-software-update-request - Container for the parameters to the CancelElasticsearchServiceSoftwareUpdate operation. Specifies the name of the Elasticsearch domain that you wish to cancel a service software update on. - `com.amazonaws.services.elasticsearch.model.CancelElasticsearchServiceSoftwareUpdateRequest`

  returns: Result of the CancelElasticsearchServiceSoftwareUpdate operation returned by the service. - `com.amazonaws.services.elasticsearch.model.CancelElasticsearchServiceSoftwareUpdateResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.CancelElasticsearchServiceSoftwareUpdateResult [^AWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.CancelElasticsearchServiceSoftwareUpdateRequest cancel-elasticsearch-service-software-update-request]
    (-> this (.cancelElasticsearchServiceSoftwareUpdate cancel-elasticsearch-service-software-update-request))))

