(ns com.amazonaws.services.servicecatalog.AWSServiceCatalogAsync
  "Interface for accessing AWS Service Catalog asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSServiceCatalogAsync instead.


  AWS Service Catalog

  AWS Service Catalog enables organizations to create and manage
  catalogs of IT services that are approved for use on AWS. To get the most out of this documentation, you should be
  familiar with the terminology discussed in AWS Service Catalog
  Concepts."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.servicecatalog AWSServiceCatalogAsync]))

(defn describe-constraint-async
  "Gets information about the specified constraint.

  describe-constraint-request - `com.amazonaws.services.servicecatalog.model.DescribeConstraintRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConstraint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DescribeConstraintResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DescribeConstraintRequest describe-constraint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConstraintAsync describe-constraint-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DescribeConstraintRequest describe-constraint-request]
    (-> this (.describeConstraintAsync describe-constraint-request))))

(defn describe-product-view-async
  "Gets information about the specified product.

  describe-product-view-request - `com.amazonaws.services.servicecatalog.model.DescribeProductViewRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeProductView operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DescribeProductViewResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DescribeProductViewRequest describe-product-view-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeProductViewAsync describe-product-view-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DescribeProductViewRequest describe-product-view-request]
    (-> this (.describeProductViewAsync describe-product-view-request))))

(defn delete-provisioning-artifact-async
  "Deletes the specified provisioning artifact (also known as a version) for the specified product.


   You cannot delete a provisioning artifact associated with a product that was shared with you. You cannot delete
   the last provisioning artifact for a product, because a product must have at least one provisioning artifact.

  delete-provisioning-artifact-request - `com.amazonaws.services.servicecatalog.model.DeleteProvisioningArtifactRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteProvisioningArtifact operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DeleteProvisioningArtifactResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DeleteProvisioningArtifactRequest delete-provisioning-artifact-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteProvisioningArtifactAsync delete-provisioning-artifact-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DeleteProvisioningArtifactRequest delete-provisioning-artifact-request]
    (-> this (.deleteProvisioningArtifactAsync delete-provisioning-artifact-request))))

(defn create-service-action-async
  "Creates a self-service action.

  create-service-action-request - `com.amazonaws.services.servicecatalog.model.CreateServiceActionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateServiceAction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.CreateServiceActionResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.CreateServiceActionRequest create-service-action-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createServiceActionAsync create-service-action-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.CreateServiceActionRequest create-service-action-request]
    (-> this (.createServiceActionAsync create-service-action-request))))

(defn describe-copy-product-status-async
  "Gets the status of the specified copy product operation.

  describe-copy-product-status-request - `com.amazonaws.services.servicecatalog.model.DescribeCopyProductStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCopyProductStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DescribeCopyProductStatusResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DescribeCopyProductStatusRequest describe-copy-product-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCopyProductStatusAsync describe-copy-product-status-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DescribeCopyProductStatusRequest describe-copy-product-status-request]
    (-> this (.describeCopyProductStatusAsync describe-copy-product-status-request))))

(defn describe-portfolio-share-status-async
  "Gets the status of the specified portfolio share operation. This API can only be called by the master account in
   the organization.

  describe-portfolio-share-status-request - `com.amazonaws.services.servicecatalog.model.DescribePortfolioShareStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePortfolioShareStatus operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DescribePortfolioShareStatusResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DescribePortfolioShareStatusRequest describe-portfolio-share-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePortfolioShareStatusAsync describe-portfolio-share-status-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DescribePortfolioShareStatusRequest describe-portfolio-share-status-request]
    (-> this (.describePortfolioShareStatusAsync describe-portfolio-share-status-request))))

(defn search-products-async
  "Gets information about the products to which the caller has access.

  search-products-request - `com.amazonaws.services.servicecatalog.model.SearchProductsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchProducts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.SearchProductsResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.SearchProductsRequest search-products-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchProductsAsync search-products-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.SearchProductsRequest search-products-request]
    (-> this (.searchProductsAsync search-products-request))))

(defn disassociate-service-action-from-provisioning-artifact-async
  "Disassociates the specified self-service action association from the specified provisioning artifact.

  disassociate-service-action-from-provisioning-artifact-request - `com.amazonaws.services.servicecatalog.model.DisassociateServiceActionFromProvisioningArtifactRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateServiceActionFromProvisioningArtifact operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DisassociateServiceActionFromProvisioningArtifactResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DisassociateServiceActionFromProvisioningArtifactRequest disassociate-service-action-from-provisioning-artifact-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateServiceActionFromProvisioningArtifactAsync disassociate-service-action-from-provisioning-artifact-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DisassociateServiceActionFromProvisioningArtifactRequest disassociate-service-action-from-provisioning-artifact-request]
    (-> this (.disassociateServiceActionFromProvisioningArtifactAsync disassociate-service-action-from-provisioning-artifact-request))))

(defn update-portfolio-async
  "Updates the specified portfolio.


   You cannot update a product that was shared with you.

  update-portfolio-request - `com.amazonaws.services.servicecatalog.model.UpdatePortfolioRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdatePortfolio operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.UpdatePortfolioResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.UpdatePortfolioRequest update-portfolio-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updatePortfolioAsync update-portfolio-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.UpdatePortfolioRequest update-portfolio-request]
    (-> this (.updatePortfolioAsync update-portfolio-request))))

(defn list-accepted-portfolio-shares-async
  "Lists all portfolios for which sharing was accepted by this account.

  list-accepted-portfolio-shares-request - `com.amazonaws.services.servicecatalog.model.ListAcceptedPortfolioSharesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAcceptedPortfolioShares operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ListAcceptedPortfolioSharesResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ListAcceptedPortfolioSharesRequest list-accepted-portfolio-shares-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAcceptedPortfolioSharesAsync list-accepted-portfolio-shares-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ListAcceptedPortfolioSharesRequest list-accepted-portfolio-shares-request]
    (-> this (.listAcceptedPortfolioSharesAsync list-accepted-portfolio-shares-request))))

