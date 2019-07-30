(ns com.amazonaws.services.servicecatalog.AbstractAWSServiceCatalog
  "Abstract implementation of AWSServiceCatalog. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.servicecatalog AbstractAWSServiceCatalog]))

(defn create-portfolio-share
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.CreatePortfolioShareRequest`

  returns: Result of the CreatePortfolioShare operation returned by the service. - `com.amazonaws.services.servicecatalog.model.CreatePortfolioShareResult`"
  (^com.amazonaws.services.servicecatalog.model.CreatePortfolioShareResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.CreatePortfolioShareRequest request]
    (-> this (.createPortfolioShare request))))

(defn delete-provisioned-product-plan
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.DeleteProvisionedProductPlanRequest`

  returns: Result of the DeleteProvisionedProductPlan operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DeleteProvisionedProductPlanResult`"
  (^com.amazonaws.services.servicecatalog.model.DeleteProvisionedProductPlanResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DeleteProvisionedProductPlanRequest request]
    (-> this (.deleteProvisionedProductPlan request))))

(defn disable-aws-organizations-access
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.DisableAWSOrganizationsAccessRequest`

  returns: Result of the DisableAWSOrganizationsAccess operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DisableAWSOrganizationsAccessResult`"
  (^com.amazonaws.services.servicecatalog.model.DisableAWSOrganizationsAccessResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DisableAWSOrganizationsAccessRequest request]
    (-> this (.disableAWSOrganizationsAccess request))))

(defn list-tag-options
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.ListTagOptionsRequest`

  returns: Result of the ListTagOptions operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListTagOptionsResult`"
  (^com.amazonaws.services.servicecatalog.model.ListTagOptionsResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ListTagOptionsRequest request]
    (-> this (.listTagOptions request))))

(defn delete-service-action
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.DeleteServiceActionRequest`

  returns: Result of the DeleteServiceAction operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DeleteServiceActionResult`"
  (^com.amazonaws.services.servicecatalog.model.DeleteServiceActionResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DeleteServiceActionRequest request]
    (-> this (.deleteServiceAction request))))

(defn list-resources-for-tag-option
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.ListResourcesForTagOptionRequest`

  returns: Result of the ListResourcesForTagOption operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListResourcesForTagOptionResult`"
  (^com.amazonaws.services.servicecatalog.model.ListResourcesForTagOptionResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ListResourcesForTagOptionRequest request]
    (-> this (.listResourcesForTagOption request))))

(defn set-region
  "Description copied from interface: AWSServiceCatalog

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAWSServiceCatalog this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn create-constraint
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.CreateConstraintRequest`

  returns: Result of the CreateConstraint operation returned by the service. - `com.amazonaws.services.servicecatalog.model.CreateConstraintResult`"
  (^com.amazonaws.services.servicecatalog.model.CreateConstraintResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.CreateConstraintRequest request]
    (-> this (.createConstraint request))))

(defn delete-tag-option
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.DeleteTagOptionRequest`

  returns: Result of the DeleteTagOption operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DeleteTagOptionResult`"
  (^com.amazonaws.services.servicecatalog.model.DeleteTagOptionResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DeleteTagOptionRequest request]
    (-> this (.deleteTagOption request))))

(defn enable-aws-organizations-access
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.EnableAWSOrganizationsAccessRequest`

  returns: Result of the EnableAWSOrganizationsAccess operation returned by the service. - `com.amazonaws.services.servicecatalog.model.EnableAWSOrganizationsAccessResult`"
  (^com.amazonaws.services.servicecatalog.model.EnableAWSOrganizationsAccessResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.EnableAWSOrganizationsAccessRequest request]
    (-> this (.enableAWSOrganizationsAccess request))))

(defn describe-portfolio
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.DescribePortfolioRequest`

  returns: Result of the DescribePortfolio operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribePortfolioResult`"
  (^com.amazonaws.services.servicecatalog.model.DescribePortfolioResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DescribePortfolioRequest request]
    (-> this (.describePortfolio request))))

(defn delete-product
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.DeleteProductRequest`

  returns: Result of the DeleteProduct operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DeleteProductResult`"
  (^com.amazonaws.services.servicecatalog.model.DeleteProductResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DeleteProductRequest request]
    (-> this (.deleteProduct request))))

(defn search-products
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.SearchProductsRequest`

  returns: Result of the SearchProducts operation returned by the service. - `com.amazonaws.services.servicecatalog.model.SearchProductsResult`"
  (^com.amazonaws.services.servicecatalog.model.SearchProductsResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.SearchProductsRequest request]
    (-> this (.searchProducts request))))

