(ns com.amazonaws.services.elasticsearch.AWSElasticsearchAsync
  "Interface for accessing Amazon Elasticsearch Service asynchronously. Each asynchronous method will return a Java
  Future object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to
  receive notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSElasticsearchAsync instead.


  Amazon Elasticsearch Configuration Service

  Use the Amazon Elasticsearch configuration API to create, configure, and manage Elasticsearch domains.


  The endpoint for configuration service requests is region-specific: es.region.amazonaws.com. For example,
  es.us-east-1.amazonaws.com. For a current list of supported regions and endpoints, see Regions
  and Endpoints."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.elasticsearch AWSElasticsearchAsync]))

(defn upgrade-elasticsearch-domain-async
  "Allows you to either upgrade your domain or perform an Upgrade eligibility check to a compatible Elasticsearch
   version.

  upgrade-elasticsearch-domain-request - Container for request parameters to UpgradeElasticsearchDomain operation. - `com.amazonaws.services.elasticsearch.model.UpgradeElasticsearchDomainRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpgradeElasticsearchDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.UpgradeElasticsearchDomainResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.UpgradeElasticsearchDomainRequest upgrade-elasticsearch-domain-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.upgradeElasticsearchDomainAsync upgrade-elasticsearch-domain-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.UpgradeElasticsearchDomainRequest upgrade-elasticsearch-domain-request]
    (-> this (.upgradeElasticsearchDomainAsync upgrade-elasticsearch-domain-request))))

(defn describe-elasticsearch-instance-type-limits-async
  "Describe Elasticsearch Limits for a given InstanceType and ElasticsearchVersion. When modifying existing Domain,
   specify the  DomainName  to know what Limits are supported for modifying.

  describe-elasticsearch-instance-type-limits-request - Container for the parameters to DescribeElasticsearchInstanceTypeLimits operation. - `com.amazonaws.services.elasticsearch.model.DescribeElasticsearchInstanceTypeLimitsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeElasticsearchInstanceTypeLimits operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.DescribeElasticsearchInstanceTypeLimitsResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchInstanceTypeLimitsRequest describe-elasticsearch-instance-type-limits-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeElasticsearchInstanceTypeLimitsAsync describe-elasticsearch-instance-type-limits-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchInstanceTypeLimitsRequest describe-elasticsearch-instance-type-limits-request]
    (-> this (.describeElasticsearchInstanceTypeLimitsAsync describe-elasticsearch-instance-type-limits-request))))

(defn describe-elasticsearch-domain-async
  "Returns domain configuration information about the specified Elasticsearch domain, including the domain ID,
   domain endpoint, and domain ARN.

  describe-elasticsearch-domain-request - Container for the parameters to the DescribeElasticsearchDomain operation. - `com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeElasticsearchDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainRequest describe-elasticsearch-domain-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeElasticsearchDomainAsync describe-elasticsearch-domain-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainRequest describe-elasticsearch-domain-request]
    (-> this (.describeElasticsearchDomainAsync describe-elasticsearch-domain-request))))

(defn cancel-elasticsearch-service-software-update-async
  "Cancels a scheduled service software update for an Amazon ES domain. You can only perform this operation before
   the AutomatedUpdateDate and when the UpdateStatus is in the PENDING_UPDATE
   state.

  cancel-elasticsearch-service-software-update-request - Container for the parameters to the CancelElasticsearchServiceSoftwareUpdate operation. Specifies the name of the Elasticsearch domain that you wish to cancel a service software update on. - `com.amazonaws.services.elasticsearch.model.CancelElasticsearchServiceSoftwareUpdateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelElasticsearchServiceSoftwareUpdate operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.CancelElasticsearchServiceSoftwareUpdateResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.CancelElasticsearchServiceSoftwareUpdateRequest cancel-elasticsearch-service-software-update-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelElasticsearchServiceSoftwareUpdateAsync cancel-elasticsearch-service-software-update-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.CancelElasticsearchServiceSoftwareUpdateRequest cancel-elasticsearch-service-software-update-request]
    (-> this (.cancelElasticsearchServiceSoftwareUpdateAsync cancel-elasticsearch-service-software-update-request))))

