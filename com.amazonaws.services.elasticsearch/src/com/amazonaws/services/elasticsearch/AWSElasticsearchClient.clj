(ns com.amazonaws.services.elasticsearch.AWSElasticsearchClient
  "Client for accessing Amazon Elasticsearch Service. All service calls made using this client are blocking, and will
  not return until the service call completes.

  Amazon Elasticsearch Configuration Service

  Use the Amazon Elasticsearch configuration API to create, configure, and manage Elasticsearch domains.


  The endpoint for configuration service requests is region-specific: es.region.amazonaws.com. For example,
  es.us-east-1.amazonaws.com. For a current list of supported regions and endpoints, see Regions
  and Endpoints."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.elasticsearch AWSElasticsearchClient]))

(defn ->aws-elasticsearch-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to Amazon Elasticsearch Service (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AWSElasticsearchClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AWSElasticsearchClient aws-credentials-provider client-configuration request-metric-collector))
  (^AWSElasticsearchClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSElasticsearchClient aws-credentials client-configuration))
  (^AWSElasticsearchClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSElasticsearchClient client-configuration))
  (^AWSElasticsearchClient []
    (new AWSElasticsearchClient )))

(defn *builder
  "returns: `com.amazonaws.services.elasticsearch.AWSElasticsearchClientBuilder`"
  (^com.amazonaws.services.elasticsearch.AWSElasticsearchClientBuilder []
    (AWSElasticsearchClient/builder )))

(defn get-upgrade-status
  "Retrieves the latest status of the last upgrade or upgrade eligibility check that was performed on the domain.

  request - `com.amazonaws.services.elasticsearch.model.GetUpgradeStatusRequest`

  returns: Result of the GetUpgradeStatus operation returned by the service. - `com.amazonaws.services.elasticsearch.model.GetUpgradeStatusResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.GetUpgradeStatusResult [^AWSElasticsearchClient this ^com.amazonaws.services.elasticsearch.model.GetUpgradeStatusRequest request]
    (-> this (.getUpgradeStatus request))))

(defn add-tags
  "Attaches tags to an existing Elasticsearch domain. Tags are a set of case-sensitive key value pairs. An
   Elasticsearch domain may have up to 10 tags. See  Tagging Amazon Elasticsearch Service Domains for more information.

  request - `com.amazonaws.services.elasticsearch.model.AddTagsRequest`

  returns: Result of the AddTags operation returned by the service. - `com.amazonaws.services.elasticsearch.model.AddTagsResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.AddTagsResult [^AWSElasticsearchClient this ^com.amazonaws.services.elasticsearch.model.AddTagsRequest request]
    (-> this (.addTags request))))

(defn describe-reserved-elasticsearch-instance-offerings
  "Lists available reserved Elasticsearch instance offerings.

  request - `com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstanceOfferingsRequest`

  returns: Result of the DescribeReservedElasticsearchInstanceOfferings operation returned by the service. - `com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstanceOfferingsResult`

  throws: com.amazonaws.services.elasticsearch.model.ResourceNotFoundException - An exception for accessing or deleting a resource that does not exist. Gives http status code of 400."
  (^com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstanceOfferingsResult [^AWSElasticsearchClient this ^com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstanceOfferingsRequest request]
    (-> this (.describeReservedElasticsearchInstanceOfferings request))))