(defn search-provisioned-products-async
  "Gets information about the provisioned products that meet the specified criteria.

  search-provisioned-products-request - `com.amazonaws.services.servicecatalog.model.SearchProvisionedProductsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchProvisionedProducts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.SearchProvisionedProductsResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.SearchProvisionedProductsRequest search-provisioned-products-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchProvisionedProductsAsync search-provisioned-products-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.SearchProvisionedProductsRequest search-provisioned-products-request]
    (-> this (.searchProvisionedProductsAsync search-provisioned-products-request))))

(defn create-product-async
  "Creates a product.

  create-product-request - `com.amazonaws.services.servicecatalog.model.CreateProductRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateProduct operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.CreateProductResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.CreateProductRequest create-product-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createProductAsync create-product-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.CreateProductRequest create-product-request]
    (-> this (.createProductAsync create-product-request))))

(defn provision-product-async
  "Provisions the specified product.


   A provisioned product is a resourced instance of a product. For example, provisioning a product based on a
   CloudFormation template launches a CloudFormation stack and its underlying resources. You can check the status of
   this request using DescribeRecord.


   If the request contains a tag key with an empty list of values, there is a tag conflict for that key. Do not
   include conflicted keys as tags, or this causes the error
   \"Parameter validation failed: Missing required parameter in Tags[N]:Value\".

  provision-product-request - `com.amazonaws.services.servicecatalog.model.ProvisionProductRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ProvisionProduct operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ProvisionProductResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ProvisionProductRequest provision-product-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.provisionProductAsync provision-product-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ProvisionProductRequest provision-product-request]
    (-> this (.provisionProductAsync provision-product-request))))

(defn delete-service-action-async
  "Deletes a self-service action.

  delete-service-action-request - `com.amazonaws.services.servicecatalog.model.DeleteServiceActionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteServiceAction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DeleteServiceActionResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DeleteServiceActionRequest delete-service-action-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteServiceActionAsync delete-service-action-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DeleteServiceActionRequest delete-service-action-request]
    (-> this (.deleteServiceActionAsync delete-service-action-request))))

(defn list-portfolios-for-product-async
  "Lists all portfolios that the specified product is associated with.

  list-portfolios-for-product-request - `com.amazonaws.services.servicecatalog.model.ListPortfoliosForProductRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPortfoliosForProduct operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ListPortfoliosForProductResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ListPortfoliosForProductRequest list-portfolios-for-product-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPortfoliosForProductAsync list-portfolios-for-product-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ListPortfoliosForProductRequest list-portfolios-for-product-request]
    (-> this (.listPortfoliosForProductAsync list-portfolios-for-product-request))))

(defn create-tag-option-async
  "Creates a TagOption.

  create-tag-option-request - `com.amazonaws.services.servicecatalog.model.CreateTagOptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTagOption operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.CreateTagOptionResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.CreateTagOptionRequest create-tag-option-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTagOptionAsync create-tag-option-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.CreateTagOptionRequest create-tag-option-request]
    (-> this (.createTagOptionAsync create-tag-option-request))))

(defn list-principals-for-portfolio-async
  "Lists all principal ARNs associated with the specified portfolio.

  list-principals-for-portfolio-request - `com.amazonaws.services.servicecatalog.model.ListPrincipalsForPortfolioRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPrincipalsForPortfolio operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ListPrincipalsForPortfolioResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ListPrincipalsForPortfolioRequest list-principals-for-portfolio-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPrincipalsForPortfolioAsync list-principals-for-portfolio-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ListPrincipalsForPortfolioRequest list-principals-for-portfolio-request]
    (-> this (.listPrincipalsForPortfolioAsync list-principals-for-portfolio-request))))

(defn disassociate-budget-from-resource-async
  "Disassociates the specified budget from the specified resource.

  disassociate-budget-from-resource-request - `com.amazonaws.services.servicecatalog.model.DisassociateBudgetFromResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateBudgetFromResource operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DisassociateBudgetFromResourceResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DisassociateBudgetFromResourceRequest disassociate-budget-from-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateBudgetFromResourceAsync disassociate-budget-from-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DisassociateBudgetFromResourceRequest disassociate-budget-from-resource-request]
    (-> this (.disassociateBudgetFromResourceAsync disassociate-budget-from-resource-request))))

(defn list-portfolio-access-async
  "Lists the account IDs that have access to the specified portfolio.

  list-portfolio-access-request - `com.amazonaws.services.servicecatalog.model.ListPortfolioAccessRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPortfolioAccess operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ListPortfolioAccessResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ListPortfolioAccessRequest list-portfolio-access-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPortfolioAccessAsync list-portfolio-access-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ListPortfolioAccessRequest list-portfolio-access-request]
    (-> this (.listPortfolioAccessAsync list-portfolio-access-request))))

(defn list-portfolios-async
  "Lists all portfolios in the catalog.

  list-portfolios-request - `com.amazonaws.services.servicecatalog.model.ListPortfoliosRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPortfolios operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ListPortfoliosResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ListPortfoliosRequest list-portfolios-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPortfoliosAsync list-portfolios-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ListPortfoliosRequest list-portfolios-request]
    (-> this (.listPortfoliosAsync list-portfolios-request))))

(defn list-budgets-for-resource-async
  "Lists all the budgets associated to the specified resource.

  list-budgets-for-resource-request - `com.amazonaws.services.servicecatalog.model.ListBudgetsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListBudgetsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ListBudgetsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ListBudgetsForResourceRequest list-budgets-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listBudgetsForResourceAsync list-budgets-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ListBudgetsForResourceRequest list-budgets-for-resource-request]
    (-> this (.listBudgetsForResourceAsync list-budgets-for-resource-request))))

(defn associate-service-action-with-provisioning-artifact-async
  "Associates a self-service action with a provisioning artifact.

  associate-service-action-with-provisioning-artifact-request - `com.amazonaws.services.servicecatalog.model.AssociateServiceActionWithProvisioningArtifactRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateServiceActionWithProvisioningArtifact operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.AssociateServiceActionWithProvisioningArtifactResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.AssociateServiceActionWithProvisioningArtifactRequest associate-service-action-with-provisioning-artifact-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateServiceActionWithProvisioningArtifactAsync associate-service-action-with-provisioning-artifact-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.AssociateServiceActionWithProvisioningArtifactRequest associate-service-action-with-provisioning-artifact-request]
    (-> this (.associateServiceActionWithProvisioningArtifactAsync associate-service-action-with-provisioning-artifact-request))))