(defn describe-portfolio-share-status
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.DescribePortfolioShareStatusRequest`

  returns: Result of the DescribePortfolioShareStatus operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribePortfolioShareStatusResult`"
  (^com.amazonaws.services.servicecatalog.model.DescribePortfolioShareStatusResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DescribePortfolioShareStatusRequest request]
    (-> this (.describePortfolioShareStatus request))))

(defn batch-disassociate-service-action-from-provisioning-artifact
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.BatchDisassociateServiceActionFromProvisioningArtifactRequest`

  returns: Result of the BatchDisassociateServiceActionFromProvisioningArtifact operation returned by the service. - `com.amazonaws.services.servicecatalog.model.BatchDisassociateServiceActionFromProvisioningArtifactResult`"
  (^com.amazonaws.services.servicecatalog.model.BatchDisassociateServiceActionFromProvisioningArtifactResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.BatchDisassociateServiceActionFromProvisioningArtifactRequest request]
    (-> this (.batchDisassociateServiceActionFromProvisioningArtifact request))))

(defn disassociate-service-action-from-provisioning-artifact
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.DisassociateServiceActionFromProvisioningArtifactRequest`

  returns: Result of the DisassociateServiceActionFromProvisioningArtifact operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DisassociateServiceActionFromProvisioningArtifactResult`"
  (^com.amazonaws.services.servicecatalog.model.DisassociateServiceActionFromProvisioningArtifactResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DisassociateServiceActionFromProvisioningArtifactRequest request]
    (-> this (.disassociateServiceActionFromProvisioningArtifact request))))

(defn reject-portfolio-share
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.RejectPortfolioShareRequest`

  returns: Result of the RejectPortfolioShare operation returned by the service. - `com.amazonaws.services.servicecatalog.model.RejectPortfolioShareResult`"
  (^com.amazonaws.services.servicecatalog.model.RejectPortfolioShareResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.RejectPortfolioShareRequest request]
    (-> this (.rejectPortfolioShare request))))

(defn associate-principal-with-portfolio
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.AssociatePrincipalWithPortfolioRequest`

  returns: Result of the AssociatePrincipalWithPortfolio operation returned by the service. - `com.amazonaws.services.servicecatalog.model.AssociatePrincipalWithPortfolioResult`"
  (^com.amazonaws.services.servicecatalog.model.AssociatePrincipalWithPortfolioResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.AssociatePrincipalWithPortfolioRequest request]
    (-> this (.associatePrincipalWithPortfolio request))))

(defn list-provisioning-artifacts
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsRequest`

  returns: Result of the ListProvisioningArtifacts operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsResult`"
  (^com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsRequest request]
    (-> this (.listProvisioningArtifacts request))))

(defn describe-tag-option
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.DescribeTagOptionRequest`

  returns: Result of the DescribeTagOption operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeTagOptionResult`"
  (^com.amazonaws.services.servicecatalog.model.DescribeTagOptionResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DescribeTagOptionRequest request]
    (-> this (.describeTagOption request))))

(defn associate-product-with-portfolio
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.AssociateProductWithPortfolioRequest`

  returns: Result of the AssociateProductWithPortfolio operation returned by the service. - `com.amazonaws.services.servicecatalog.model.AssociateProductWithPortfolioResult`"
  (^com.amazonaws.services.servicecatalog.model.AssociateProductWithPortfolioResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.AssociateProductWithPortfolioRequest request]
    (-> this (.associateProductWithPortfolio request))))

