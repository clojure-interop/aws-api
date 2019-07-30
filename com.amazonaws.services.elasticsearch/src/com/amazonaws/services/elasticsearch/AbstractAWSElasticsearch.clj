(ns com.amazonaws.services.elasticsearch.AbstractAWSElasticsearch
  "Abstract implementation of AWSElasticsearch. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.elasticsearch AbstractAWSElasticsearch]))

(defn get-upgrade-status
  "Description copied from interface: AWSElasticsearch

  request - Container for request parameters to GetUpgradeStatus operation. - `com.amazonaws.services.elasticsearch.model.GetUpgradeStatusRequest`

  returns: Result of the GetUpgradeStatus operation returned by the service. - `com.amazonaws.services.elasticsearch.model.GetUpgradeStatusResult`"
  (^com.amazonaws.services.elasticsearch.model.GetUpgradeStatusResult [^AbstractAWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.GetUpgradeStatusRequest request]
    (-> this (.getUpgradeStatus request))))

(defn add-tags
  "Description copied from interface: AWSElasticsearch

  request - Container for the parameters to the AddTags operation. Specify the tags that you want to attach to the Elasticsearch domain. - `com.amazonaws.services.elasticsearch.model.AddTagsRequest`

  returns: Result of the AddTags operation returned by the service. - `com.amazonaws.services.elasticsearch.model.AddTagsResult`"
  (^com.amazonaws.services.elasticsearch.model.AddTagsResult [^AbstractAWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.AddTagsRequest request]
    (-> this (.addTags request))))

(defn set-region
  "Description copied from interface: AWSElasticsearch

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAWSElasticsearch this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn describe-reserved-elasticsearch-instance-offerings
  "Description copied from interface: AWSElasticsearch

  request - Container for parameters to DescribeReservedElasticsearchInstanceOfferings - `com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstanceOfferingsRequest`

  returns: Result of the DescribeReservedElasticsearchInstanceOfferings operation returned by the service. - `com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstanceOfferingsResult`"
  (^com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstanceOfferingsResult [^AbstractAWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstanceOfferingsRequest request]
    (-> this (.describeReservedElasticsearchInstanceOfferings request))))

(defn describe-elasticsearch-domain-config
  "Description copied from interface: AWSElasticsearch

  request - Container for the parameters to the DescribeElasticsearchDomainConfig operation. Specifies the domain name for which you want configuration information. - `com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainConfigRequest`

  returns: Result of the DescribeElasticsearchDomainConfig operation returned by the service. - `com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainConfigResult`"
  (^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainConfigResult [^AbstractAWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainConfigRequest request]
    (-> this (.describeElasticsearchDomainConfig request))))

(defn purchase-reserved-elasticsearch-instance-offering
  "Description copied from interface: AWSElasticsearch

  request - Container for parameters to PurchaseReservedElasticsearchInstanceOffering - `com.amazonaws.services.elasticsearch.model.PurchaseReservedElasticsearchInstanceOfferingRequest`

  returns: Result of the PurchaseReservedElasticsearchInstanceOffering operation returned by the service. - `com.amazonaws.services.elasticsearch.model.PurchaseReservedElasticsearchInstanceOfferingResult`"
  (^com.amazonaws.services.elasticsearch.model.PurchaseReservedElasticsearchInstanceOfferingResult [^AbstractAWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.PurchaseReservedElasticsearchInstanceOfferingRequest request]
    (-> this (.purchaseReservedElasticsearchInstanceOffering request))))

(defn list-tags
  "Description copied from interface: AWSElasticsearch

  request - Container for the parameters to the ListTags operation. Specify the ARN for the Elasticsearch domain to which the tags are attached that you want to view are attached. - `com.amazonaws.services.elasticsearch.model.ListTagsRequest`

  returns: Result of the ListTags operation returned by the service. - `com.amazonaws.services.elasticsearch.model.ListTagsResult`"
  (^com.amazonaws.services.elasticsearch.model.ListTagsResult [^AbstractAWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.ListTagsRequest request]
    (-> this (.listTags request))))

(defn list-elasticsearch-versions
  "Description copied from interface: AWSElasticsearch

  request - Container for the parameters to the ListElasticsearchVersions operation. Use MaxResults to control the maximum number of results to retrieve in a single call. Use NextToken in response to retrieve more results. If the received response does not contain a NextToken, then there are no more results to retrieve. - `com.amazonaws.services.elasticsearch.model.ListElasticsearchVersionsRequest`

  returns: Result of the ListElasticsearchVersions operation returned by the service. - `com.amazonaws.services.elasticsearch.model.ListElasticsearchVersionsResult`"
  (^com.amazonaws.services.elasticsearch.model.ListElasticsearchVersionsResult [^AbstractAWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.ListElasticsearchVersionsRequest request]
    (-> this (.listElasticsearchVersions request))))

(defn remove-tags
  "Description copied from interface: AWSElasticsearch

  request - Container for the parameters to the RemoveTags operation. Specify the ARN for the Elasticsearch domain from which you want to remove the specified TagKey. - `com.amazonaws.services.elasticsearch.model.RemoveTagsRequest`

  returns: Result of the RemoveTags operation returned by the service. - `com.amazonaws.services.elasticsearch.model.RemoveTagsResult`"
  (^com.amazonaws.services.elasticsearch.model.RemoveTagsResult [^AbstractAWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.RemoveTagsRequest request]
    (-> this (.removeTags request))))

(defn create-elasticsearch-domain
  "Description copied from interface: AWSElasticsearch

  request - `com.amazonaws.services.elasticsearch.model.CreateElasticsearchDomainRequest`

  returns: Result of the CreateElasticsearchDomain operation returned by the service. - `com.amazonaws.services.elasticsearch.model.CreateElasticsearchDomainResult`"
  (^com.amazonaws.services.elasticsearch.model.CreateElasticsearchDomainResult [^AbstractAWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.CreateElasticsearchDomainRequest request]
    (-> this (.createElasticsearchDomain request))))

(defn upgrade-elasticsearch-domain
  "Description copied from interface: AWSElasticsearch

  request - Container for request parameters to UpgradeElasticsearchDomain operation. - `com.amazonaws.services.elasticsearch.model.UpgradeElasticsearchDomainRequest`

  returns: Result of the UpgradeElasticsearchDomain operation returned by the service. - `com.amazonaws.services.elasticsearch.model.UpgradeElasticsearchDomainResult`"
  (^com.amazonaws.services.elasticsearch.model.UpgradeElasticsearchDomainResult [^AbstractAWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.UpgradeElasticsearchDomainRequest request]
    (-> this (.upgradeElasticsearchDomain request))))

(defn delete-elasticsearch-service-role
  "Description copied from interface: AWSElasticsearch

  request - `com.amazonaws.services.elasticsearch.model.DeleteElasticsearchServiceRoleRequest`

  returns: Result of the DeleteElasticsearchServiceRole operation returned by the service. - `com.amazonaws.services.elasticsearch.model.DeleteElasticsearchServiceRoleResult`"
  (^com.amazonaws.services.elasticsearch.model.DeleteElasticsearchServiceRoleResult [^AbstractAWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.DeleteElasticsearchServiceRoleRequest request]
    (-> this (.deleteElasticsearchServiceRole request))))

(defn describe-elasticsearch-domain
  "Description copied from interface: AWSElasticsearch

  request - Container for the parameters to the DescribeElasticsearchDomain operation. - `com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainRequest`

  returns: Result of the DescribeElasticsearchDomain operation returned by the service. - `com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainResult`"
  (^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainResult [^AbstractAWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainRequest request]
    (-> this (.describeElasticsearchDomain request))))

(defn list-elasticsearch-instance-types
  "Description copied from interface: AWSElasticsearch

  request - Container for the parameters to the ListElasticsearchInstanceTypes operation. - `com.amazonaws.services.elasticsearch.model.ListElasticsearchInstanceTypesRequest`

  returns: Result of the ListElasticsearchInstanceTypes operation returned by the service. - `com.amazonaws.services.elasticsearch.model.ListElasticsearchInstanceTypesResult`"
  (^com.amazonaws.services.elasticsearch.model.ListElasticsearchInstanceTypesResult [^AbstractAWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.ListElasticsearchInstanceTypesRequest request]
    (-> this (.listElasticsearchInstanceTypes request))))

(defn delete-elasticsearch-domain
  "Description copied from interface: AWSElasticsearch

  request - Container for the parameters to the DeleteElasticsearchDomain operation. Specifies the name of the Elasticsearch domain that you want to delete. - `com.amazonaws.services.elasticsearch.model.DeleteElasticsearchDomainRequest`

  returns: Result of the DeleteElasticsearchDomain operation returned by the service. - `com.amazonaws.services.elasticsearch.model.DeleteElasticsearchDomainResult`"
  (^com.amazonaws.services.elasticsearch.model.DeleteElasticsearchDomainResult [^AbstractAWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.DeleteElasticsearchDomainRequest request]
    (-> this (.deleteElasticsearchDomain request))))

(defn shutdown
  "Description copied from interface: AWSElasticsearch"
  ([^AbstractAWSElasticsearch this]
    (-> this (.shutdown))))

(defn get-compatible-elasticsearch-versions
  "Description copied from interface: AWSElasticsearch

  request - Container for request parameters to GetCompatibleElasticsearchVersions operation. - `com.amazonaws.services.elasticsearch.model.GetCompatibleElasticsearchVersionsRequest`

  returns: Result of the GetCompatibleElasticsearchVersions operation returned by the service. - `com.amazonaws.services.elasticsearch.model.GetCompatibleElasticsearchVersionsResult`"
  (^com.amazonaws.services.elasticsearch.model.GetCompatibleElasticsearchVersionsResult [^AbstractAWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.GetCompatibleElasticsearchVersionsRequest request]
    (-> this (.getCompatibleElasticsearchVersions request))))

(defn describe-elasticsearch-instance-type-limits
  "Description copied from interface: AWSElasticsearch

  request - Container for the parameters to DescribeElasticsearchInstanceTypeLimits operation. - `com.amazonaws.services.elasticsearch.model.DescribeElasticsearchInstanceTypeLimitsRequest`

  returns: Result of the DescribeElasticsearchInstanceTypeLimits operation returned by the service. - `com.amazonaws.services.elasticsearch.model.DescribeElasticsearchInstanceTypeLimitsResult`"
  (^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchInstanceTypeLimitsResult [^AbstractAWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchInstanceTypeLimitsRequest request]
    (-> this (.describeElasticsearchInstanceTypeLimits request))))

(defn set-endpoint
  "Description copied from interface: AWSElasticsearch

  endpoint - The endpoint (ex: \"es.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://es.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAWSElasticsearch this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn update-elasticsearch-domain-config
  "Description copied from interface: AWSElasticsearch

  request - Container for the parameters to the UpdateElasticsearchDomain operation. Specifies the type and number of instances in the domain cluster. - `com.amazonaws.services.elasticsearch.model.UpdateElasticsearchDomainConfigRequest`

  returns: Result of the UpdateElasticsearchDomainConfig operation returned by the service. - `com.amazonaws.services.elasticsearch.model.UpdateElasticsearchDomainConfigResult`"
  (^com.amazonaws.services.elasticsearch.model.UpdateElasticsearchDomainConfigResult [^AbstractAWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.UpdateElasticsearchDomainConfigRequest request]
    (-> this (.updateElasticsearchDomainConfig request))))

(defn start-elasticsearch-service-software-update
  "Description copied from interface: AWSElasticsearch

  request - Container for the parameters to the StartElasticsearchServiceSoftwareUpdate operation. Specifies the name of the Elasticsearch domain that you wish to schedule a service software update on. - `com.amazonaws.services.elasticsearch.model.StartElasticsearchServiceSoftwareUpdateRequest`

  returns: Result of the StartElasticsearchServiceSoftwareUpdate operation returned by the service. - `com.amazonaws.services.elasticsearch.model.StartElasticsearchServiceSoftwareUpdateResult`"
  (^com.amazonaws.services.elasticsearch.model.StartElasticsearchServiceSoftwareUpdateResult [^AbstractAWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.StartElasticsearchServiceSoftwareUpdateRequest request]
    (-> this (.startElasticsearchServiceSoftwareUpdate request))))

(defn list-domain-names
  "Description copied from interface: AWSElasticsearch

  request - `com.amazonaws.services.elasticsearch.model.ListDomainNamesRequest`

  returns: Result of the ListDomainNames operation returned by the service. - `com.amazonaws.services.elasticsearch.model.ListDomainNamesResult`"
  (^com.amazonaws.services.elasticsearch.model.ListDomainNamesResult [^AbstractAWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.ListDomainNamesRequest request]
    (-> this (.listDomainNames request))))

(defn describe-reserved-elasticsearch-instances
  "Description copied from interface: AWSElasticsearch

  request - Container for parameters to DescribeReservedElasticsearchInstances - `com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstancesRequest`

  returns: Result of the DescribeReservedElasticsearchInstances operation returned by the service. - `com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstancesResult`"
  (^com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstancesResult [^AbstractAWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstancesRequest request]
    (-> this (.describeReservedElasticsearchInstances request))))

(defn get-upgrade-history
  "Description copied from interface: AWSElasticsearch

  request - Container for request parameters to GetUpgradeHistory operation. - `com.amazonaws.services.elasticsearch.model.GetUpgradeHistoryRequest`

  returns: Result of the GetUpgradeHistory operation returned by the service. - `com.amazonaws.services.elasticsearch.model.GetUpgradeHistoryResult`"
  (^com.amazonaws.services.elasticsearch.model.GetUpgradeHistoryResult [^AbstractAWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.GetUpgradeHistoryRequest request]
    (-> this (.getUpgradeHistory request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSElasticsearch

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSElasticsearch this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn describe-elasticsearch-domains
  "Description copied from interface: AWSElasticsearch

  request - Container for the parameters to the DescribeElasticsearchDomains operation. By default, the API returns the status of all Elasticsearch domains. - `com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainsRequest`

  returns: Result of the DescribeElasticsearchDomains operation returned by the service. - `com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainsResult`"
  (^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainsResult [^AbstractAWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainsRequest request]
    (-> this (.describeElasticsearchDomains request))))

(defn cancel-elasticsearch-service-software-update
  "Description copied from interface: AWSElasticsearch

  request - Container for the parameters to the CancelElasticsearchServiceSoftwareUpdate operation. Specifies the name of the Elasticsearch domain that you wish to cancel a service software update on. - `com.amazonaws.services.elasticsearch.model.CancelElasticsearchServiceSoftwareUpdateRequest`

  returns: Result of the CancelElasticsearchServiceSoftwareUpdate operation returned by the service. - `com.amazonaws.services.elasticsearch.model.CancelElasticsearchServiceSoftwareUpdateResult`"
  (^com.amazonaws.services.elasticsearch.model.CancelElasticsearchServiceSoftwareUpdateResult [^AbstractAWSElasticsearch this ^com.amazonaws.services.elasticsearch.model.CancelElasticsearchServiceSoftwareUpdateRequest request]
    (-> this (.cancelElasticsearchServiceSoftwareUpdate request))))