(defn associate-tag-option-with-resource-async
  "Associate the specified TagOption with the specified portfolio or product.

  associate-tag-option-with-resource-request - `com.amazonaws.services.servicecatalog.model.AssociateTagOptionWithResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateTagOptionWithResource operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.AssociateTagOptionWithResourceResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.AssociateTagOptionWithResourceRequest associate-tag-option-with-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateTagOptionWithResourceAsync associate-tag-option-with-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.AssociateTagOptionWithResourceRequest associate-tag-option-with-resource-request]
    (-> this (.associateTagOptionWithResourceAsync associate-tag-option-with-resource-request))))

(defn describe-provisioned-product-async
  "Gets information about the specified provisioned product.

  describe-provisioned-product-request - `com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeProvisionedProduct operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductRequest describe-provisioned-product-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeProvisionedProductAsync describe-provisioned-product-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductRequest describe-provisioned-product-request]
    (-> this (.describeProvisionedProductAsync describe-provisioned-product-request))))

(defn delete-constraint-async
  "Deletes the specified constraint.

  delete-constraint-request - `com.amazonaws.services.servicecatalog.model.DeleteConstraintRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteConstraint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DeleteConstraintResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DeleteConstraintRequest delete-constraint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteConstraintAsync delete-constraint-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DeleteConstraintRequest delete-constraint-request]
    (-> this (.deleteConstraintAsync delete-constraint-request))))

(defn list-launch-paths-async
  "Lists the paths to the specified product. A path is how the user has access to a specified product, and is
   necessary when provisioning a product. A path also determines the constraints put on the product.

  list-launch-paths-request - `com.amazonaws.services.servicecatalog.model.ListLaunchPathsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListLaunchPaths operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ListLaunchPathsResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ListLaunchPathsRequest list-launch-paths-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listLaunchPathsAsync list-launch-paths-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ListLaunchPathsRequest list-launch-paths-request]
    (-> this (.listLaunchPathsAsync list-launch-paths-request))))

(defn describe-portfolio-async
  "Gets information about the specified portfolio.

  describe-portfolio-request - `com.amazonaws.services.servicecatalog.model.DescribePortfolioRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePortfolio operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DescribePortfolioResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DescribePortfolioRequest describe-portfolio-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePortfolioAsync describe-portfolio-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DescribePortfolioRequest describe-portfolio-request]
    (-> this (.describePortfolioAsync describe-portfolio-request))))

(defn disassociate-principal-from-portfolio-async
  "Disassociates a previously associated principal ARN from a specified portfolio.

  disassociate-principal-from-portfolio-request - `com.amazonaws.services.servicecatalog.model.DisassociatePrincipalFromPortfolioRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociatePrincipalFromPortfolio operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DisassociatePrincipalFromPortfolioResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DisassociatePrincipalFromPortfolioRequest disassociate-principal-from-portfolio-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociatePrincipalFromPortfolioAsync disassociate-principal-from-portfolio-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DisassociatePrincipalFromPortfolioRequest disassociate-principal-from-portfolio-request]
    (-> this (.disassociatePrincipalFromPortfolioAsync disassociate-principal-from-portfolio-request))))

(defn execute-provisioned-product-plan-async
  "Provisions or modifies a product based on the resource changes for the specified plan.

  execute-provisioned-product-plan-request - `com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductPlanRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ExecuteProvisionedProductPlan operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductPlanResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductPlanRequest execute-provisioned-product-plan-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.executeProvisionedProductPlanAsync execute-provisioned-product-plan-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductPlanRequest execute-provisioned-product-plan-request]
    (-> this (.executeProvisionedProductPlanAsync execute-provisioned-product-plan-request))))

(defn list-organization-portfolio-access-async
  "Lists the organization nodes that have access to the specified portfolio. This API can only be called by the
   master account in the organization.

  list-organization-portfolio-access-request - `com.amazonaws.services.servicecatalog.model.ListOrganizationPortfolioAccessRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListOrganizationPortfolioAccess operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ListOrganizationPortfolioAccessResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ListOrganizationPortfolioAccessRequest list-organization-portfolio-access-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listOrganizationPortfolioAccessAsync list-organization-portfolio-access-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ListOrganizationPortfolioAccessRequest list-organization-portfolio-access-request]
    (-> this (.listOrganizationPortfolioAccessAsync list-organization-portfolio-access-request))))

(defn list-resources-for-tag-option-async
  "Lists the resources associated with the specified TagOption.

  list-resources-for-tag-option-request - `com.amazonaws.services.servicecatalog.model.ListResourcesForTagOptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListResourcesForTagOption operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ListResourcesForTagOptionResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ListResourcesForTagOptionRequest list-resources-for-tag-option-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listResourcesForTagOptionAsync list-resources-for-tag-option-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ListResourcesForTagOptionRequest list-resources-for-tag-option-request]
    (-> this (.listResourcesForTagOptionAsync list-resources-for-tag-option-request))))

(defn update-provisioning-artifact-async
  "Updates the specified provisioning artifact (also known as a version) for the specified product.


   You cannot update a provisioning artifact for a product that was shared with you.

  update-provisioning-artifact-request - `com.amazonaws.services.servicecatalog.model.UpdateProvisioningArtifactRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateProvisioningArtifact operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.UpdateProvisioningArtifactResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.UpdateProvisioningArtifactRequest update-provisioning-artifact-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateProvisioningArtifactAsync update-provisioning-artifact-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.UpdateProvisioningArtifactRequest update-provisioning-artifact-request]
    (-> this (.updateProvisioningArtifactAsync update-provisioning-artifact-request))))