(defn update-constraint
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.UpdateConstraintRequest`

  returns: Result of the UpdateConstraint operation returned by the service. - `com.amazonaws.services.servicecatalog.model.UpdateConstraintResult`"
  (^com.amazonaws.services.servicecatalog.model.UpdateConstraintResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.UpdateConstraintRequest request]
    (-> this (.updateConstraint request))))

(defn list-accepted-portfolio-shares
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.ListAcceptedPortfolioSharesRequest`

  returns: Result of the ListAcceptedPortfolioShares operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListAcceptedPortfolioSharesResult`"
  (^com.amazonaws.services.servicecatalog.model.ListAcceptedPortfolioSharesResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ListAcceptedPortfolioSharesRequest request]
    (-> this (.listAcceptedPortfolioShares request))))

(defn describe-provisioning-artifact
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.DescribeProvisioningArtifactRequest`

  returns: Result of the DescribeProvisioningArtifact operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeProvisioningArtifactResult`"
  (^com.amazonaws.services.servicecatalog.model.DescribeProvisioningArtifactResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DescribeProvisioningArtifactRequest request]
    (-> this (.describeProvisioningArtifact request))))

(defn create-portfolio
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.CreatePortfolioRequest`

  returns: Result of the CreatePortfolio operation returned by the service. - `com.amazonaws.services.servicecatalog.model.CreatePortfolioResult`"
  (^com.amazonaws.services.servicecatalog.model.CreatePortfolioResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.CreatePortfolioRequest request]
    (-> this (.createPortfolio request))))

(defn describe-product-view
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.DescribeProductViewRequest`

  returns: Result of the DescribeProductView operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeProductViewResult`"
  (^com.amazonaws.services.servicecatalog.model.DescribeProductViewResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DescribeProductViewRequest request]
    (-> this (.describeProductView request))))

(defn terminate-provisioned-product
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.TerminateProvisionedProductRequest`

  returns: Result of the TerminateProvisionedProduct operation returned by the service. - `com.amazonaws.services.servicecatalog.model.TerminateProvisionedProductResult`"
  (^com.amazonaws.services.servicecatalog.model.TerminateProvisionedProductResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.TerminateProvisionedProductRequest request]
    (-> this (.terminateProvisionedProduct request))))

(defn execute-provisioned-product-plan
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductPlanRequest`

  returns: Result of the ExecuteProvisionedProductPlan operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductPlanResult`"
  (^com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductPlanResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductPlanRequest request]
    (-> this (.executeProvisionedProductPlan request))))

(defn list-provisioning-artifacts-for-service-action
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsForServiceActionRequest`

  returns: Result of the ListProvisioningArtifactsForServiceAction operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsForServiceActionResult`"
  (^com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsForServiceActionResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ListProvisioningArtifactsForServiceActionRequest request]
    (-> this (.listProvisioningArtifactsForServiceAction request))))

(defn create-provisioned-product-plan
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.CreateProvisionedProductPlanRequest`

  returns: Result of the CreateProvisionedProductPlan operation returned by the service. - `com.amazonaws.services.servicecatalog.model.CreateProvisionedProductPlanResult`"
  (^com.amazonaws.services.servicecatalog.model.CreateProvisionedProductPlanResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.CreateProvisionedProductPlanRequest request]
    (-> this (.createProvisionedProductPlan request))))

(defn accept-portfolio-share
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.AcceptPortfolioShareRequest`

  returns: Result of the AcceptPortfolioShare operation returned by the service. - `com.amazonaws.services.servicecatalog.model.AcceptPortfolioShareResult`"
  (^com.amazonaws.services.servicecatalog.model.AcceptPortfolioShareResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.AcceptPortfolioShareRequest request]
    (-> this (.acceptPortfolioShare request))))

(defn update-provisioned-product
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductRequest`

  returns: Result of the UpdateProvisionedProduct operation returned by the service. - `com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductResult`"
  (^com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductRequest request]
    (-> this (.updateProvisionedProduct request))))