(defn describe-elasticsearch-domain-config
  "Provides cluster configuration information about the specified Elasticsearch domain, such as the state, creation
   date, update version, and update date for cluster options.

  request - `com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainConfigRequest`

  returns: Result of the DescribeElasticsearchDomainConfig operation returned by the service. - `com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainConfigResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainConfigResult [^AWSElasticsearchClient this ^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainConfigRequest request]
    (-> this (.describeElasticsearchDomainConfig request))))

(defn purchase-reserved-elasticsearch-instance-offering
  "Allows you to purchase reserved Elasticsearch instances.

  request - `com.amazonaws.services.elasticsearch.model.PurchaseReservedElasticsearchInstanceOfferingRequest`

  returns: Result of the PurchaseReservedElasticsearchInstanceOffering operation returned by the service. - `com.amazonaws.services.elasticsearch.model.PurchaseReservedElasticsearchInstanceOfferingResult`

  throws: com.amazonaws.services.elasticsearch.model.ResourceNotFoundException - An exception for accessing or deleting a resource that does not exist. Gives http status code of 400."
  (^com.amazonaws.services.elasticsearch.model.PurchaseReservedElasticsearchInstanceOfferingResult [^AWSElasticsearchClient this ^com.amazonaws.services.elasticsearch.model.PurchaseReservedElasticsearchInstanceOfferingRequest request]
    (-> this (.purchaseReservedElasticsearchInstanceOffering request))))

(defn list-tags
  "Returns all tags for the given Elasticsearch domain.

  request - `com.amazonaws.services.elasticsearch.model.ListTagsRequest`

  returns: Result of the ListTags operation returned by the service. - `com.amazonaws.services.elasticsearch.model.ListTagsResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.ListTagsResult [^AWSElasticsearchClient this ^com.amazonaws.services.elasticsearch.model.ListTagsRequest request]
    (-> this (.listTags request))))

(defn list-elasticsearch-versions
  "List all supported Elasticsearch versions

  request - `com.amazonaws.services.elasticsearch.model.ListElasticsearchVersionsRequest`

  returns: Result of the ListElasticsearchVersions operation returned by the service. - `com.amazonaws.services.elasticsearch.model.ListElasticsearchVersionsResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.ListElasticsearchVersionsResult [^AWSElasticsearchClient this ^com.amazonaws.services.elasticsearch.model.ListElasticsearchVersionsRequest request]
    (-> this (.listElasticsearchVersions request))))

(defn remove-tags
  "Removes the specified set of tags from the specified Elasticsearch domain.

  request - `com.amazonaws.services.elasticsearch.model.RemoveTagsRequest`

  returns: Result of the RemoveTags operation returned by the service. - `com.amazonaws.services.elasticsearch.model.RemoveTagsResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.RemoveTagsResult [^AWSElasticsearchClient this ^com.amazonaws.services.elasticsearch.model.RemoveTagsRequest request]
    (-> this (.removeTags request))))

(defn create-elasticsearch-domain
  "Creates a new Elasticsearch domain. For more information, see Creating Elasticsearch Domains in the Amazon Elasticsearch Service Developer Guide.

  request - `com.amazonaws.services.elasticsearch.model.CreateElasticsearchDomainRequest`

  returns: Result of the CreateElasticsearchDomain operation returned by the service. - `com.amazonaws.services.elasticsearch.model.CreateElasticsearchDomainResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.CreateElasticsearchDomainResult [^AWSElasticsearchClient this ^com.amazonaws.services.elasticsearch.model.CreateElasticsearchDomainRequest request]
    (-> this (.createElasticsearchDomain request))))

(defn upgrade-elasticsearch-domain
  "Allows you to either upgrade your domain or perform an Upgrade eligibility check to a compatible Elasticsearch
   version.

  request - `com.amazonaws.services.elasticsearch.model.UpgradeElasticsearchDomainRequest`

  returns: Result of the UpgradeElasticsearchDomain operation returned by the service. - `com.amazonaws.services.elasticsearch.model.UpgradeElasticsearchDomainResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.UpgradeElasticsearchDomainResult [^AWSElasticsearchClient this ^com.amazonaws.services.elasticsearch.model.UpgradeElasticsearchDomainRequest request]
    (-> this (.upgradeElasticsearchDomain request))))

