package com.example.fnch_storybook.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.fnch_storybook.Component.ColorsUiKit
import com.example.fnch_storybook.R
import com.example.uikit.Avatars.UniversalAvatar
import com.example.uikit.Button.DestructiveSolidButton
import com.example.uikit.Button.PrimaryButton
import com.example.uikit.Button.SecondaryButton
import com.example.uikit.Cards.ApplicantDetailsCard
import com.example.uikit.Cards.ApplicantsCard
import com.example.uikit.Cards.CandidateCard
import com.example.uikit.Cards.VacanciesCard
import com.example.uikit.Cards.VacanciesMainCard
import com.example.uikit.Input.Checkboxes
import com.example.uikit.Input.InputFields
import com.example.uikit.Input.Select
import com.example.uikit.Navigation.CandidateProgress
import com.example.uikit.Navigation.TopAppBar
import com.example.uikit.Navigation.TopBarRef

import com.example.uikit.UI.Dimensions
import com.example.uikit.UI.FNCHTheme
import com.example.uikit.UI.SpacerH

@Composable
fun StoryBookScreen(

){
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(Dimensions.StoryBookSpacer)
    ) {

        item{

            Column() {
                TopAppBar(
                    title = "HR Design System",
                    painter = painterResource(R.drawable.hrmanage)
                ) { }

                SpacerH(Dimensions.LargePadding)

                Text("Typography & Colors",
                    style = FNCHTheme.typography.displayLarge ,
                    color = FNCHTheme.colors.primary,
                    modifier = Modifier.padding(horizontal = 20.dp)
                )

                SpacerH(Dimensions.MediumPadding)

                val list = listOf<ColorsUiKit>(
                    ColorsUiKit(color = FNCHTheme.colors.primary, nameColor = "Primary"),
                    ColorsUiKit(color = FNCHTheme.colors.secondary, nameColor = "Secondary"),
                    ColorsUiKit(color = FNCHTheme.colors.tertiary, nameColor = "Tertiary"),
                    ColorsUiKit(color = FNCHTheme.colors.error, nameColor = "Error"),
                    ColorsUiKit(color = FNCHTheme.colors.white, nameColor = "White"),
                    ColorsUiKit(color = FNCHTheme.colors.black, nameColor = "Black"),
                    ColorsUiKit(color = FNCHTheme.colors.grey, nameColor = "Grey"),
                    ColorsUiKit(color = FNCHTheme.colors.darkenWhite, nameColor = "darkenWhite"),
                )

                Column(Modifier.padding(horizontal = 20.dp)) {
                    FlowRow(
                        modifier = Modifier
                            .fillMaxWidth(),
                        maxItemsInEachRow = 4,
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        list.forEach { color ->
                            Column(
                                modifier = Modifier.weight(1f),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.spacedBy(4.dp)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(Dimensions.HeightButton)
                                        .clip(RoundedCornerShape(Dimensions.SmallRounded))
                                        .background(color.color)
                                )
                                Text(
                                    color.nameColor,
                                    style = FNCHTheme.typography.bodySmall,
                                    color = FNCHTheme.colors.secondary
                                )
                            }
                        }
                    }

                    SpacerH(Dimensions.ExtraLargePadding)

                    Column(
                        Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(Dimensions.LargeRounded))
                            .background(FNCHTheme.colors.grey)
                            .padding(Dimensions.ExtraMediumPadding),
                        verticalArrangement = Arrangement.spacedBy(Dimensions.SmallSpacer)
                    ) {

                        Text("Screen Header (24px)", style = FNCHTheme.typography.displayLarge)
                        Text("Subheader (18px)", style = FNCHTheme.typography.displayMedium)
                        Text("Body Medium (16px) - Modern Corporate clarity for HR professionals.", style = FNCHTheme.typography.bodyMedium)
                        Text("Body Small (14px) - Used for metadata and dense candidate information.", style = FNCHTheme.typography.bodySmall)
                        Text("Field Label (14px Bold)", style = FNCHTheme.typography.labelMedium)


                    }

                    SpacerH(Dimensions.ExtraSmallSpacer)

                    Text("Buttons",
                        style = FNCHTheme.typography.displayLarge ,
                        color = FNCHTheme.colors.primary,
                    )

                    SpacerH((Dimensions.ExtraMediumPadding))

                    Row(horizontalArrangement = Arrangement.spacedBy(Dimensions.ExtraMediumPadding) ) {
                        Box(modifier = Modifier.weight(Dimensions.defaultWeight)) {
                            PrimaryButton(
                                {}, "Primary Default", true
                            )
                        }

                        Box(modifier = Modifier.weight(Dimensions.defaultWeight)) {

                            PrimaryButton(
                                {}, "Primary Default", false
                            )
                        }

                    }

                    SpacerH((Dimensions.ExtraMediumPadding))

                    Row(horizontalArrangement = Arrangement.spacedBy(Dimensions.ExtraMediumPadding)) {

                        Box(modifier = Modifier.weight(Dimensions.defaultWeight)) {

                        }

                        Box(modifier = Modifier.weight(Dimensions.defaultWeight)) {

                            SecondaryButton({},"Secondary")
                        }
                    }

                    SpacerH((Dimensions.ExtraMediumPadding))

                    DestructiveSolidButton(
                        {},
                        "Destructive Solid"
                    )


                }

            }
        }

        item {

            Column(modifier = Modifier.padding(horizontal = Dimensions.DefaultSpacer)) {
                Text(
                    "Input Fields",
                    style = FNCHTheme.typography.displayLarge,
                    color = FNCHTheme.colors.primary,
                )

                SpacerH(Dimensions.ExtraMediumPadding)

                Column(verticalArrangement = Arrangement.spacedBy(Dimensions.LargePadding)) {
                    InputFields(
                        {},
                        "Enter text..",
                        "",
                        "Default Input"
                    )

                    InputFields(
                        {},
                        "",
                        "Active typing state",
                        "Focused State"
                    )

                    InputFields(
                        {},
                        "",
                        "Wrong data",
                        "Error State",
                        errorText = "Invalid input"
                    )

                    InputFields(
                        {},
                        "Cannot edit this",
                        "",
                        "Disabled Input",
                        isDisable = true
                    )

                    InputFields(
                        {},
                        "",
                        "is password",
                        "Password Field",
                        isPass = true
                    )

                    InputFields(
                        {},
                        "Search by title...",
                        "",
                        "Searching Field",
                        isSearch = true
                    )
                }

            }

        }

        item {
            Column(
                modifier = Modifier.padding(horizontal = Dimensions.DefaultSpacer)
            ) {

                Text(
                    "Select & Checkboxes",
                    style = FNCHTheme.typography.displayLarge,
                    color = FNCHTheme.colors.primary,
                )

                SpacerH(Dimensions.ExtraMediumPadding)

                Select({},"","Engineering",listOf("Engineering","Programmer","Developer"),"Select Department")

                SpacerH(Dimensions.LargePadding)

                Column(verticalArrangement = Arrangement.spacedBy(Dimensions.ExtraMediumPadding)) {

                    Checkboxes({},true)
                    Checkboxes({},false)
                    Checkboxes({},false, true)

                }
            }
        }

        item {
            Column(
                modifier = Modifier.padding(horizontal = Dimensions.DefaultSpacer)
            ) {

                Text(
                    "Cards",
                    style = FNCHTheme.typography.displayLarge,
                    color = FNCHTheme.colors.primary,
                )

                CandidateCard(
                    "Elena Rodriguez",
                    "Senior Product Designer",
                    painter = painterResource(R.drawable.elenaprof)
                )

                SpacerH(Dimensions.ExtraMediumPadding)

                VacanciesCard(
                    "Senior Product Designer",
                    "Product Team",
                    "Full-time",
                    "Active",
                    countApplication = 24,
                    120,160
                    ) { }

                SpacerH(Dimensions.ExtraMediumPadding)


                VacanciesMainCard(
                    "PD",
                    "Senior Product Designer",
                    "Product Team",
                    "Full-time",
                    24, 120,160
                    ) {
                }

                SpacerH(Dimensions.ExtraMediumPadding)

                ApplicantsCard(
                    "Alexander",
                    "Volkov",
                    "Senior Product",
                    "Интервью",
                    "San Francisco, CA",
                    "+1 415 555 0128",
                    painter = painterResource(R.drawable.alexprew)
                ) { }

                SpacerH(Dimensions.ExtraMediumPadding)

                ApplicantDetailsCard(
                    "Julian",
                    "Sterling",
                    "Senior Frontend Developer",
                    "Shortlisted",
                    "New York, NY",
                    "8 Years",
                    "Immediate"
                )


            }

        }

        item {
            Column(
                modifier = Modifier.padding(horizontal = Dimensions.DefaultSpacer)
            ) {

                Text(
                    "Avatars",
                    style = FNCHTheme.typography.displayLarge,
                    color = FNCHTheme.colors.primary,
                )

                SpacerH(Dimensions.ExtraMediumPadding)

                Row(
                    horizontalArrangement = Arrangement
                        .spacedBy(Dimensions.ExtraLargePadding)
                ) {

                    UniversalAvatar(
                        painter = painterResource(com.example.uikit.R.drawable.avatar),
                        state = true,
                        text = "Photo"

                    )

                    UniversalAvatar(
                        painter = null,
                        "JD",
                        true,
                        text = "Initials"
                    )



                }

                SpacerH(Dimensions.ExtraLargePadding)

                Text(
                    "Navigation & Feedback",
                    style = FNCHTheme.typography.displayLarge,
                    color = FNCHTheme.colors.primary,
                )

                SpacerH(Dimensions.MediumPadding)

                TopAppBar(
                    "HR Design System",
                    painterResource(com.example.uikit.R.drawable.avatar)
                ) {

                }

                SpacerH(Dimensions.ExtraMediumPadding)

                TopBarRef(
                    "HR Design System",
                    {},
                    {},
                    state = false,
                    painterResource(com.example.uikit.R.drawable.avatar)

                )
            }
        }

        item {
            Column(
                modifier = Modifier.padding(horizontal = Dimensions.DefaultSpacer)
            ) {

                CandidateProgress("Candidate Progress",2)

            }
        }
    }
}