(defn update-portfolio
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.UpdatePortfolioRequest`

  returns: Result of the UpdatePortfolio operation returned by the service. - `com.amazonaws.services.servicecatalog.model.UpdatePortfolioResult`"
  (^com.amazonaws.services.servicecatalog.model.UpdatePortfolioResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.UpdatePortfolioRequest request]
    (-> this (.updatePortfolio request))))

(defn update-provisioning-artifact
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.UpdateProvisioningArtifactRequest`

  returns: Result of the UpdateProvisioningArtifact operation returned by the service. - `com.amazonaws.services.servicecatalog.model.UpdateProvisioningArtifactResult`"
  (^com.amazonaws.services.servicecatalog.model.UpdateProvisioningArtifactResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.UpdateProvisioningArtifactRequest request]
    (-> this (.updateProvisioningArtifact request))))

(defn disassociate-budget-from-resource
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.DisassociateBudgetFromResourceRequest`

  returns: Result of the DisassociateBudgetFromResource operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DisassociateBudgetFromResourceResult`"
  (^com.amazonaws.services.servicecatalog.model.DisassociateBudgetFromResourceResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DisassociateBudgetFromResourceRequest request]
    (-> this (.disassociateBudgetFromResource request))))

(defn describe-product
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.DescribeProductRequest`

  returns: Result of the DescribeProduct operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeProductResult`"
  (^com.amazonaws.services.servicecatalog.model.DescribeProductResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DescribeProductRequest request]
    (-> this (.describeProduct request))))

(defn update-provisioned-product-properties
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductPropertiesRequest`

  returns: Result of the UpdateProvisionedProductProperties operation returned by the service. - `com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductPropertiesResult`"
  (^com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductPropertiesResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.UpdateProvisionedProductPropertiesRequest request]
    (-> this (.updateProvisionedProductProperties request))))

(defn describe-copy-product-status
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.DescribeCopyProductStatusRequest`

  returns: Result of the DescribeCopyProductStatus operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeCopyProductStatusResult`"
  (^com.amazonaws.services.servicecatalog.model.DescribeCopyProductStatusResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DescribeCopyProductStatusRequest request]
    (-> this (.describeCopyProductStatus request))))

(defn create-tag-option
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.CreateTagOptionRequest`

  returns: Result of the CreateTagOption operation returned by the service. - `com.amazonaws.services.servicecatalog.model.CreateTagOptionResult`"
  (^com.amazonaws.services.servicecatalog.model.CreateTagOptionResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.CreateTagOptionRequest request]
    (-> this (.createTagOption request))))

(defn create-provisioning-artifact
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.CreateProvisioningArtifactRequest`

  returns: Result of the CreateProvisioningArtifact operation returned by the service. - `com.amazonaws.services.servicecatalog.model.CreateProvisioningArtifactResult`"
  (^com.amazonaws.services.servicecatalog.model.CreateProvisioningArtifactResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.CreateProvisioningArtifactRequest request]
    (-> this (.createProvisioningArtifact request))))

(defn describe-provisioning-parameters
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.DescribeProvisioningParametersRequest`

  returns: Result of the DescribeProvisioningParameters operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeProvisioningParametersResult`"
  (^com.amazonaws.services.servicecatalog.model.DescribeProvisioningParametersResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DescribeProvisioningParametersRequest request]
    (-> this (.describeProvisioningParameters request))))

(defn list-constraints-for-portfolio
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.ListConstraintsForPortfolioRequest`

  returns: Result of the ListConstraintsForPortfolio operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListConstraintsForPortfolioResult`"
  (^com.amazonaws.services.servicecatalog.model.ListConstraintsForPortfolioResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ListConstraintsForPortfolioRequest request]
    (-> this (.listConstraintsForPortfolio request))))

(defn shutdown
  "Description copied from interface: AWSServiceCatalog"
  ([^AbstractAWSServiceCatalog this]
    (-> this (.shutdown))))

(defn list-provisioned-product-plans
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.ListProvisionedProductPlansRequest`

  returns: Result of the ListProvisionedProductPlans operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListProvisionedProductPlansResult`"
  (^com.amazonaws.services.servicecatalog.model.ListProvisionedProductPlansResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ListProvisionedProductPlansRequest request]
    (-> this (.listProvisionedProductPlans request))))

(defn associate-service-action-with-provisioning-artifact
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.AssociateServiceActionWithProvisioningArtifactRequest`

  returns: Result of the AssociateServiceActionWithProvisioningArtifact operation returned by the service. - `com.amazonaws.services.servicecatalog.model.AssociateServiceActionWithProvisioningArtifactResult`"
  (^com.amazonaws.services.servicecatalog.model.AssociateServiceActionWithProvisioningArtifactResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.AssociateServiceActionWithProvisioningArtifactRequest request]
    (-> this (.associateServiceActionWithProvisioningArtifact request))))