(defn delete-elasticsearch-service-role
  "Deletes the service-linked role that Elasticsearch Service uses to manage and maintain VPC domains. Role deletion
   will fail if any existing VPC domains use the role. You must delete any such Elasticsearch domains before
   deleting the role. See Deleting Elasticsearch Service Role in VPC Endpoints for Amazon Elasticsearch Service
   Domains.

  request - `com.amazonaws.services.elasticsearch.model.DeleteElasticsearchServiceRoleRequest`

  returns: Result of the DeleteElasticsearchServiceRole operation returned by the service. - `com.amazonaws.services.elasticsearch.model.DeleteElasticsearchServiceRoleResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.DeleteElasticsearchServiceRoleResult [^AWSElasticsearchClient this ^com.amazonaws.services.elasticsearch.model.DeleteElasticsearchServiceRoleRequest request]
    (-> this (.deleteElasticsearchServiceRole request))))

(defn describe-elasticsearch-domain
  "Returns domain configuration information about the specified Elasticsearch domain, including the domain ID,
   domain endpoint, and domain ARN.

  request - `com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainRequest`

  returns: Result of the DescribeElasticsearchDomain operation returned by the service. - `com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainResult [^AWSElasticsearchClient this ^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainRequest request]
    (-> this (.describeElasticsearchDomain request))))

(defn list-elasticsearch-instance-types
  "List all Elasticsearch instance types that are supported for given ElasticsearchVersion

  request - `com.amazonaws.services.elasticsearch.model.ListElasticsearchInstanceTypesRequest`

  returns: Result of the ListElasticsearchInstanceTypes operation returned by the service. - `com.amazonaws.services.elasticsearch.model.ListElasticsearchInstanceTypesResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.ListElasticsearchInstanceTypesResult [^AWSElasticsearchClient this ^com.amazonaws.services.elasticsearch.model.ListElasticsearchInstanceTypesRequest request]
    (-> this (.listElasticsearchInstanceTypes request))))

(defn delete-elasticsearch-domain
  "Permanently deletes the specified Elasticsearch domain and all of its data. Once a domain is deleted, it cannot
   be recovered.

  request - `com.amazonaws.services.elasticsearch.model.DeleteElasticsearchDomainRequest`

  returns: Result of the DeleteElasticsearchDomain operation returned by the service. - `com.amazonaws.services.elasticsearch.model.DeleteElasticsearchDomainResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.DeleteElasticsearchDomainResult [^AWSElasticsearchClient this ^com.amazonaws.services.elasticsearch.model.DeleteElasticsearchDomainRequest request]
    (-> this (.deleteElasticsearchDomain request))))

(defn get-compatible-elasticsearch-versions
  "Returns a list of upgrade compatible Elastisearch versions. You can optionally pass a
    DomainName  to get all upgrade compatible Elasticsearch versions for that specific domain.

  request - `com.amazonaws.services.elasticsearch.model.GetCompatibleElasticsearchVersionsRequest`

  returns: Result of the GetCompatibleElasticsearchVersions operation returned by the service. - `com.amazonaws.services.elasticsearch.model.GetCompatibleElasticsearchVersionsResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.GetCompatibleElasticsearchVersionsResult [^AWSElasticsearchClient this ^com.amazonaws.services.elasticsearch.model.GetCompatibleElasticsearchVersionsRequest request]
    (-> this (.getCompatibleElasticsearchVersions request))))

(defn describe-elasticsearch-instance-type-limits
  "Describe Elasticsearch Limits for a given InstanceType and ElasticsearchVersion. When modifying existing Domain,
   specify the  DomainName  to know what Limits are supported for modifying.

  request - `com.amazonaws.services.elasticsearch.model.DescribeElasticsearchInstanceTypeLimitsRequest`

  returns: Result of the DescribeElasticsearchInstanceTypeLimits operation returned by the service. - `com.amazonaws.services.elasticsearch.model.DescribeElasticsearchInstanceTypeLimitsResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchInstanceTypeLimitsResult [^AWSElasticsearchClient this ^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchInstanceTypeLimitsRequest request]
    (-> this (.describeElasticsearchInstanceTypeLimits request))))