(defn describe-service-action-async
  "Describes a self-service action.

  describe-service-action-request - `com.amazonaws.services.servicecatalog.model.DescribeServiceActionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeServiceAction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DescribeServiceActionResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DescribeServiceActionRequest describe-service-action-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeServiceActionAsync describe-service-action-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DescribeServiceActionRequest describe-service-action-request]
    (-> this (.describeServiceActionAsync describe-service-action-request))))

(defn list-service-actions-for-provisioning-artifact-async
  "Returns a paginated list of self-service actions associated with the specified Product ID and Provisioning
   Artifact ID.

  list-service-actions-for-provisioning-artifact-request - `com.amazonaws.services.servicecatalog.model.ListServiceActionsForProvisioningArtifactRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListServiceActionsForProvisioningArtifact operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ListServiceActionsForProvisioningArtifactResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ListServiceActionsForProvisioningArtifactRequest list-service-actions-for-provisioning-artifact-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listServiceActionsForProvisioningArtifactAsync list-service-actions-for-provisioning-artifact-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ListServiceActionsForProvisioningArtifactRequest list-service-actions-for-provisioning-artifact-request]
    (-> this (.listServiceActionsForProvisioningArtifactAsync list-service-actions-for-provisioning-artifact-request))))

(defn list-tag-options-async
  "Lists the specified TagOptions or all TagOptions.

  list-tag-options-request - `com.amazonaws.services.servicecatalog.model.ListTagOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagOptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ListTagOptionsResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ListTagOptionsRequest list-tag-options-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagOptionsAsync list-tag-options-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ListTagOptionsRequest list-tag-options-request]
    (-> this (.listTagOptionsAsync list-tag-options-request))))

(defn list-stack-instances-for-provisioned-product-async
  "Returns summary information about stack instances that are associated with the specified
   CFN_STACKSET type provisioned product. You can filter for stack instances that are associated with a
   specific AWS account name or region.

  list-stack-instances-for-provisioned-product-request - `com.amazonaws.services.servicecatalog.model.ListStackInstancesForProvisionedProductRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListStackInstancesForProvisionedProduct operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ListStackInstancesForProvisionedProductResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ListStackInstancesForProvisionedProductRequest list-stack-instances-for-provisioned-product-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listStackInstancesForProvisionedProductAsync list-stack-instances-for-provisioned-product-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ListStackInstancesForProvisionedProductRequest list-stack-instances-for-provisioned-product-request]
    (-> this (.listStackInstancesForProvisionedProductAsync list-stack-instances-for-provisioned-product-request))))

(defn enable-aws-organizations-access-async
  "Enable portfolio sharing feature through AWS Organizations. This API will allow Service Catalog to receive
   updates on your organization in order to sync your shares with the current structure. This API can only be called
   by the master account in the organization.


   By calling this API Service Catalog will make a call to organizations:EnableAWSServiceAccess on your behalf so
   that your shares can be in sync with any changes in your AWS Organizations structure.

  enable-aws-organizations-access-request - `com.amazonaws.services.servicecatalog.model.EnableAWSOrganizationsAccessRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableAWSOrganizationsAccess operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.EnableAWSOrganizationsAccessResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.EnableAWSOrganizationsAccessRequest enable-aws-organizations-access-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableAWSOrganizationsAccessAsync enable-aws-organizations-access-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.EnableAWSOrganizationsAccessRequest enable-aws-organizations-access-request]
    (-> this (.enableAWSOrganizationsAccessAsync enable-aws-organizations-access-request))))

(defn search-products-as-admin-async
  "Gets information about the products for the specified portfolio or all products.

  search-products-as-admin-request - `com.amazonaws.services.servicecatalog.model.SearchProductsAsAdminRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchProductsAsAdmin operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.SearchProductsAsAdminResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.SearchProductsAsAdminRequest search-products-as-admin-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchProductsAsAdminAsync search-products-as-admin-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.SearchProductsAsAdminRequest search-products-as-admin-request]
    (-> this (.searchProductsAsAdminAsync search-products-as-admin-request))))

(defn accept-portfolio-share-async
  "Accepts an offer to share the specified portfolio.

  accept-portfolio-share-request - `com.amazonaws.services.servicecatalog.model.AcceptPortfolioShareRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AcceptPortfolioShare operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.AcceptPortfolioShareResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.AcceptPortfolioShareRequest accept-portfolio-share-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.acceptPortfolioShareAsync accept-portfolio-share-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.AcceptPortfolioShareRequest accept-portfolio-share-request]
    (-> this (.acceptPortfolioShareAsync accept-portfolio-share-request))))

(defn create-portfolio-share-async
  "Shares the specified portfolio with the specified account or organization node. Shares to an organization node
   can only be created by the master account of an Organization. AWSOrganizationsAccess must be enabled in order to
   create a portfolio share to an organization node.

  create-portfolio-share-request - `com.amazonaws.services.servicecatalog.model.CreatePortfolioShareRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePortfolioShare operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.CreatePortfolioShareResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.CreatePortfolioShareRequest create-portfolio-share-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPortfolioShareAsync create-portfolio-share-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.CreatePortfolioShareRequest create-portfolio-share-request]
    (-> this (.createPortfolioShareAsync create-portfolio-share-request))))

(defn associate-product-with-portfolio-async
  "Associates the specified product with the specified portfolio.

  associate-product-with-portfolio-request - `com.amazonaws.services.servicecatalog.model.AssociateProductWithPortfolioRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateProductWithPortfolio operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.AssociateProductWithPortfolioResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.AssociateProductWithPortfolioRequest associate-product-with-portfolio-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateProductWithPortfolioAsync associate-product-with-portfolio-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.AssociateProductWithPortfolioRequest associate-product-with-portfolio-request]
    (-> this (.associateProductWithPortfolioAsync associate-product-with-portfolio-request))))

(defn terminate-provisioned-product-async
  "Terminates the specified provisioned product.


   This operation does not delete any records associated with the provisioned product.


   You can check the status of this request using DescribeRecord.

  terminate-provisioned-product-request - `com.amazonaws.services.servicecatalog.model.TerminateProvisionedProductRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TerminateProvisionedProduct operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.TerminateProvisionedProductResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.TerminateProvisionedProductRequest terminate-provisioned-product-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.terminateProvisionedProductAsync terminate-provisioned-product-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.TerminateProvisionedProductRequest terminate-provisioned-product-request]
    (-> this (.terminateProvisionedProductAsync terminate-provisioned-product-request))))