(defn list-portfolio-access
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.ListPortfolioAccessRequest`

  returns: Result of the ListPortfolioAccess operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListPortfolioAccessResult`"
  (^com.amazonaws.services.servicecatalog.model.ListPortfolioAccessResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ListPortfolioAccessRequest request]
    (-> this (.listPortfolioAccess request))))

(defn search-products-as-admin
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.SearchProductsAsAdminRequest`

  returns: Result of the SearchProductsAsAdmin operation returned by the service. - `com.amazonaws.services.servicecatalog.model.SearchProductsAsAdminResult`"
  (^com.amazonaws.services.servicecatalog.model.SearchProductsAsAdminResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.SearchProductsAsAdminRequest request]
    (-> this (.searchProductsAsAdmin request))))

(defn disassociate-product-from-portfolio
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.DisassociateProductFromPortfolioRequest`

  returns: Result of the DisassociateProductFromPortfolio operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DisassociateProductFromPortfolioResult`"
  (^com.amazonaws.services.servicecatalog.model.DisassociateProductFromPortfolioResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DisassociateProductFromPortfolioRequest request]
    (-> this (.disassociateProductFromPortfolio request))))

(defn update-product
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.UpdateProductRequest`

  returns: Result of the UpdateProduct operation returned by the service. - `com.amazonaws.services.servicecatalog.model.UpdateProductResult`"
  (^com.amazonaws.services.servicecatalog.model.UpdateProductResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.UpdateProductRequest request]
    (-> this (.updateProduct request))))

(defn describe-service-action
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.DescribeServiceActionRequest`

  returns: Result of the DescribeServiceAction operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeServiceActionResult`"
  (^com.amazonaws.services.servicecatalog.model.DescribeServiceActionResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DescribeServiceActionRequest request]
    (-> this (.describeServiceAction request))))

(defn scan-provisioned-products
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.ScanProvisionedProductsRequest`

  returns: Result of the ScanProvisionedProducts operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ScanProvisionedProductsResult`"
  (^com.amazonaws.services.servicecatalog.model.ScanProvisionedProductsResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ScanProvisionedProductsRequest request]
    (-> this (.scanProvisionedProducts request))))

(defn set-endpoint
  "Description copied from interface: AWSServiceCatalog

  endpoint - The endpoint (ex: \"servicecatalog.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"servicecatalog.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAWSServiceCatalog this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn describe-constraint
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.DescribeConstraintRequest`

  returns: Result of the DescribeConstraint operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeConstraintResult`"
  (^com.amazonaws.services.servicecatalog.model.DescribeConstraintResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DescribeConstraintRequest request]
    (-> this (.describeConstraint request))))

(defn describe-provisioned-product
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductRequest`

  returns: Result of the DescribeProvisionedProduct operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductResult`"
  (^com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductRequest request]
    (-> this (.describeProvisionedProduct request))))