(defn describe-reserved-elasticsearch-instance-offerings-async
  "Lists available reserved Elasticsearch instance offerings.

  describe-reserved-elasticsearch-instance-offerings-request - Container for parameters to DescribeReservedElasticsearchInstanceOfferings - `com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstanceOfferingsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReservedElasticsearchInstanceOfferings operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstanceOfferingsResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstanceOfferingsRequest describe-reserved-elasticsearch-instance-offerings-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReservedElasticsearchInstanceOfferingsAsync describe-reserved-elasticsearch-instance-offerings-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstanceOfferingsRequest describe-reserved-elasticsearch-instance-offerings-request]
    (-> this (.describeReservedElasticsearchInstanceOfferingsAsync describe-reserved-elasticsearch-instance-offerings-request))))

(defn list-tags-async
  "Returns all tags for the given Elasticsearch domain.

  list-tags-request - Container for the parameters to the ListTags operation. Specify the ARN for the Elasticsearch domain to which the tags are attached that you want to view are attached. - `com.amazonaws.services.elasticsearch.model.ListTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.ListTagsResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.ListTagsRequest list-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsAsync list-tags-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.ListTagsRequest list-tags-request]
    (-> this (.listTagsAsync list-tags-request))))

(defn list-elasticsearch-versions-async
  "List all supported Elasticsearch versions

  list-elasticsearch-versions-request - Container for the parameters to the ListElasticsearchVersions operation. Use MaxResults to control the maximum number of results to retrieve in a single call. Use NextToken in response to retrieve more results. If the received response does not contain a NextToken, then there are no more results to retrieve. - `com.amazonaws.services.elasticsearch.model.ListElasticsearchVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListElasticsearchVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.ListElasticsearchVersionsResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.ListElasticsearchVersionsRequest list-elasticsearch-versions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listElasticsearchVersionsAsync list-elasticsearch-versions-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.ListElasticsearchVersionsRequest list-elasticsearch-versions-request]
    (-> this (.listElasticsearchVersionsAsync list-elasticsearch-versions-request))))

(defn list-domain-names-async
  "Returns the name of all Elasticsearch domains owned by the current user's account.

  list-domain-names-request - `com.amazonaws.services.elasticsearch.model.ListDomainNamesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDomainNames operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.ListDomainNamesResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.ListDomainNamesRequest list-domain-names-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDomainNamesAsync list-domain-names-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.ListDomainNamesRequest list-domain-names-request]
    (-> this (.listDomainNamesAsync list-domain-names-request))))

(defn get-compatible-elasticsearch-versions-async
  "Returns a list of upgrade compatible Elastisearch versions. You can optionally pass a
    DomainName  to get all upgrade compatible Elasticsearch versions for that specific domain.

  get-compatible-elasticsearch-versions-request - Container for request parameters to GetCompatibleElasticsearchVersions operation. - `com.amazonaws.services.elasticsearch.model.GetCompatibleElasticsearchVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCompatibleElasticsearchVersions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.GetCompatibleElasticsearchVersionsResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.GetCompatibleElasticsearchVersionsRequest get-compatible-elasticsearch-versions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCompatibleElasticsearchVersionsAsync get-compatible-elasticsearch-versions-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.GetCompatibleElasticsearchVersionsRequest get-compatible-elasticsearch-versions-request]
    (-> this (.getCompatibleElasticsearchVersionsAsync get-compatible-elasticsearch-versions-request))))

(defn describe-elasticsearch-domains-async
  "Returns domain configuration information about the specified Elasticsearch domains, including the domain ID,
   domain endpoint, and domain ARN.

  describe-elasticsearch-domains-request - Container for the parameters to the DescribeElasticsearchDomains operation. By default, the API returns the status of all Elasticsearch domains. - `com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeElasticsearchDomains operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainsResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainsRequest describe-elasticsearch-domains-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeElasticsearchDomainsAsync describe-elasticsearch-domains-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainsRequest describe-elasticsearch-domains-request]
    (-> this (.describeElasticsearchDomainsAsync describe-elasticsearch-domains-request))))

(defn delete-elasticsearch-service-role-async
  "Deletes the service-linked role that Elasticsearch Service uses to manage and maintain VPC domains. Role deletion
   will fail if any existing VPC domains use the role. You must delete any such Elasticsearch domains before
   deleting the role. See Deleting Elasticsearch Service Role in VPC Endpoints for Amazon Elasticsearch Service
   Domains.

  delete-elasticsearch-service-role-request - `com.amazonaws.services.elasticsearch.model.DeleteElasticsearchServiceRoleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteElasticsearchServiceRole operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.DeleteElasticsearchServiceRoleResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.DeleteElasticsearchServiceRoleRequest delete-elasticsearch-service-role-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteElasticsearchServiceRoleAsync delete-elasticsearch-service-role-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.DeleteElasticsearchServiceRoleRequest delete-elasticsearch-service-role-request]
    (-> this (.deleteElasticsearchServiceRoleAsync delete-elasticsearch-service-role-request))))

(defn create-elasticsearch-domain-async
  "Creates a new Elasticsearch domain. For more information, see Creating Elasticsearch Domains in the Amazon Elasticsearch Service Developer Guide.

  create-elasticsearch-domain-request - `com.amazonaws.services.elasticsearch.model.CreateElasticsearchDomainRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateElasticsearchDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.CreateElasticsearchDomainResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.CreateElasticsearchDomainRequest create-elasticsearch-domain-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createElasticsearchDomainAsync create-elasticsearch-domain-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.CreateElasticsearchDomainRequest create-elasticsearch-domain-request]
    (-> this (.createElasticsearchDomainAsync create-elasticsearch-domain-request))))