(defn disassociate-product-from-portfolio-async
  "Disassociates the specified product from the specified portfolio.

  disassociate-product-from-portfolio-request - `com.amazonaws.services.servicecatalog.model.DisassociateProductFromPortfolioRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateProductFromPortfolio operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DisassociateProductFromPortfolioResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DisassociateProductFromPortfolioRequest disassociate-product-from-portfolio-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateProductFromPortfolioAsync disassociate-product-from-portfolio-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DisassociateProductFromPortfolioRequest disassociate-product-from-portfolio-request]
    (-> this (.disassociateProductFromPortfolioAsync disassociate-product-from-portfolio-request))))

(defn describe-provisioning-parameters-async
  "Gets information about the configuration required to provision the specified product using the specified
   provisioning artifact.


   If the output contains a TagOption key with an empty list of values, there is a TagOption conflict for that key.
   The end user cannot take action to fix the conflict, and launch is not blocked. In subsequent calls to
   ProvisionProduct, do not include conflicted TagOption keys as tags, or this causes the error
   \"Parameter validation failed: Missing required parameter in Tags[N]:Value\". Tag the provisioned
   product with the value sc-tagoption-conflict-portfolioId-productId.

  describe-provisioning-parameters-request - `com.amazonaws.services.servicecatalog.model.DescribeProvisioningParametersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeProvisioningParameters operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DescribeProvisioningParametersResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DescribeProvisioningParametersRequest describe-provisioning-parameters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeProvisioningParametersAsync describe-provisioning-parameters-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DescribeProvisioningParametersRequest describe-provisioning-parameters-request]
    (-> this (.describeProvisioningParametersAsync describe-provisioning-parameters-request))))

(defn describe-record-async
  "Gets information about the specified request operation.


   Use this operation after calling a request operation (for example, ProvisionProduct,
   TerminateProvisionedProduct, or UpdateProvisionedProduct).



   If a provisioned product was transferred to a new owner using UpdateProvisionedProductProperties, the new
   owner will be able to describe all past records for that product. The previous owner will no longer be able to
   describe the records, but will be able to use ListRecordHistory to see the product's history from when he
   was the owner.

  describe-record-request - `com.amazonaws.services.servicecatalog.model.DescribeRecordRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRecord operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DescribeRecordResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DescribeRecordRequest describe-record-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRecordAsync describe-record-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DescribeRecordRequest describe-record-request]
    (-> this (.describeRecordAsync describe-record-request))))

(defn get-aws-organizations-access-status-async
  "Get the Access Status for AWS Organization portfolio share feature. This API can only be called by the master
   account in the organization.

  get-aws-organizations-access-status-request - `com.amazonaws.services.servicecatalog.model.GetAWSOrganizationsAccessStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAWSOrganizationsAccessStatus operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.GetAWSOrganizationsAccessStatusResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.GetAWSOrganizationsAccessStatusRequest get-aws-organizations-access-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAWSOrganizationsAccessStatusAsync get-aws-organizations-access-status-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.GetAWSOrganizationsAccessStatusRequest get-aws-organizations-access-status-request]
    (-> this (.getAWSOrganizationsAccessStatusAsync get-aws-organizations-access-status-request))))

(defn delete-tag-option-async
  "Deletes the specified TagOption.


   You cannot delete a TagOption if it is associated with a product or portfolio.

  delete-tag-option-request - `com.amazonaws.services.servicecatalog.model.DeleteTagOptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTagOption operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DeleteTagOptionResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DeleteTagOptionRequest delete-tag-option-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTagOptionAsync delete-tag-option-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DeleteTagOptionRequest delete-tag-option-request]
    (-> this (.deleteTagOptionAsync delete-tag-option-request))))

(defn describe-tag-option-async
  "Gets information about the specified TagOption.

  describe-tag-option-request - `com.amazonaws.services.servicecatalog.model.DescribeTagOptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTagOption operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DescribeTagOptionResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DescribeTagOptionRequest describe-tag-option-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTagOptionAsync describe-tag-option-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DescribeTagOptionRequest describe-tag-option-request]
    (-> this (.describeTagOptionAsync describe-tag-option-request))))

(defn describe-provisioned-product-plan-async
  "Gets information about the resource changes for the specified plan.

  describe-provisioned-product-plan-request - `com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductPlanRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeProvisionedProductPlan operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductPlanResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductPlanRequest describe-provisioned-product-plan-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeProvisionedProductPlanAsync describe-provisioned-product-plan-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductPlanRequest describe-provisioned-product-plan-request]
    (-> this (.describeProvisionedProductPlanAsync describe-provisioned-product-plan-request))))

(defn list-service-actions-async
  "Lists all self-service actions.

  list-service-actions-request - `com.amazonaws.services.servicecatalog.model.ListServiceActionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListServiceActions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ListServiceActionsResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ListServiceActionsRequest list-service-actions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listServiceActionsAsync list-service-actions-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ListServiceActionsRequest list-service-actions-request]
    (-> this (.listServiceActionsAsync list-service-actions-request))))

(defn delete-portfolio-share-async
  "Stops sharing the specified portfolio with the specified account or organization node. Shares to an organization
   node can only be deleted by the master account of an Organization.

  delete-portfolio-share-request - `com.amazonaws.services.servicecatalog.model.DeletePortfolioShareRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePortfolioShare operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DeletePortfolioShareResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DeletePortfolioShareRequest delete-portfolio-share-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePortfolioShareAsync delete-portfolio-share-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DeletePortfolioShareRequest delete-portfolio-share-request]
    (-> this (.deletePortfolioShareAsync delete-portfolio-share-request))))

(defn describe-product-as-admin-async
  "Gets information about the specified product. This operation is run with administrator access.

  describe-product-as-admin-request - `com.amazonaws.services.servicecatalog.model.DescribeProductAsAdminRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeProductAsAdmin operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DescribeProductAsAdminResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DescribeProductAsAdminRequest describe-product-as-admin-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeProductAsAdminAsync describe-product-as-admin-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DescribeProductAsAdminRequest describe-product-as-admin-request]
    (-> this (.describeProductAsAdminAsync describe-product-as-admin-request))))