(defn update-tag-option
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.UpdateTagOptionRequest`

  returns: Result of the UpdateTagOption operation returned by the service. - `com.amazonaws.services.servicecatalog.model.UpdateTagOptionResult`"
  (^com.amazonaws.services.servicecatalog.model.UpdateTagOptionResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.UpdateTagOptionRequest request]
    (-> this (.updateTagOption request))))

(defn list-principals-for-portfolio
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.ListPrincipalsForPortfolioRequest`

  returns: Result of the ListPrincipalsForPortfolio operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListPrincipalsForPortfolioResult`"
  (^com.amazonaws.services.servicecatalog.model.ListPrincipalsForPortfolioResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ListPrincipalsForPortfolioRequest request]
    (-> this (.listPrincipalsForPortfolio request))))

(defn delete-constraint
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.DeleteConstraintRequest`

  returns: Result of the DeleteConstraint operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DeleteConstraintResult`"
  (^com.amazonaws.services.servicecatalog.model.DeleteConstraintResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DeleteConstraintRequest request]
    (-> this (.deleteConstraint request))))

(defn execute-provisioned-product-service-action
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductServiceActionRequest`

  returns: Result of the ExecuteProvisionedProductServiceAction operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductServiceActionResult`"
  (^com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductServiceActionResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ExecuteProvisionedProductServiceActionRequest request]
    (-> this (.executeProvisionedProductServiceAction request))))

(defn create-product
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.CreateProductRequest`

  returns: Result of the CreateProduct operation returned by the service. - `com.amazonaws.services.servicecatalog.model.CreateProductResult`"
  (^com.amazonaws.services.servicecatalog.model.CreateProductResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.CreateProductRequest request]
    (-> this (.createProduct request))))

(defn list-record-history
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.ListRecordHistoryRequest`

  returns: Result of the ListRecordHistory operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListRecordHistoryResult`"
  (^com.amazonaws.services.servicecatalog.model.ListRecordHistoryResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ListRecordHistoryRequest request]
    (-> this (.listRecordHistory request))))

(defn list-budgets-for-resource
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.ListBudgetsForResourceRequest`

  returns: Result of the ListBudgetsForResource operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListBudgetsForResourceResult`"
  (^com.amazonaws.services.servicecatalog.model.ListBudgetsForResourceResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ListBudgetsForResourceRequest request]
    (-> this (.listBudgetsForResource request))))

(defn copy-product
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.CopyProductRequest`

  returns: Result of the CopyProduct operation returned by the service. - `com.amazonaws.services.servicecatalog.model.CopyProductResult`"
  (^com.amazonaws.services.servicecatalog.model.CopyProductResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.CopyProductRequest request]
    (-> this (.copyProduct request))))

(defn list-service-actions-for-provisioning-artifact
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.ListServiceActionsForProvisioningArtifactRequest`

  returns: Result of the ListServiceActionsForProvisioningArtifact operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListServiceActionsForProvisioningArtifactResult`"
  (^com.amazonaws.services.servicecatalog.model.ListServiceActionsForProvisioningArtifactResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ListServiceActionsForProvisioningArtifactRequest request]
    (-> this (.listServiceActionsForProvisioningArtifact request))))

(defn describe-product-as-admin
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.DescribeProductAsAdminRequest`

  returns: Result of the DescribeProductAsAdmin operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeProductAsAdminResult`"
  (^com.amazonaws.services.servicecatalog.model.DescribeProductAsAdminResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DescribeProductAsAdminRequest request]
    (-> this (.describeProductAsAdmin request))))

(defn disassociate-tag-option-from-resource
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.DisassociateTagOptionFromResourceRequest`

  returns: Result of the DisassociateTagOptionFromResource operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DisassociateTagOptionFromResourceResult`"
  (^com.amazonaws.services.servicecatalog.model.DisassociateTagOptionFromResourceResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DisassociateTagOptionFromResourceRequest request]
    (-> this (.disassociateTagOptionFromResource request))))

(defn describe-record
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.DescribeRecordRequest`

  returns: Result of the DescribeRecord operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeRecordResult`"
  (^com.amazonaws.services.servicecatalog.model.DescribeRecordResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DescribeRecordRequest request]
    (-> this (.describeRecord request))))

(defn delete-portfolio-share
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.DeletePortfolioShareRequest`

  returns: Result of the DeletePortfolioShare operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DeletePortfolioShareResult`"
  (^com.amazonaws.services.servicecatalog.model.DeletePortfolioShareResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DeletePortfolioShareRequest request]
    (-> this (.deletePortfolioShare request))))

(defn search-provisioned-products
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.SearchProvisionedProductsRequest`

  returns: Result of the SearchProvisionedProducts operation returned by the service. - `com.amazonaws.services.servicecatalog.model.SearchProvisionedProductsResult`"
  (^com.amazonaws.services.servicecatalog.model.SearchProvisionedProductsResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.SearchProvisionedProductsRequest request]
    (-> this (.searchProvisionedProducts request))))