(defn update-elasticsearch-domain-config
  "Modifies the cluster configuration of the specified Elasticsearch domain, setting as setting the instance type
   and the number of instances.

  request - `com.amazonaws.services.elasticsearch.model.UpdateElasticsearchDomainConfigRequest`

  returns: Result of the UpdateElasticsearchDomainConfig operation returned by the service. - `com.amazonaws.services.elasticsearch.model.UpdateElasticsearchDomainConfigResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.UpdateElasticsearchDomainConfigResult [^AWSElasticsearchClient this ^com.amazonaws.services.elasticsearch.model.UpdateElasticsearchDomainConfigRequest request]
    (-> this (.updateElasticsearchDomainConfig request))))

(defn start-elasticsearch-service-software-update
  "Schedules a service software update for an Amazon ES domain.

  request - `com.amazonaws.services.elasticsearch.model.StartElasticsearchServiceSoftwareUpdateRequest`

  returns: Result of the StartElasticsearchServiceSoftwareUpdate operation returned by the service. - `com.amazonaws.services.elasticsearch.model.StartElasticsearchServiceSoftwareUpdateResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.StartElasticsearchServiceSoftwareUpdateResult [^AWSElasticsearchClient this ^com.amazonaws.services.elasticsearch.model.StartElasticsearchServiceSoftwareUpdateRequest request]
    (-> this (.startElasticsearchServiceSoftwareUpdate request))))

(defn list-domain-names
  "Returns the name of all Elasticsearch domains owned by the current user's account.

  request - `com.amazonaws.services.elasticsearch.model.ListDomainNamesRequest`

  returns: Result of the ListDomainNames operation returned by the service. - `com.amazonaws.services.elasticsearch.model.ListDomainNamesResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.ListDomainNamesResult [^AWSElasticsearchClient this ^com.amazonaws.services.elasticsearch.model.ListDomainNamesRequest request]
    (-> this (.listDomainNames request))))

(defn describe-reserved-elasticsearch-instances
  "Returns information about reserved Elasticsearch instances for this account.

  request - `com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstancesRequest`

  returns: Result of the DescribeReservedElasticsearchInstances operation returned by the service. - `com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstancesResult`

  throws: com.amazonaws.services.elasticsearch.model.ResourceNotFoundException - An exception for accessing or deleting a resource that does not exist. Gives http status code of 400."
  (^com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstancesResult [^AWSElasticsearchClient this ^com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstancesRequest request]
    (-> this (.describeReservedElasticsearchInstances request))))

(defn get-upgrade-history
  "Retrieves the complete history of the last 10 upgrades that were performed on the domain.

  request - `com.amazonaws.services.elasticsearch.model.GetUpgradeHistoryRequest`

  returns: Result of the GetUpgradeHistory operation returned by the service. - `com.amazonaws.services.elasticsearch.model.GetUpgradeHistoryResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.GetUpgradeHistoryResult [^AWSElasticsearchClient this ^com.amazonaws.services.elasticsearch.model.GetUpgradeHistoryRequest request]
    (-> this (.getUpgradeHistory request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSElasticsearchClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn describe-elasticsearch-domains
  "Returns domain configuration information about the specified Elasticsearch domains, including the domain ID,
   domain endpoint, and domain ARN.

  request - `com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainsRequest`

  returns: Result of the DescribeElasticsearchDomains operation returned by the service. - `com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainsResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainsResult [^AWSElasticsearchClient this ^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainsRequest request]
    (-> this (.describeElasticsearchDomains request))))

(defn cancel-elasticsearch-service-software-update
  "Cancels a scheduled service software update for an Amazon ES domain. You can only perform this operation before
   the AutomatedUpdateDate and when the UpdateStatus is in the PENDING_UPDATE
   state.

  request - `com.amazonaws.services.elasticsearch.model.CancelElasticsearchServiceSoftwareUpdateRequest`

  returns: Result of the CancelElasticsearchServiceSoftwareUpdate operation returned by the service. - `com.amazonaws.services.elasticsearch.model.CancelElasticsearchServiceSoftwareUpdateResult`

  throws: com.amazonaws.services.elasticsearch.model.BaseException - An error occurred while processing the request."
  (^com.amazonaws.services.elasticsearch.model.CancelElasticsearchServiceSoftwareUpdateResult [^AWSElasticsearchClient this ^com.amazonaws.services.elasticsearch.model.CancelElasticsearchServiceSoftwareUpdateRequest request]
    (-> this (.cancelElasticsearchServiceSoftwareUpdate request))))