(defn update-provisioned-product-properties-async
  "Requests updates to the properties of the specified provisioned product.

  update-provisioned-product-properties-request - `com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductPropertiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateProvisionedProductProperties operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductPropertiesResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductPropertiesRequest update-provisioned-product-properties-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateProvisionedProductPropertiesAsync update-provisioned-product-properties-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductPropertiesRequest update-provisioned-product-properties-request]
    (-> this (.updateProvisionedProductPropertiesAsync update-provisioned-product-properties-request))))

(defn create-provisioning-artifact-async
  "Creates a provisioning artifact (also known as a version) for the specified product.


   You cannot create a provisioning artifact for a product that was shared with you.

  create-provisioning-artifact-request - `com.amazonaws.services.servicecatalog.model.CreateProvisioningArtifactRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateProvisioningArtifact operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.CreateProvisioningArtifactResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.CreateProvisioningArtifactRequest create-provisioning-artifact-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createProvisioningArtifactAsync create-provisioning-artifact-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.CreateProvisioningArtifactRequest create-provisioning-artifact-request]
    (-> this (.createProvisioningArtifactAsync create-provisioning-artifact-request))))

(defn describe-product-async
  "Gets information about the specified product.

  describe-product-request - `com.amazonaws.services.servicecatalog.model.DescribeProductRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeProduct operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DescribeProductResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DescribeProductRequest describe-product-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeProductAsync describe-product-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DescribeProductRequest describe-product-request]
    (-> this (.describeProductAsync describe-product-request))))

(defn execute-provisioned-product-service-action-async
  "Executes a self-service action against a provisioned product.

  execute-provisioned-product-service-action-request - `com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductServiceActionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ExecuteProvisionedProductServiceAction operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductServiceActionResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductServiceActionRequest execute-provisioned-product-service-action-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.executeProvisionedProductServiceActionAsync execute-provisioned-product-service-action-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductServiceActionRequest execute-provisioned-product-service-action-request]
    (-> this (.executeProvisionedProductServiceActionAsync execute-provisioned-product-service-action-request))))

(defn batch-associate-service-action-with-provisioning-artifact-async
  "Associates multiple self-service actions with provisioning artifacts.

  batch-associate-service-action-with-provisioning-artifact-request - `com.amazonaws.services.servicecatalog.model.BatchAssociateServiceActionWithProvisioningArtifactRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchAssociateServiceActionWithProvisioningArtifact operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.BatchAssociateServiceActionWithProvisioningArtifactResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.BatchAssociateServiceActionWithProvisioningArtifactRequest batch-associate-service-action-with-provisioning-artifact-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchAssociateServiceActionWithProvisioningArtifactAsync batch-associate-service-action-with-provisioning-artifact-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.BatchAssociateServiceActionWithProvisioningArtifactRequest batch-associate-service-action-with-provisioning-artifact-request]
    (-> this (.batchAssociateServiceActionWithProvisioningArtifactAsync batch-associate-service-action-with-provisioning-artifact-request))))

(defn delete-provisioned-product-plan-async
  "Deletes the specified plan.

  delete-provisioned-product-plan-request - `com.amazonaws.services.servicecatalog.model.DeleteProvisionedProductPlanRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteProvisionedProductPlan operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DeleteProvisionedProductPlanResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DeleteProvisionedProductPlanRequest delete-provisioned-product-plan-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteProvisionedProductPlanAsync delete-provisioned-product-plan-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DeleteProvisionedProductPlanRequest delete-provisioned-product-plan-request]
    (-> this (.deleteProvisionedProductPlanAsync delete-provisioned-product-plan-request))))

(defn create-provisioned-product-plan-async
  "Creates a plan. A plan includes the list of resources to be created (when provisioning a new product) or modified
   (when updating a provisioned product) when the plan is executed.


   You can create one plan per provisioned product. To create a plan for an existing provisioned product, the
   product status must be AVAILBLE or TAINTED.


   To view the resource changes in the change set, use DescribeProvisionedProductPlan. To create or modify
   the provisioned product, use ExecuteProvisionedProductPlan.

  create-provisioned-product-plan-request - `com.amazonaws.services.servicecatalog.model.CreateProvisionedProductPlanRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateProvisionedProductPlan operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.CreateProvisionedProductPlanResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.CreateProvisionedProductPlanRequest create-provisioned-product-plan-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createProvisionedProductPlanAsync create-provisioned-product-plan-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.CreateProvisionedProductPlanRequest create-provisioned-product-plan-request]
    (-> this (.createProvisionedProductPlanAsync create-provisioned-product-plan-request))))

(defn update-service-action-async
  "Updates a self-service action.

  update-service-action-request - `com.amazonaws.services.servicecatalog.model.UpdateServiceActionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateServiceAction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.UpdateServiceActionResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.UpdateServiceActionRequest update-service-action-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateServiceActionAsync update-service-action-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.UpdateServiceActionRequest update-service-action-request]
    (-> this (.updateServiceActionAsync update-service-action-request))))

(defn copy-product-async
  "Copies the specified source product to the specified target product or a new product.


   You can copy a product to the same account or another account. You can copy a product to the same region or
   another region.


   This operation is performed asynchronously. To track the progress of the operation, use
   DescribeCopyProductStatus.

  copy-product-request - `com.amazonaws.services.servicecatalog.model.CopyProductRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopyProduct operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.CopyProductResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.CopyProductRequest copy-product-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copyProductAsync copy-product-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.CopyProductRequest copy-product-request]
    (-> this (.copyProductAsync copy-product-request))))

(defn associate-principal-with-portfolio-async
  "Associates the specified principal ARN with the specified portfolio.

  associate-principal-with-portfolio-request - `com.amazonaws.services.servicecatalog.model.AssociatePrincipalWithPortfolioRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociatePrincipalWithPortfolio operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.AssociatePrincipalWithPortfolioResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.AssociatePrincipalWithPortfolioRequest associate-principal-with-portfolio-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associatePrincipalWithPortfolioAsync associate-principal-with-portfolio-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.AssociatePrincipalWithPortfolioRequest associate-principal-with-portfolio-request]
    (-> this (.associatePrincipalWithPortfolioAsync associate-principal-with-portfolio-request))))