(defn list-organization-portfolio-access
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.ListOrganizationPortfolioAccessRequest`

  returns: Result of the ListOrganizationPortfolioAccess operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListOrganizationPortfolioAccessResult`"
  (^com.amazonaws.services.servicecatalog.model.ListOrganizationPortfolioAccessResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ListOrganizationPortfolioAccessRequest request]
    (-> this (.listOrganizationPortfolioAccess request))))

(defn describe-service-action-execution-parameters
  "request - `com.amazonaws.services.servicecatalog.model.DescribeServiceActionExecutionParametersRequest`

  returns: Result of the DescribeServiceActionExecutionParameters operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeServiceActionExecutionParametersResult`"
  (^com.amazonaws.services.servicecatalog.model.DescribeServiceActionExecutionParametersResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DescribeServiceActionExecutionParametersRequest request]
    (-> this (.describeServiceActionExecutionParameters request))))

(defn create-service-action
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.CreateServiceActionRequest`

  returns: Result of the CreateServiceAction operation returned by the service. - `com.amazonaws.services.servicecatalog.model.CreateServiceActionResult`"
  (^com.amazonaws.services.servicecatalog.model.CreateServiceActionResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.CreateServiceActionRequest request]
    (-> this (.createServiceAction request))))

(defn list-portfolios-for-product
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.ListPortfoliosForProductRequest`

  returns: Result of the ListPortfoliosForProduct operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListPortfoliosForProductResult`"
  (^com.amazonaws.services.servicecatalog.model.ListPortfoliosForProductResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ListPortfoliosForProductRequest request]
    (-> this (.listPortfoliosForProduct request))))

(defn list-stack-instances-for-provisioned-product
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.ListStackInstancesForProvisionedProductRequest`

  returns: Result of the ListStackInstancesForProvisionedProduct operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListStackInstancesForProvisionedProductResult`"
  (^com.amazonaws.services.servicecatalog.model.ListStackInstancesForProvisionedProductResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ListStackInstancesForProvisionedProductRequest request]
    (-> this (.listStackInstancesForProvisionedProduct request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSServiceCatalog

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSServiceCatalog this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-launch-paths
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.ListLaunchPathsRequest`

  returns: Result of the ListLaunchPaths operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListLaunchPathsResult`"
  (^com.amazonaws.services.servicecatalog.model.ListLaunchPathsResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ListLaunchPathsRequest request]
    (-> this (.listLaunchPaths request))))

(defn list-service-actions
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.ListServiceActionsRequest`

  returns: Result of the ListServiceActions operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListServiceActionsResult`"
  (^com.amazonaws.services.servicecatalog.model.ListServiceActionsResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ListServiceActionsRequest request]
    (-> this (.listServiceActions request))))

(defn delete-provisioning-artifact
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.DeleteProvisioningArtifactRequest`

  returns: Result of the DeleteProvisioningArtifact operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DeleteProvisioningArtifactResult`"
  (^com.amazonaws.services.servicecatalog.model.DeleteProvisioningArtifactResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DeleteProvisioningArtifactRequest request]
    (-> this (.deleteProvisioningArtifact request))))

(defn list-portfolios
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.ListPortfoliosRequest`

  returns: Result of the ListPortfolios operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ListPortfoliosResult`"
  (^com.amazonaws.services.servicecatalog.model.ListPortfoliosResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ListPortfoliosRequest request]
    (-> this (.listPortfolios request))))