(defn get-upgrade-status-async
  "Retrieves the latest status of the last upgrade or upgrade eligibility check that was performed on the domain.

  get-upgrade-status-request - Container for request parameters to GetUpgradeStatus operation. - `com.amazonaws.services.elasticsearch.model.GetUpgradeStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUpgradeStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.GetUpgradeStatusResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.GetUpgradeStatusRequest get-upgrade-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUpgradeStatusAsync get-upgrade-status-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.GetUpgradeStatusRequest get-upgrade-status-request]
    (-> this (.getUpgradeStatusAsync get-upgrade-status-request))))

(defn list-elasticsearch-instance-types-async
  "List all Elasticsearch instance types that are supported for given ElasticsearchVersion

  list-elasticsearch-instance-types-request - Container for the parameters to the ListElasticsearchInstanceTypes operation. - `com.amazonaws.services.elasticsearch.model.ListElasticsearchInstanceTypesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListElasticsearchInstanceTypes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.ListElasticsearchInstanceTypesResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.ListElasticsearchInstanceTypesRequest list-elasticsearch-instance-types-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listElasticsearchInstanceTypesAsync list-elasticsearch-instance-types-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.ListElasticsearchInstanceTypesRequest list-elasticsearch-instance-types-request]
    (-> this (.listElasticsearchInstanceTypesAsync list-elasticsearch-instance-types-request))))

(defn update-elasticsearch-domain-config-async
  "Modifies the cluster configuration of the specified Elasticsearch domain, setting as setting the instance type
   and the number of instances.

  update-elasticsearch-domain-config-request - Container for the parameters to the UpdateElasticsearchDomain operation. Specifies the type and number of instances in the domain cluster. - `com.amazonaws.services.elasticsearch.model.UpdateElasticsearchDomainConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateElasticsearchDomainConfig operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.UpdateElasticsearchDomainConfigResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.UpdateElasticsearchDomainConfigRequest update-elasticsearch-domain-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateElasticsearchDomainConfigAsync update-elasticsearch-domain-config-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.UpdateElasticsearchDomainConfigRequest update-elasticsearch-domain-config-request]
    (-> this (.updateElasticsearchDomainConfigAsync update-elasticsearch-domain-config-request))))

(defn remove-tags-async
  "Removes the specified set of tags from the specified Elasticsearch domain.

  remove-tags-request - Container for the parameters to the RemoveTags operation. Specify the ARN for the Elasticsearch domain from which you want to remove the specified TagKey. - `com.amazonaws.services.elasticsearch.model.RemoveTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.RemoveTagsResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.RemoveTagsRequest remove-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeTagsAsync remove-tags-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.RemoveTagsRequest remove-tags-request]
    (-> this (.removeTagsAsync remove-tags-request))))

(defn describe-elasticsearch-domain-config-async
  "Provides cluster configuration information about the specified Elasticsearch domain, such as the state, creation
   date, update version, and update date for cluster options.

  describe-elasticsearch-domain-config-request - Container for the parameters to the DescribeElasticsearchDomainConfig operation. Specifies the domain name for which you want configuration information. - `com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeElasticsearchDomainConfig operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainConfigResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainConfigRequest describe-elasticsearch-domain-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeElasticsearchDomainConfigAsync describe-elasticsearch-domain-config-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainConfigRequest describe-elasticsearch-domain-config-request]
    (-> this (.describeElasticsearchDomainConfigAsync describe-elasticsearch-domain-config-request))))

(defn describe-reserved-elasticsearch-instances-async
  "Returns information about reserved Elasticsearch instances for this account.

  describe-reserved-elasticsearch-instances-request - Container for parameters to DescribeReservedElasticsearchInstances - `com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReservedElasticsearchInstances operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstancesResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstancesRequest describe-reserved-elasticsearch-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReservedElasticsearchInstancesAsync describe-reserved-elasticsearch-instances-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.DescribeReservedElasticsearchInstancesRequest describe-reserved-elasticsearch-instances-request]
    (-> this (.describeReservedElasticsearchInstancesAsync describe-reserved-elasticsearch-instances-request))))