(defn update-tag-option-async
  "Updates the specified TagOption.

  update-tag-option-request - `com.amazonaws.services.servicecatalog.model.UpdateTagOptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateTagOption operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.UpdateTagOptionResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.UpdateTagOptionRequest update-tag-option-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateTagOptionAsync update-tag-option-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.UpdateTagOptionRequest update-tag-option-request]
    (-> this (.updateTagOptionAsync update-tag-option-request))))

(defn list-constraints-for-portfolio-async
  "Lists the constraints for the specified portfolio and product.

  list-constraints-for-portfolio-request - `com.amazonaws.services.servicecatalog.model.ListConstraintsForPortfolioRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListConstraintsForPortfolio operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ListConstraintsForPortfolioResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ListConstraintsForPortfolioRequest list-constraints-for-portfolio-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listConstraintsForPortfolioAsync list-constraints-for-portfolio-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ListConstraintsForPortfolioRequest list-constraints-for-portfolio-request]
    (-> this (.listConstraintsForPortfolioAsync list-constraints-for-portfolio-request))))

(defn scan-provisioned-products-async
  "Lists the provisioned products that are available (not terminated).


   To use additional filtering, see SearchProvisionedProducts.

  scan-provisioned-products-request - `com.amazonaws.services.servicecatalog.model.ScanProvisionedProductsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ScanProvisionedProducts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ScanProvisionedProductsResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ScanProvisionedProductsRequest scan-provisioned-products-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.scanProvisionedProductsAsync scan-provisioned-products-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ScanProvisionedProductsRequest scan-provisioned-products-request]
    (-> this (.scanProvisionedProductsAsync scan-provisioned-products-request))))

(defn disable-aws-organizations-access-async
  "Disable portfolio sharing through AWS Organizations feature. This feature will not delete your current shares but
   it will prevent you from creating new shares throughout your organization. Current shares will not be in sync
   with your organization structure if it changes after calling this API. This API can only be called by the master
   account in the organization.

  disable-aws-organizations-access-request - `com.amazonaws.services.servicecatalog.model.DisableAWSOrganizationsAccessRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableAWSOrganizationsAccess operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DisableAWSOrganizationsAccessResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DisableAWSOrganizationsAccessRequest disable-aws-organizations-access-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableAWSOrganizationsAccessAsync disable-aws-organizations-access-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DisableAWSOrganizationsAccessRequest disable-aws-organizations-access-request]
    (-> this (.disableAWSOrganizationsAccessAsync disable-aws-organizations-access-request))))

(defn describe-service-action-execution-parameters-async
  "describe-service-action-execution-parameters-request - `com.amazonaws.services.servicecatalog.model.DescribeServiceActionExecutionParametersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeServiceActionExecutionParameters operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DescribeServiceActionExecutionParametersResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DescribeServiceActionExecutionParametersRequest describe-service-action-execution-parameters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeServiceActionExecutionParametersAsync describe-service-action-execution-parameters-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DescribeServiceActionExecutionParametersRequest describe-service-action-execution-parameters-request]
    (-> this (.describeServiceActionExecutionParametersAsync describe-service-action-execution-parameters-request))))

(defn associate-budget-with-resource-async
  "Associates the specified budget with the specified resource.

  associate-budget-with-resource-request - `com.amazonaws.services.servicecatalog.model.AssociateBudgetWithResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateBudgetWithResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.AssociateBudgetWithResourceResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.AssociateBudgetWithResourceRequest associate-budget-with-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateBudgetWithResourceAsync associate-budget-with-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.AssociateBudgetWithResourceRequest associate-budget-with-resource-request]
    (-> this (.associateBudgetWithResourceAsync associate-budget-with-resource-request))))

(defn create-constraint-async
  "Creates a constraint.

  create-constraint-request - `com.amazonaws.services.servicecatalog.model.CreateConstraintRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateConstraint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.CreateConstraintResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.CreateConstraintRequest create-constraint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createConstraintAsync create-constraint-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.CreateConstraintRequest create-constraint-request]
    (-> this (.createConstraintAsync create-constraint-request))))

(defn list-provisioning-artifacts-async
  "Lists all provisioning artifacts (also known as versions) for the specified product.

  list-provisioning-artifacts-request - `com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListProvisioningArtifacts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsRequest list-provisioning-artifacts-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listProvisioningArtifactsAsync list-provisioning-artifacts-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsRequest list-provisioning-artifacts-request]
    (-> this (.listProvisioningArtifactsAsync list-provisioning-artifacts-request))))

(defn create-portfolio-async
  "Creates a portfolio.

  create-portfolio-request - `com.amazonaws.services.servicecatalog.model.CreatePortfolioRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePortfolio operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.CreatePortfolioResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.CreatePortfolioRequest create-portfolio-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPortfolioAsync create-portfolio-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.CreatePortfolioRequest create-portfolio-request]
    (-> this (.createPortfolioAsync create-portfolio-request))))

(defn update-constraint-async
  "Updates the specified constraint.

  update-constraint-request - `com.amazonaws.services.servicecatalog.model.UpdateConstraintRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateConstraint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.UpdateConstraintResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.UpdateConstraintRequest update-constraint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateConstraintAsync update-constraint-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.UpdateConstraintRequest update-constraint-request]
    (-> this (.updateConstraintAsync update-constraint-request))))

(defn list-provisioning-artifacts-for-service-action-async
  "Lists all provisioning artifacts (also known as versions) for the specified self-service action.

  list-provisioning-artifacts-for-service-action-request - `com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsForServiceActionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListProvisioningArtifactsForServiceAction operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsForServiceActionResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsForServiceActionRequest list-provisioning-artifacts-for-service-action-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listProvisioningArtifactsForServiceActionAsync list-provisioning-artifacts-for-service-action-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsForServiceActionRequest list-provisioning-artifacts-for-service-action-request]
    (-> this (.listProvisioningArtifactsForServiceActionAsync list-provisioning-artifacts-for-service-action-request))))