(defn batch-associate-service-action-with-provisioning-artifact
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.BatchAssociateServiceActionWithProvisioningArtifactRequest`

  returns: Result of the BatchAssociateServiceActionWithProvisioningArtifact operation returned by the service. - `com.amazonaws.services.servicecatalog.model.BatchAssociateServiceActionWithProvisioningArtifactResult`"
  (^com.amazonaws.services.servicecatalog.model.BatchAssociateServiceActionWithProvisioningArtifactResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.BatchAssociateServiceActionWithProvisioningArtifactRequest request]
    (-> this (.batchAssociateServiceActionWithProvisioningArtifact request))))

(defn update-service-action
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.UpdateServiceActionRequest`

  returns: Result of the UpdateServiceAction operation returned by the service. - `com.amazonaws.services.servicecatalog.model.UpdateServiceActionResult`"
  (^com.amazonaws.services.servicecatalog.model.UpdateServiceActionResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.UpdateServiceActionRequest request]
    (-> this (.updateServiceAction request))))

(defn delete-portfolio
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.DeletePortfolioRequest`

  returns: Result of the DeletePortfolio operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DeletePortfolioResult`"
  (^com.amazonaws.services.servicecatalog.model.DeletePortfolioResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DeletePortfolioRequest request]
    (-> this (.deletePortfolio request))))

(defn get-aws-organizations-access-status
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.GetAWSOrganizationsAccessStatusRequest`

  returns: Result of the GetAWSOrganizationsAccessStatus operation returned by the service. - `com.amazonaws.services.servicecatalog.model.GetAWSOrganizationsAccessStatusResult`"
  (^com.amazonaws.services.servicecatalog.model.GetAWSOrganizationsAccessStatusResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.GetAWSOrganizationsAccessStatusRequest request]
    (-> this (.getAWSOrganizationsAccessStatus request))))

(defn describe-provisioned-product-plan
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductPlanRequest`

  returns: Result of the DescribeProvisionedProductPlan operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductPlanResult`"
  (^com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductPlanResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DescribeProvisionedProductPlanRequest request]
    (-> this (.describeProvisionedProductPlan request))))

(defn associate-tag-option-with-resource
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.AssociateTagOptionWithResourceRequest`

  returns: Result of the AssociateTagOptionWithResource operation returned by the service. - `com.amazonaws.services.servicecatalog.model.AssociateTagOptionWithResourceResult`"
  (^com.amazonaws.services.servicecatalog.model.AssociateTagOptionWithResourceResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.AssociateTagOptionWithResourceRequest request]
    (-> this (.associateTagOptionWithResource request))))

(defn disassociate-principal-from-portfolio
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.DisassociatePrincipalFromPortfolioRequest`

  returns: Result of the DisassociatePrincipalFromPortfolio operation returned by the service. - `com.amazonaws.services.servicecatalog.model.DisassociatePrincipalFromPortfolioResult`"
  (^com.amazonaws.services.servicecatalog.model.DisassociatePrincipalFromPortfolioResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.DisassociatePrincipalFromPortfolioRequest request]
    (-> this (.disassociatePrincipalFromPortfolio request))))

(defn associate-budget-with-resource
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.AssociateBudgetWithResourceRequest`

  returns: Result of the AssociateBudgetWithResource operation returned by the service. - `com.amazonaws.services.servicecatalog.model.AssociateBudgetWithResourceResult`"
  (^com.amazonaws.services.servicecatalog.model.AssociateBudgetWithResourceResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.AssociateBudgetWithResourceRequest request]
    (-> this (.associateBudgetWithResource request))))

(defn provision-product
  "Description copied from interface: AWSServiceCatalog

  request - `com.amazonaws.services.servicecatalog.model.ProvisionProductRequest`

  returns: Result of the ProvisionProduct operation returned by the service. - `com.amazonaws.services.servicecatalog.model.ProvisionProductResult`"
  (^com.amazonaws.services.servicecatalog.model.ProvisionProductResult [^AbstractAWSServiceCatalog this ^com.amazonaws.services.servicecatalog.model.ProvisionProductRequest request]
    (-> this (.provisionProduct request))))