(defn purchase-reserved-elasticsearch-instance-offering-async
  "Allows you to purchase reserved Elasticsearch instances.

  purchase-reserved-elasticsearch-instance-offering-request - Container for parameters to PurchaseReservedElasticsearchInstanceOffering - `com.amazonaws.services.elasticsearch.model.PurchaseReservedElasticsearchInstanceOfferingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PurchaseReservedElasticsearchInstanceOffering operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.PurchaseReservedElasticsearchInstanceOfferingResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.PurchaseReservedElasticsearchInstanceOfferingRequest purchase-reserved-elasticsearch-instance-offering-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.purchaseReservedElasticsearchInstanceOfferingAsync purchase-reserved-elasticsearch-instance-offering-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.PurchaseReservedElasticsearchInstanceOfferingRequest purchase-reserved-elasticsearch-instance-offering-request]
    (-> this (.purchaseReservedElasticsearchInstanceOfferingAsync purchase-reserved-elasticsearch-instance-offering-request))))

(defn delete-elasticsearch-domain-async
  "Permanently deletes the specified Elasticsearch domain and all of its data. Once a domain is deleted, it cannot
   be recovered.

  delete-elasticsearch-domain-request - Container for the parameters to the DeleteElasticsearchDomain operation. Specifies the name of the Elasticsearch domain that you want to delete. - `com.amazonaws.services.elasticsearch.model.DeleteElasticsearchDomainRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteElasticsearchDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.DeleteElasticsearchDomainResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.DeleteElasticsearchDomainRequest delete-elasticsearch-domain-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteElasticsearchDomainAsync delete-elasticsearch-domain-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.DeleteElasticsearchDomainRequest delete-elasticsearch-domain-request]
    (-> this (.deleteElasticsearchDomainAsync delete-elasticsearch-domain-request))))

(defn start-elasticsearch-service-software-update-async
  "Schedules a service software update for an Amazon ES domain.

  start-elasticsearch-service-software-update-request - Container for the parameters to the StartElasticsearchServiceSoftwareUpdate operation. Specifies the name of the Elasticsearch domain that you wish to schedule a service software update on. - `com.amazonaws.services.elasticsearch.model.StartElasticsearchServiceSoftwareUpdateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartElasticsearchServiceSoftwareUpdate operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.StartElasticsearchServiceSoftwareUpdateResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.StartElasticsearchServiceSoftwareUpdateRequest start-elasticsearch-service-software-update-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startElasticsearchServiceSoftwareUpdateAsync start-elasticsearch-service-software-update-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.StartElasticsearchServiceSoftwareUpdateRequest start-elasticsearch-service-software-update-request]
    (-> this (.startElasticsearchServiceSoftwareUpdateAsync start-elasticsearch-service-software-update-request))))

(defn add-tags-async
  "Attaches tags to an existing Elasticsearch domain. Tags are a set of case-sensitive key value pairs. An
   Elasticsearch domain may have up to 10 tags. See  Tagging Amazon Elasticsearch Service Domains for more information.

  add-tags-request - Container for the parameters to the AddTags operation. Specify the tags that you want to attach to the Elasticsearch domain. - `com.amazonaws.services.elasticsearch.model.AddTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.AddTagsResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.AddTagsRequest add-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsAsync add-tags-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.AddTagsRequest add-tags-request]
    (-> this (.addTagsAsync add-tags-request))))

(defn get-upgrade-history-async
  "Retrieves the complete history of the last 10 upgrades that were performed on the domain.

  get-upgrade-history-request - Container for request parameters to GetUpgradeHistory operation. - `com.amazonaws.services.elasticsearch.model.GetUpgradeHistoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUpgradeHistory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.elasticsearch.model.GetUpgradeHistoryResult>`"
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.GetUpgradeHistoryRequest get-upgrade-history-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUpgradeHistoryAsync get-upgrade-history-request async-handler)))
  (^java.util.concurrent.Future [^AWSElasticsearchAsync this ^com.amazonaws.services.elasticsearch.model.GetUpgradeHistoryRequest get-upgrade-history-request]
    (-> this (.getUpgradeHistoryAsync get-upgrade-history-request))))