(defn batch-disassociate-service-action-from-provisioning-artifact-async
  "Disassociates a batch of self-service actions from the specified provisioning artifact.

  batch-disassociate-service-action-from-provisioning-artifact-request - `com.amazonaws.services.servicecatalog.model.BatchDisassociateServiceActionFromProvisioningArtifactRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDisassociateServiceActionFromProvisioningArtifact
           operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.BatchDisassociateServiceActionFromProvisioningArtifactResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.BatchDisassociateServiceActionFromProvisioningArtifactRequest batch-disassociate-service-action-from-provisioning-artifact-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDisassociateServiceActionFromProvisioningArtifactAsync batch-disassociate-service-action-from-provisioning-artifact-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.BatchDisassociateServiceActionFromProvisioningArtifactRequest batch-disassociate-service-action-from-provisioning-artifact-request]
    (-> this (.batchDisassociateServiceActionFromProvisioningArtifactAsync batch-disassociate-service-action-from-provisioning-artifact-request))))

(defn list-provisioned-product-plans-async
  "Lists the plans for the specified provisioned product or all plans to which the user has access.

  list-provisioned-product-plans-request - `com.amazonaws.services.servicecatalog.model.ListProvisionedProductPlansRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListProvisionedProductPlans operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ListProvisionedProductPlansResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ListProvisionedProductPlansRequest list-provisioned-product-plans-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listProvisionedProductPlansAsync list-provisioned-product-plans-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ListProvisionedProductPlansRequest list-provisioned-product-plans-request]
    (-> this (.listProvisionedProductPlansAsync list-provisioned-product-plans-request))))

(defn delete-product-async
  "Deletes the specified product.


   You cannot delete a product if it was shared with you or is associated with a portfolio.

  delete-product-request - `com.amazonaws.services.servicecatalog.model.DeleteProductRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteProduct operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DeleteProductResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DeleteProductRequest delete-product-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteProductAsync delete-product-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DeleteProductRequest delete-product-request]
    (-> this (.deleteProductAsync delete-product-request))))

(defn describe-provisioning-artifact-async
  "Gets information about the specified provisioning artifact (also known as a version) for the specified product.

  describe-provisioning-artifact-request - `com.amazonaws.services.servicecatalog.model.DescribeProvisioningArtifactRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeProvisioningArtifact operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DescribeProvisioningArtifactResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DescribeProvisioningArtifactRequest describe-provisioning-artifact-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeProvisioningArtifactAsync describe-provisioning-artifact-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DescribeProvisioningArtifactRequest describe-provisioning-artifact-request]
    (-> this (.describeProvisioningArtifactAsync describe-provisioning-artifact-request))))

(defn update-provisioned-product-async
  "Requests updates to the configuration of the specified provisioned product.


   If there are tags associated with the object, they cannot be updated or added. Depending on the specific updates
   requested, this operation can update with no interruption, with some interruption, or replace the provisioned
   product entirely.


   You can check the status of this request using DescribeRecord.

  update-provisioned-product-request - `com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateProvisionedProduct operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductRequest update-provisioned-product-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateProvisionedProductAsync update-provisioned-product-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductRequest update-provisioned-product-request]
    (-> this (.updateProvisionedProductAsync update-provisioned-product-request))))

(defn reject-portfolio-share-async
  "Rejects an offer to share the specified portfolio.

  reject-portfolio-share-request - `com.amazonaws.services.servicecatalog.model.RejectPortfolioShareRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RejectPortfolioShare operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.RejectPortfolioShareResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.RejectPortfolioShareRequest reject-portfolio-share-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rejectPortfolioShareAsync reject-portfolio-share-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.RejectPortfolioShareRequest reject-portfolio-share-request]
    (-> this (.rejectPortfolioShareAsync reject-portfolio-share-request))))

(defn delete-portfolio-async
  "Deletes the specified portfolio.


   You cannot delete a portfolio if it was shared with you or if it has associated products, users, constraints, or
   shared accounts.

  delete-portfolio-request - `com.amazonaws.services.servicecatalog.model.DeletePortfolioRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePortfolio operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DeletePortfolioResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DeletePortfolioRequest delete-portfolio-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePortfolioAsync delete-portfolio-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DeletePortfolioRequest delete-portfolio-request]
    (-> this (.deletePortfolioAsync delete-portfolio-request))))

(defn list-record-history-async
  "Lists the specified requests or all performed requests.

  list-record-history-request - `com.amazonaws.services.servicecatalog.model.ListRecordHistoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRecordHistory operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.ListRecordHistoryResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ListRecordHistoryRequest list-record-history-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRecordHistoryAsync list-record-history-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.ListRecordHistoryRequest list-record-history-request]
    (-> this (.listRecordHistoryAsync list-record-history-request))))

(defn disassociate-tag-option-from-resource-async
  "Disassociates the specified TagOption from the specified resource.

  disassociate-tag-option-from-resource-request - `com.amazonaws.services.servicecatalog.model.DisassociateTagOptionFromResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateTagOptionFromResource operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.DisassociateTagOptionFromResourceResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DisassociateTagOptionFromResourceRequest disassociate-tag-option-from-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateTagOptionFromResourceAsync disassociate-tag-option-from-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.DisassociateTagOptionFromResourceRequest disassociate-tag-option-from-resource-request]
    (-> this (.disassociateTagOptionFromResourceAsync disassociate-tag-option-from-resource-request))))

(defn update-product-async
  "Updates the specified product.

  update-product-request - `com.amazonaws.services.servicecatalog.model.UpdateProductRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateProduct operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.servicecatalog.model.UpdateProductResult>`"
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.UpdateProductRequest update-product-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateProductAsync update-product-request async-handler)))
  (^java.util.concurrent.Future [^AWSServiceCatalogAsync this ^com.amazonaws.services.servicecatalog.model.UpdateProductRequest update-product-request]
    (-> this (.updateProductAsync update-product-request))))

